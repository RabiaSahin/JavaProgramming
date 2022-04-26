package day38_Inheritance.day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Developer developer = new Developer("Korkmaz", 29, 'M', 1, "Java Developer", 125000);

        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);

        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 100000);

        Student student = new Student("Suhaib", 30, 'M', 8, "SDET" );


        System.out.println(developer);
        // Employee{name='Korkmaz', age=29, gender=M, employeeID=1, jobTitle='Java Developer', salary=125000.0}
        System.out.println(tester);
        // Employee{name='Olga', age=27, gender=F, employeeID=2, jobTitle='SDET', salary=110000.0}
        System.out.println(teacher);
        // Employee{name='Daniel', age=32, gender=M, employeeID=3, jobTitle='Math Teacher', salary=100000.0}
        System.out.println(student);
        // Student{name='Suhaib', age=30, gender=M, studentId=8, fieldOfStudy='SDET'}

        // Developer, Tester and Teacher take the toString from Employee class
        // Student takes the toString from Student class

        System.out.println("-----------------------------------------------------------------");

        developer.setAge(39);

        System.out.println(developer.getAge()); // 39

        System.out.println(developer);
        // Employee{name='Korkmaz', age=39, gender=M, employeeID=1, jobTitle='Java Developer', salary=125000.0}

        System.out.println("-----------------------------------------------------------------");

        developer.work(); // Java Developer Korkmaz is developing the application
        tester.work(); // SDET Olga is testing the application
        teacher.work(); // Math Teacher Daniel is teaching
        //  student.work();

        System.out.println("------------------------------------------------------------");

        developer.eat(); // Korkmaz is eating
        developer.drink(); // Korkmaz is drinking
        developer.sleep(); // Korkmaz is sleeping

        developer.fixingBugs(); // Java Developer Korkmaz is fixing the bug

        System.out.println("------------------------------------------------------------");

        tester.eat();
        tester.drink();
        tester.sleep();

        // tester.fixingBugs(); // this is reaction for developer
        tester.createTicket();

        System.out.println("------------------------------------------------------------");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        // teacher.fixingBugs(); // this is reaction for developer
        //  teacher.createTicket(); // this is reaction for tester

        System.out.println("------------------------------------------------------------");

        student.eat();
        student.drink();
        student.sleep();

        // student.fixingBugs();
        // student.createTicket();
        student.study();

    }
}
