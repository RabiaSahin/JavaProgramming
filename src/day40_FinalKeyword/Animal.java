package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;

    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }
    // final variable, constructor create edildiginde object olusturulacagi icin 1 kez set edilmis oluyor ve final sadece 1 kez set edilebilir.
    // o yuzden setter yaparken final variable i yapamiyoruz. 2. kez set e izin vermiyor
    // ayrica setter yapildiginda variable da degisiklik olabiliyor ama final degistirilemez

    ////----------Getters---------------------

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }


    //----------Setters---------------------
    // only 3 options it give us. because final is unchangeable and purpose of setter to change the variable(write)

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //----------Setters---------------------


    public void eat(){
        System.out.println(name+" is eating");
    }

    public final void drink(){ // you can NOT override. not change implementation
        System.out.println(name+" is drinking water");
    }

}
