package Abstraction;

public enum Day {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}

class Main2{
    public static void main(String[] args) {
        Day d = Day.SUNDAY;
        System.out.println(d);

        for(Day e : Day.values() ){
            System.out.println(e);
        }
    }
}
