package day33_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;
    public double price;

    public static String OS = "iOS";

    public String color;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean hasFaceTime = true;

    public static void printOperatingSystem(){
        System.out.println(OS);
    }


    // public static void printModelAndPrice(){  // static method belongs the class
    //    System.out.println(model+" : "+price); // static methods does not accept(share) instances
    //  } static only accept static members


    public void method1(){  // instance method belongs the object.
        System.out.println(model+" : "+price); // model and price are instance variables
        System.out.println(OS); // OS is static variable

        // if you have the instance method you have to create an object.
        // object came from the class and objects can share all the class members.
    }

}
