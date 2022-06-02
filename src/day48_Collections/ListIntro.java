package day48_Collections;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>(); // this one is faster for accessing element get()
        list1.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list1.get(0));


        List<Integer> list2 = new LinkedList<>(); // this one is faster for add or deleting
        list2.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list2.get(0));


        List<Integer> list3 = new Vector<>(); // this one is synchronized
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list3.get(0));


        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list4.get(0));

        System.out.println("-------------------------------------------------------");

        System.out.println(list4);

        ((Stack) list4).pop(); // down-casting, because pop() method belongs the Stack. doesn't belong the List

        System.out.println(list4);

        ((Stack) list4).pop();

        System.out.println(list4);


    }


    public synchronized void method1(){ // methods in the vector class are synchronized

    }
}
