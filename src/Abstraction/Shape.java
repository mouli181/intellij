package Abstraction;

public abstract class Shape {
    abstract void draw();

    void calc(){
        System.out.println("this is normal method");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("this is abstract method implementation");
    }
}

class Main{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.calc();
        s.draw();
    }
}
