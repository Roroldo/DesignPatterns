package com.roroldo.structuralPatterns.bridge;

public class Client {

    public static void main(String[] args) {
        AbstractShape circle = new Circle();
        circle.draw();

        // 绿色正方形
        AbstractShape square = new Square(new Green());
        square.draw();
        square = new Square(new Red());
        square.draw();
    }
}
