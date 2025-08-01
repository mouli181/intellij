package Generics;

public class GenericEx {
    public <T> void printArray(T[] a){
        for(T b : a){
            System.out.println(b);
        }
    }
}

class Main{
    public static void main(String[] args) {
        GenericEx g = new GenericEx();
        Integer[] i = {1,2,3,4,5};
        Double[] d = {10.4,20.4,10.9};
        String[] s = {"Hello","welcome"};
        g.printArray(i);
        g.printArray(s);
        g.printArray(d);
    }
}