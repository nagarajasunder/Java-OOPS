

public class Abstraction {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Red", 6F, 5F);
        Shape circle = new Circle("Blue", 7);

        System.out.println(rectangle);
        System.out.println(circle);


    }

}


abstract class Shape2 {

}

abstract class Shape {
    String color;


    public Shape(String color) {
        this.color = color;
    }

    abstract public double getArea();

    abstract public String toString();


}

class Rectangle extends Shape {

    float length;
    float breadth;


    public Rectangle(String color, float length, float breadth) {
        super(color);
    }

    @Override
    public double getArea() {
        return length * breadth;
    }

    @Override
    public String toString() {
        return "The shape is Rectangle and the area is " + getArea();
    }

}

class Circle extends Shape {

    float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "This is a circle with are " + getArea();
    }
}



