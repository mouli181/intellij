package inheritance_;

public class Parent {
    void display(){
        System.out.println("this is from parent");
    }
}

class Child extends Parent{
    void message(){
        System.out.println("this is from child");
    }
}

class Main{
    public static void main(String[] args) {
        Child c = new Child();
        c.message();
        c.display();
    }
}