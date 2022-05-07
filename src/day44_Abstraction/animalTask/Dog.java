package day44_Abstraction.animalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(getName()+" is barking");
    }


    public void eat() {
        System.out.println(getName()+" eats Pizza");
    }

    public void play(){
        System.out.println(getName() +" is playing with ball");
    }

// class da implements yapinca hata verdi cunku regular class can not inherit abstract method directly
// because abstract method has not body and regular class does not accept method without body
// play method not inherited without body that's why we are overriding a play method and wrote a body
}