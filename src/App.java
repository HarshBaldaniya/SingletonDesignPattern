public class App {
    public static void main(String[] args) throws Exception {
        // Varified the object is same or not
        Car car1 = Car.getCarLazy();
        System.out.println(car1.hashCode());

        Car car2 = Car.getCarLazy();
        System.out.println(car2.hashCode());

        System.out.println(Bike.getBike().hashCode());
        System.out.println(Bike.getBike().hashCode());
    }
}
