package day01_JavaIntro;

import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodPractice4;
import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str1 = "Wooden Spoon";

        StringUtility.printEachChar(str1);


        System.out.println("----remove duplicated with other class method---");

        String str2 = "aaaaabbbbbbcccccc";
//              class name              method name     bu classtaki variable name (hangi variable i kullanmak istiyorsak)
        str2 = ReturnMethodPractice4.removeDuplicates(str2);
        System.out.println(str2);

        String name = "Java Programming";

        String reversedName = ReturnMethodIntro.reverse(name);
        System.out.println(reversedName);

    }



}
