package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );

    //    ArrayList<String> list = new ArrayList<>( Arrays.asList(str.split("")) );

        System.out.println("list = " + list); // [a, a, a, b, c, c, c, d, e, e, e, f, g, g, g, g, g, g, g, g, h, i, i, i, i, i, i, i, i, i, j, k, k, k, k, k, k, k, k, k, l]

        String unique = "";

        for (String each : list) {

            int frequency =  Collections.frequency(list, each);
            if(frequency == 1){
                unique += each;
            }

        }


        System.out.println("unique = " + unique);

    }

}
