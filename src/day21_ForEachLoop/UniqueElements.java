package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (String each : words) { // each: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
            // each, stands for every single elements that we have in this array

            int count = 0;

            for (String element : words) { // element: "Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"
               // variable elements, it stands for every single element that we have in this array
                if(element.equals(each)){
                    count++;
                }
            }

            if(count == 1){
                System.out.println(each);
            }

        }




    }


}
