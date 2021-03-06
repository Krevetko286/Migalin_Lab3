package ru.mirea.gibo4.Lab3.ex1;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape (String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }
    public Shape () {this("red", true);}
    public String getColor () {return color;}
    public void setColor (String color) {this.color = color;}
    public boolean isFilled () {return filled;}
    public void setFilled (boolean filled) {this.filled = filled;}
    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}

