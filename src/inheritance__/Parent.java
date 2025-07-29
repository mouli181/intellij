package inheritance__;

public class Parent {
    void parentMoney(){
        System.out.println("This is parent method");
    }

}

class Child extends Parent{
    void childMoney(){
        System.out.println("This is child class");
    }
}

class Main{
    public static void main(String[] args) {
        Child c = new Child();
        c.childMoney();
        c.parentMoney();
    }
}