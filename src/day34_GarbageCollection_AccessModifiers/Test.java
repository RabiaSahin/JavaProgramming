package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;
 import static utilities.MathUtility.*;
 // ayni class tan birden cok method kullanacagimiz icin * yaptik.

public class Test {

    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        System.out.println("----------------------------");

        // find the sum of 10, 20
        int r1 = sum(10, 20); // sum static method oldugu icin import ile direk kullaliyor

      //  MathUtility.sum(10,20); // eger import yapmazsak bu sekilde call the class ile kullanilir


        // find the sum of 100, 200
        int r2 = sum(100, 200);


        int r3 = subtract(100,50);

        int r4 = max(1000, 2000);


    }
}
