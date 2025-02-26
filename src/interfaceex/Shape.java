package interfaceex;

public interface Shape {

    void draw();
}

class Circle implements Shape{
    public void draw(){
        System.out.println("this is interface");
    }
}
class Main{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}