package day38_Inheritance.day39_Recap.shapeTask;

public class Square extends Shape{ // extends yazmadan once inherited edilmeyecek olan class a ait
                                  // variable (fields) ve method lari yaz, getter and setter yap sonra extends yaz
    private double side;         // boylece contructor a otomatik dahil olur. yoksa manual eklemelisin

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }

        this.side = side;
    }

    //                              -100
    public Square(double side) { // constructor call yapinca String name geldi () parantezin icinde
        super("Square");   // ama biz zaten ismini bildigimiz icin parantezden onu silip Square yazdik
        setSide(side); // Generate -> constructor yapinca this.side=side; olarak geldi ama
    }                  // oncelikte setSide daki condition i konrol etmesi cin setSide(side) yazdik


    public double area() {   // Generate -> override yapinca
        return side * side; // implementation of area return super.area() olarak geldi
    }                       // biz area formulune gore implementation u degistirdik


    public double perimeter() {
        return side * 4;
    }


    public String toString() { // once side i eklemek icin toString method create ettik.
        return "Square{" +      // sonra super class tan area ve perimeter parti copy paste yaptik
                "side=" + side +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }


}

/*
Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */