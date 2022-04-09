package day30_CustomClass;

public class Car {

    // Attributes

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    // actions
    // setInfo() method object class da her obje icin attributes leri tek tek yazmamak icin

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){

        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;

    }
    // actions
    // toString() method object/main class ta object i yazdirabilmek icin

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    // Actions

    public void drive(){
        System.out.println("Driving "+brand+" "+model);
    }


    public void start(){
        System.out.println(brand+" "+model+" has started");
    }

    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }
}
