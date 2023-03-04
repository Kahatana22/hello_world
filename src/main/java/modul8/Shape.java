package main.java.modul8;

public abstract class Shape {
    private String name;
    public Shape(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public Shape() {
        name = "Shape";
    }
}

