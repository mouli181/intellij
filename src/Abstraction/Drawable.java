package Abstraction;

public interface Drawable {
    void draw1();

}

class Shape1 implements Drawable{
    public void draw1(){
        System.out.println("this is Interface");
    }
}

class Main1{
    public static void main(String[] args) {
        Drawable d = new Shape1();
        d.draw1();
    }
}
