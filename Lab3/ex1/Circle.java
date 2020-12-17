package ru.mirea.gibo4.Lab3.ex1;

public class Circle extends Shape {
    protected double radius;
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }
    public Circle(double radius) {
        super();
        setRadius(radius);
    }
    public Circle() {
        this(4);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 4);
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Circle with radius=" + radius +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter();
    }
}


