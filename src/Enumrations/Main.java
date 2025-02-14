package Enumrations;

public class Main {
    public static void main(String[] args) {
        Day d = Day.MONDAY;
        System.out.println(d);

        for(Day day : Day.values()){
            System.out.print(day + " ");
        }
    }
}
