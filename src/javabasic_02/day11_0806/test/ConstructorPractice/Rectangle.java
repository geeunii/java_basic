package javabasic_02.day11_0806.test.ConstructorPractice;

public class Rectangle {

    private int width;      // 길이
    private int height;     // 높이
    private String color;   // 색깔
    private double area;    // 면적

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        color = "흰색";
    }

    public Rectangle() {

    }

    void calculateArea() {


    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return width * height;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
