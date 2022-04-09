package day37_Inheritance;

    class A{
        public A(int a){
            System.out.println("A");
        }
    }

    class B extends A{
        public B(int a){
            super(a);
            System.out.println("B");
        }
    }
    ///////////////////////////////////////////////////////////////////

class A2{

    public A2(int a){
        System.out.println("A2");
    }
}

class B2 extends A2{

    public B2(){
        super(9);
        System.out.println("B2");
    }
}

public class ConstructorPractice {
    public static void main(String[] args) {

        B obj = new B(9);
        //A
        //B
        System.out.println("---------------------------------");

        B2 obj2 = new B2();
        //A2
        //B2

    }

}
