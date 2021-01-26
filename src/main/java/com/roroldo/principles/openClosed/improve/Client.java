package com.roroldo.principles.openClosed.improve;


/**
 * 改进版
 * @author 落霞不孤
 */
public class Client {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Square());

    }
}

abstract class Shape {
    int type;
    public abstract void draw();
}

class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("画三角形...");
    }
}

class Circle extends Shape {
    public Circle() {
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("画圆形...");
    }
}

// 使用方 绘图类
class GraphicEditor {
    // 接受 Shape 对象,来绘制不同的图形
    public void drawShape(Shape shape) {
       shape.draw();
    }
}

// 新增一个提供画正方形的提供方 要去使用方绘图类处修改代码了
class Square extends Shape {
    public Square() {
        super.type = 3;
    }

    @Override
    public void draw() {
        System.out.println("画正方形...");
    }
}