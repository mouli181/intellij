package abstractionex;

abstract class Shape {
    abstract void display();

    void data(){
        System.out.println("this is concrete method");
    }
}


class Circle extends Shape{
    void display(){
        System.out.println("this is abstract child class");
    }
}

class Main{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.display();
        s.data();
    }
}