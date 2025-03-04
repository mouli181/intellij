package enuerations;

import java.util.EnumSet;

public class EnumsetEx {
    public enum Day{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
    }
}

class Main1{
    public static void main(String[] args) {
        EnumSet<Day> e = EnumSet.of(Day.Saturday,Day.Sunday);

        for(Day d: e){
            System.out.println("weekend is " + d);
        }
    }
}