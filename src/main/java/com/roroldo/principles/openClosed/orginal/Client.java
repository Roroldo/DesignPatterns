package com.roroldo.principles.openClosed.orginal;

/**
 * 开闭原则 对扩展开放 对修改关闭
 * demo违背了迪米特法则的
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

class Shape {
    int type;
}

class Rectangle extends Shape {
    public Rectangle() {
        super.type = 1;
    }

    public void drawRectangle() {
        System.out.println("画三角形...");
    }
}

class Circle extends Shape {
    public Circle() {
        super.type = 2;
    }

    public void drawCircle() {
        System.out.println("画圆形...");
    }
}


// 使用方 绘图类
class GraphicEditor {
    // 接受 Shape 对象，然后根据 type，来绘制不同的图形
    public void drawShape(Shape shape) {
        // 画三角形
        if (shape.type == 1) {
            Rectangle rectangle = new Rectangle();
            rectangle.drawRectangle();
        }
        // 画圆形
        if (shape.type == 2) {
            Circle circle = new Circle();
            circle.drawCircle();
        }
        // 新增画正方形
        if (shape.type == 3) {
            Square square = new Square();
            square.drawSquare();
        }

    }
}

// 新增一个提供画正方形的提供方 要去使用方绘图类处修改代码了
class Square extends Shape {
    public Square() {
        super.type = 3;
    }

    public void drawSquare() {
        System.out.println("画正方形...");
    }
}
