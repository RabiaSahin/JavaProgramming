package day30_CustomClass;

public class Dog {

    // Attributes
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    // actions
    // setInfo() method object class da her obje icin attributes leri tek tek yazmamak icin
    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender= dogGender;
        size = dogSize;
        color = dogColor;
    }

    // Actions
    public void eat(){
        System.out.println(name+" is eating");
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

    // actions
    // toString() method object/main class ta object i yazdirabilmek icin
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
/*
Attributes:
    name, age, gender, breed, size, color
Actions:
    eat(), play(), bark() ....
 */