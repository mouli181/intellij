package enuerations;

public enum Day {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

class Main{
    public static void main(String[] args) {
        Day d = Day.Monday;
        System.out.println("Today is " + d);

        for(Day day : Day.values()){
            System.out.println(day);
        }
    }
}