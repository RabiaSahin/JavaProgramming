package day43_Abstraction.employeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        //Person person = new Person("Josh", 35, 'M');
        //Employee employee = new Employee("Ali",30,'M',42,"SDET",145000.00);

        Tester tester = new Tester("Ali",30,'M',42,"SDET",145000.00);
        Developer developer = new Developer("Alex",28,'M',32,"Web Developer",155000.00);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver = new Driver("Jhon",34,'M',42,"Lyft Driver",75000.00);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        /*Employee{name=Ali, age=30, gender=M, id=42, jobTitle='SDET', salary=145000.0}
        Employee{name=Alex, age=28, gender=M, id=32, jobTitle='Web Developer', salary=155000.0}
        Employee{name=Angel, age=28, gender=F, id=22, jobTitle='English Teacher', salary=85000.0}
        Employee{name=Jhon, age=34, gender=M, id=42, jobTitle='Lyft Driver', salary=75000.0}
*/

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        /*Ali is testing the application
        Ali sleeps 8 hours
        Ali is creating bug reports
        Ali is eating baklava*/

        System.out.println("-----------------------------------");

        developer.work();
        developer.sleep();
        // developer.bugReport();
        developer.eat();
        developer.unitTest();

        /*Alex is developing application
        Alex sleeps 6 hours
        Alex is eating baklava
        Alex is unit testing
*/

        System.out.println("-----------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();

        /*Angel is teaching.
        Angel is slepping 8 hours.
        Angel is eating baklava*/



    }
}
