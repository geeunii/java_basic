package javabasic_02.day11_0806.test.Test_0806.ConstructorPractice;

public class Rectangle {
    private int width; // 가로 길이
    private int length; // 세로 길이
    private String color;

    public int area() {     // 넓이
        return width * length;
    }

    public int perimeter() {
        return (width + length) * 2;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
