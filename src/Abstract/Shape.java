package Abstract;

abstract class Shape {
    abstract void display();

    void fun(){
        System.out.println("have fun");
    }
}

class Circle extends Shape{
    public void display(){
        System.out.println("display shape");
    }
}