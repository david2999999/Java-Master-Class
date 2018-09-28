package Lambda.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from the runnable");
//            }
//        }).start();

//        new Thread(() -> System.out.println("Printing from the runnable")).start();

//        new Thread(() -> {
//            System.out.println("Printing from the runnable");
//            System.out.println("Line 2");
//            System.out.println("Line 3");
//        }).start();

        Employee Dav = new Employee("Dav", 30);
        Employee Jim = new Employee("Jim", 21);
        Employee Jac = new Employee("Jac",12);
        Employee Snow = new Employee("Snow", 22);

        List<Employee> employees = new ArrayList<>();

        employees.add(Dav);
        employees.add(Jim);
        employees.add(Jac);
        employees.add(Snow);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

//        Collections.sort(employees, (emp1, emp2) ->
//                    emp1.getName().compareTo(emp2.getName()));

        Collections.sort(employees, Comparator.comparing(Employee::getName));

        for (Employee employee: employees) {
            System.out.println(employee.getName());
        }
    }
}
