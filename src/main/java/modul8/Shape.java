package main.java.modul8;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
    public String getName() {
        return name;
    }
}
class Circle extends Shape {
    public Circle(String name) {
        super(name);
    }
}
class Cube extends Shape {
    public Cube(String name) {
        super(name);
    }
}
class Quad extends Shape {
    public Quad(String name) {
        super(name);
    }
}
class Square extends Shape {
    public Square(String name) {
        super(name);
    }
}
class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }
}

class Test {
    public static void main(String[] args) {
        Shape shape = new Shape("Shape");
        Circle circle = new Circle("Circle");
        Cube cube = new Cube("Cube");
        Quad quad = new Quad("Quad");
        Square square = new Square("Square");
        Triangle triangle = new Triangle("Triangle");
        System.out.println("shape = " + shape.getName());
        System.out.println("circle = " + circle.getName());
        System.out.println("cube = " + cube.getName());
        System.out.println("quad = " + quad.getName());
        System.out.println("square = " + square.getName());
        System.out.println("triangle = " + triangle.getName());
    }
}
