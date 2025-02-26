package polymorphismex;

public class Animal {
    void sound(){
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("dog barks");
    }
}
