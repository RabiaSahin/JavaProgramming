package day51_Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        // key & value
        // student name & score:
        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 95);
        students.put("Ali",95);
        students.put("Alex",96);
        students.put("Ozan",98);
        students.put("Serkan",97);
        students.put("Andriy",98);

        students.put("Ali",85);
        students.put("Ali",86);
        students.put("Ali",87);

        System.out.println(students);  //{Alex=96, Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=87}
        System.out.println(students.size()); // 7


        // display the score of Alex:
        System.out.println(students.get("Alex")); // 96


        // replace Ali' score to 90

        students.replace("Ali", 90 );

        System.out.println(students); //{Alex=96, Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=90}

        students.remove("Alex");

        System.out.println(students); //{Andriy=98, Aygun=95, Maria=95, Ozan=98, Serkan=97, Ali=90}

        students.remove("Ozan");

        System.out.println(students); //{Andriy=98, Aygun=95, Maria=95, Serkan=97, Ali=90}


        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1); // false
        System.out.println(r2); // true



        boolean r3 = students.containsValue(97);

        System.out.println(r3);


        System.out.println(students.isEmpty());


        System.out.println("-------------------------");

        Map<String, Integer> map1 = new HashMap<>(); // new object
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>(); // new object
        map2.putAll(students);


        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 ==  map2); // false, because both of maps are different object with new keyword
        System.out.println(map1.equals(map2)); // true

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);





    }

}