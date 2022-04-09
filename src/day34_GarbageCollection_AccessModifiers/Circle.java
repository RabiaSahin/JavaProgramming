package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi ;
    public static String name;

    public static ArrayList<Integer> numbers; // it has the multiple step to set the variable


    //public static Sheet sheet ; // excel sheet. neden variable direk asign etmedigimizi anlatiyor
                                    //  public static double pi = 3.14; gibi
                                    // ilerde multiple step ile set variable yapicaz. o zaman boyle asign edemeyiz
                                    // static block kllanmamiz garekir

    public Circle(double radius){
        this.radius = radius; // just use to set for instance variables
        //  pi = 3.14; // constructor ever use to set any static variables
    }

// if you have a static variable that takes more than one steps to set the variable, static block is the best
    static{ //static block automatically executed only one time, when you call the other class
        // radius = 5; // you can not use the instance variables
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }

// bu variabllerin hepsini main method da initialize edebilirsin cunku main method da static method ama
// main method u you can not run outside the class. sadece bu class da kullanabilirsin.
// bu variables test class ta call yaptik ama null veriler cikti.
    /*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
*/
}
