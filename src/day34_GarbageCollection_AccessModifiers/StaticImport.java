package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {

        // System.out.println(Circle.pi); static imports yaptiginda yazdirirken calla the class name gerek yok
                                            // import etmezsen className ile birlikte yazdirabilirsin
        System.out.println(pi); // you can call direct. import etmezsen hata verir


    }
}
