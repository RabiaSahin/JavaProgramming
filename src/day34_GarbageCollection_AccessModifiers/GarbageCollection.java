package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {
        /*
        //  int n = null; // it can not assign primitive data
       String str = null; // null can be assign only the non-primitive data (all default value)
        System.out.println( str.toUpperCase() );
         null oldugu icin String method ile yazdirmaya calisinca NullPointerException hatasi veriyor
         String str = ""; empty yaptigimizda ise hata vermiyor. becaouse "" empty string is an object
         but null is not.

         */

        // 0 exist the value but null is not exist the value

        String str = "Wooden Spoon"; // after line 26, "Wooden Spoon" will be eligible for garbage collection
        str = null; // null assigned ettiginde unreferenced oluyor ve eligible for garbage collection

        System.out.println( str ); // null

        Car car1 = new Car("Toyota");

        car1 = null;

        System.out.println(car1); // null

        System.out.println("--------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1  =     new Dog();
        dog1.name = "Max";

        System.out.println(dog1); //Dog{name='Max', breed='null', age=0, gender= , size='null', color='null'}

        String language = "Python";
        language    =   "Java";

        System.out.println(language); // Java

        System.out.println("-----------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>(); // same room 2 different doors list1 and list2

        list1.add(100);

        ArrayList<Integer> list2 = list1 ;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1); // [100, 200, 300, 400]
        System.out.println(list2); // [100, 200, 300, 400]

        System.out.println(list1 == list2 ); // true

        System.out.println("-----------------------------------");

        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1); // Student{name='Ahmet', age=30, gender=M, grade=A, id=14}
        System.out.println(student2); // Student{name='Ahmet', age=30, gender=M, grade=A, id=14}

        System.out.println("------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");


        System.out.println("l1 = " + l1); // l1 = [Java, Python]
        System.out.println("l2 = " + l2); // l2 = [Java, Python]


    }
}
