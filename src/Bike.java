public class Bike {
    // Eager way of creating singleton object
    private static Bike bike = new Bike();

    public static Bike getBike() {
        return bike;
    }

}
