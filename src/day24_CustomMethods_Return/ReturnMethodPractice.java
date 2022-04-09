package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        // find the max number between 100 & 200
     //   System.out.println(max(100, 200)); // write a value
     //   max(100, 200); // does not write anything
        int maxNumber = max(100, 200); // parantez ici value oldugu icin baska bir variable a assign edebiliyoruz

        System.out.println(maxNumber);

        // multiply the max number by 2

        int multiplication = maxNumber * 2;

        System.out.println("multiplication = " + multiplication);

    }

    public static int max(int a, int b){

        int result = 0;

        if(a > b){
            result = a;
        }else{
            result = b;
        }

        return result;

    }

}
