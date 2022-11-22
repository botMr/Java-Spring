import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import test.entity.Detail;
import test.entity.Employee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя :");
            String name = in.nextLine();
            System.out.println("Введите фамилия :");
            String surname = in.nextLine();
            System.out.println("Введите департамент :");
            String department = in.nextLine();
            System.out.println("Введите зарплату :");
            int salary = in.nextInt();
            Employee employee = new Employee(name,surname,department,salary);
            Scanner data = new Scanner(System.in);
            System.out.println("Введите свой город :");
            String city = data.nextLine();
            System.out.println("Введите свой номер :");
            String phoneNumber = data.nextLine();
            System.out.println("Введите свою почту :");
            String email = data.nextLine();
            Detail detail = new Detail(city,phoneNumber,email);
            employee.setEmpDetail(detail);
            detail.setEmployee(employee);
            session.beginTransaction();
             session.save(detail);
             Scanner id = new Scanner(System.in);
             System.out.println("Введите id :");
             int ID = id.nextInt();
             Detail detail1 = session.get(Detail.class, ID);
             System.out.println(detail1.getEmployee());
             Scanner num = new Scanner(System.in);
            System.out.println("Введите id для удаления :");
            int Num = num.nextInt();
            Detail detail2 = session.get(Detail.class, Num);
            detail2.getEmployee().setEmpDetail(null);
            session.delete(detail2);
             session.getTransaction().commit();
             System.out.println("DONE!");
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
