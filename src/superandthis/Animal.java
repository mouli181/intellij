package superandthis;

public class Animal {
    void sound(){
        System.out.println("animal makes sound");
    }
}

class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("dog barks");
    }
}