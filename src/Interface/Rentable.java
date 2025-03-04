package Interface;

public interface Rentable {
    void calculateRate(int days);
}

class CarRental implements Rentable{

    @Override
    public void calculateRate(int days) {
        System.out.println("Car rent is " + (days * 1500));
    }
}

class BikeRental implements Rentable{

    @Override
    public void calculateRate(int days) {
        System.out.println("Bike rent is " + (days * 1000));
    }
}

class Main{
    public static void main(String[] args) {
        Rentable b = new BikeRental();
        b.calculateRate(3);
        Rentable r = new CarRental();
        r.calculateRate(5 );
    }
}
