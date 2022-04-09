package week01;

public class StringManipulator {

   public String str; //attribute

    public int x;


    public StringManipulator(String str){ // one parameter constructor
        this.str = str;
    }

    public void firstTwoChars(){ // only works when u call it. just manipulated
        str = str.toUpperCase().substring(0,2);

        // it belongs to the object because it does not have static. u have to create object
    }
 /*
    What is the index of last character of a string
    str.length()-1 = last char
    str.length()-2 = the one before last char
     */


    public String tripler(){

        str = "" + str.charAt(str.length()-1) + str.charAt(str.length()-2);
        str = str.repeat(3);
        return str;
    }


}
/*TASK: Create a blueprint Class that will have one attribute which is string
       - actions (void methods): manipulate your attribute String*/