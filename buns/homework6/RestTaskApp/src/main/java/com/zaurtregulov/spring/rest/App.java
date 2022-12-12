package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args ) {
    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(MyConfig.class);
    Communication commucation = context.getBean("communication", Communication.class);

        List<Employee> allEmployees = commucation.getAllEmployees();
        System.out.println(allEmployees);

        Scanner id = new Scanner(System.in);
        System.out.println("Введите id для поиска");
        int findID = id.nextInt();
        Employee empByID = commucation.getEmployee(findID);
        System.out.println(empByID);

        Scanner idSearch = new Scanner(System.in);
        System.out.println("Введите id для создания или редактирования работника");
        int search = idSearch.nextInt();


            Scanner employee = new Scanner(System.in);
            System.out.println("Введите имя работника");
            String name = employee.nextLine();
            System.out.println("Введите фамилию работника");
            String surname = employee.nextLine();
            System.out.println("Введите департамент работника");
            String department = employee.nextLine();
            System.out.println("Введите зарплату работника");
            int salary = employee.nextInt();
            Employee emp = new Employee(name, surname, department, salary);

         if(search==0) {
             commucation.saveEmployee(emp);
         }
         else if(search != 0) {
             Scanner ID = new Scanner(System.in);
             System.out.println("Введите id для проверки обновления данных");
             int searchID = id.nextInt();
             emp.setId(searchID);
             commucation.saveEmployee(emp);
         }

        Scanner dId = new Scanner(System.in);
        System.out.println("Введите id для удаления работника");
        int deleteID = dId.nextInt();
         commucation.deleteEmployee(deleteID);

        }
    }
