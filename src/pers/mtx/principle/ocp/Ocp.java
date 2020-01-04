package pers.mtx.principle.ocp;

public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

//1) 优点是比较好理解，简单易操作。
//2) 缺点是违反了设计模式的ocp 原则，即对扩展开放(提供方)，对修改关闭(使用方)。即当我们给类增加新功能的
//时候，尽量不修改代码，或者尽可能少修改代码.
//3) 比如我们这时要新增加一个图形种类三角形，我们需要做如下修改，修改的地方较多

//这是一个用于绘图的类[使用方法]
//思路:把创建Shape 类做成抽象类，并提供一个抽象的draw 方法，让子类去实现即可，这样我们有新的图形
//种类时，只需要让新的图形类继承Shape，并实现draw 方法即可，使用方的代码就不需要修-> 满足了开闭原则
class GraphicEditor {
    //接收Shape 对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s) {
        if (s.m_type == 1)
            drawRectangle(s);
        else if (s.m_type == 2)
            drawCircle(s);
        else if (s.m_type == 3)
            drawTriangle(s);
    }

    //绘制矩形
    public void drawRectangle(Shape r) {
        System.out.println(" 绘制矩形");
    }

    //绘制圆形
    public void drawCircle(Shape r) {
        System.out.println(" 绘制圆形");
    }

    //绘制三角形
    public void drawTriangle(Shape r) {
        System.out.println(" 绘制三角形");
    }
}

//Shape 类，基类
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}

//新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }
}
