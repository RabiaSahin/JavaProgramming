package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M',1,"Small","White");

        System.out.println(dog1); //Animal{name='Alex', breed='Husky', gender=M, age=1, size='Small', color='White'}

        dog1.bark(); //Alex is barking
        //dog1.scratch(); // these are not unique methods for dog class and inherited
        //dog1.sing();



        Cat cat1 = new Cat("Love", "Siamese",'F',2,"Large","Black");

        System.out.println(cat1); //Animal{name='Love', breed='Siamese', gender=F, age=2, size='Large', color='Black'}
        cat1.scratch(); //Love is scratching
        //  cat1.bark();
        //  cat1.sing();


        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue");

        System.out.println(parrot1); //Animal{name='King', breed='Macaw', gender=M, age=3, size='Small', color='Blue'}

        parrot1.sing(); //King is singing
        //  parrot1.bark();
        //  parrot1.scratch();


    }
}
