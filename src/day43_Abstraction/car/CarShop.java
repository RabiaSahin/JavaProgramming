package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {

        //    Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
        // we can not create object from Abstract class, because abstract class is not concrete


        Honda honda = new Honda("Accord", "Black", 2019, 30000);

        Audi audi = new Audi("Q7", "Blue", 2020, 45000);

        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        /*  Car{brand='Honda', model='Accord', color='Black', year=2019, price=30000.0}
            Car{brand='Audi', model='Q7', color='Blue', year=2020, price=45000.0}
            Car{brand='Tesla', model='Model3', color='White', year=2021, price=60000.0}*/

        System.out.println("------------------------------------");

        honda.setColor("Red");
        audi.setColor("Pink");
        tesla.setColor("Green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

/*  Car{brand='Honda', model='Accord', color='Red', year=2019, price=25000.0}
    Car{brand='Audi', model='Q7', color='Pink', year=2020, price=40000.0}
    Car{brand='Tesla', model='Model3', color='Green', year=2021, price=55000.0}
*/

    }
}
