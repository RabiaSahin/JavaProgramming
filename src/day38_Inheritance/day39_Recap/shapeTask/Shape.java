package day38_Inheritance.day39_Recap.shapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){ // null keyword not the object
            System.err.println("Name can not be null");
            System.exit(1); // 1: something went wrong
        }
        if(name.isEmpty() || name.isBlank()){ // "" it means empty String, and it is still object
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }


    public Shape(String name) {
        setName(name);
    }


    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }


    @Override // it is optional. yazmak zorunda degilsin
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}
/*
	Shape:
	variables:
			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */
