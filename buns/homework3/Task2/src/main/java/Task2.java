import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import test.entity.Department;
import test.entity.Employee;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

            Scanner data = new Scanner(System.in);
            System.out.println("Введите название отдела :");
            String departmentName = data.nextLine();
            System.out.println("Введите минимальную зп отдела :");
            int minSalary = data.nextInt();
            System.out.println("Введите максимальную зп отдела :");
            int maxSalary = data.nextInt();
            Department department = new Department(departmentName, minSalary, maxSalary);

            Scanner emp = new Scanner(System.in);
            System.out.println("Введите имя работника1 :");
            String name = emp.nextLine();
            System.out.println("Введите фамилию работника1 :");
            String surname = emp.nextLine();
            System.out.println("Введите зп работника1 :");
            int salary = emp.nextInt();
            Employee employee = new Employee(name, surname, salary);

            Scanner emp1 = new Scanner(System.in);
            System.out.println("Введите имя работника2 :");
            String name1 = emp1.nextLine();
            System.out.println("Введите фамилию работника2 :");
            String surname1 = emp1.nextLine();
            System.out.println("Введите зп работника2 :");
            int salary1 = emp1.nextInt();
            Employee employee1 = new Employee(name1, surname1, salary1);

            Scanner emp2 = new Scanner(System.in);
            System.out.println("Введите имя работника3 :");
            String name2 = emp2.nextLine();
            System.out.println("Введите фамилию работника3 :");
            String surname2 = emp2.nextLine();
            System.out.println("Введите зп работника3 :");
            int salary2 = emp2.nextInt();
            Employee employee2 = new Employee(name2, surname2, salary2);

            department.addEmployeeToDepartment(employee);
            department.addEmployeeToDepartment(employee1);
            department.addEmployeeToDepartment(employee2);

            session.beginTransaction();

            Scanner id = new Scanner(System.in);
            System.out.println("Введите id работника для поиска");
            int ID = id.nextInt();
            Employee findEmployee = session.get(Employee.class, ID);
            System.out.println(findEmployee);
            System.out.println(findEmployee.getDepartment());

            Scanner iD = new Scanner(System.in);
            System.out.println("Введите id работника для удоления :");
            int id1 = iD.nextInt();
            Employee removeEmployee = session.get(Employee.class, id1);
            session.delete(removeEmployee);

            session.persist(department);
            session.getTransaction().commit();
            System.out.println("DONE!");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
