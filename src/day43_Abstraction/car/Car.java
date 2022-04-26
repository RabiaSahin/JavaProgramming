package day43_Abstraction.car;

public abstract class Car {

    private final String brand, model;
    private String color;
    private final int year;
    private double price;

    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);

        if(year < 1886){ // final olmasina ragmen specifier ederek throw keyword ile exception create ettik
            throw new RuntimeException("Invalid Year: "+year);
        }
        this.year = year;

        setPrice(price);
    }
    // price ve color disindaki variable lar final oldugu icin sadece bu ikisine set() create ettik

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {

        if(price <= 0){
            throw new RuntimeException("Invalid price: "+price);
        }

        this.price = price;
    }

    public  void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start();


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}