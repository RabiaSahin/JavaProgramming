package day35_Encapsulation.Encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tahir", 'M', 30, 120000);

        employee1.setAge(32);


        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);
        employee2.setName("Elvira");
        employee2.setSalary( employee2.getSalary() + 15000 );

        System.out.println(employee1); // Employee{name='Tahir', gender=M, age=32, salary=120000.0}
        System.out.println(employee2); // Employee{name='Elvira', gender=F, age=31, salary=130000.0}

        Employee employee3 = new Employee("Ayse", 'Q', 30, 0);
        System.out.println(employee3); // Employee{name='Ayse', gender= , age=30, salary=0.0}

    }
}
