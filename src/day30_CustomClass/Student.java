package day30_CustomClass;

public class Student {

    // 1 attributes
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    // 4 actions
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    public void code(){
        System.out.println(name +" is coding");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

}
