public class Car {
    private static Car car;

    private Car() {
        System.out.println("Welcome to Singleton Design Pattern!!");
    }

    // Lazy way of using single object
    public static Car getCarLazy() {
        if (car == null) {
            car = new Car();
        }
        return car;
    }

    // Synchronized way of using single object for multi thread
    public static Car getCarSync() {
        if (car == null) {
            synchronized (Car.class) {
                if (car == null) {
                    car = new Car();
                }
            }
        }
        return car;
    }

}
