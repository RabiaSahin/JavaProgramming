package day43_Abstraction.car;

public final class Honda extends Car  {

    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }


    public void start(){ // overriding abstract method from sub class and create implementation.
        System.out.println("Twist the key to ignition");
    }
// parent class responsible just for creating abstract method, it does not focus on the details.
// child class is responsible for completing abstract method, child class focus on the details.


}