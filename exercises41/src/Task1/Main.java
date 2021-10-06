package Task1;

public class Main {

    public static void main(String[] args) {
        Driver d1 = new Driver("Nick", 21);
        Car c1 = new Car("Audi", "R8", 2006, "coupé");
        Car c2 = new Car("Ford", "Focus", 2009, "Stationcar");
        c1.setDriver(d1);
        c2.setDriver(d1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(d1);
    }

}
