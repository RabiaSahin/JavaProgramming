package day40_FinalKeyword;

public class ProtectedAccessModifier {

    static String name1 = "Cydeo"; //default access modifier
    // default is not visible outside the package
    protected static String name2 = "WoodenSpoon"; // protected
    // protected is not always visible outside the package.
    // protected is visible outside the package in subclass ONLY

    static void method1(){

    }

    protected static void method2(){

    }

}
