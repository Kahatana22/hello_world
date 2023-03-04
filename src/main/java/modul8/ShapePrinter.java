package main.java.modul8;

public class ShapePrinter {
    public String printName(Shape shape) {
        return shape.getName();
    }
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapePrinter printer = new ShapePrinter();
        printer.printName(circle);
        System.out.println(printer.printName(circle));
    }
}
