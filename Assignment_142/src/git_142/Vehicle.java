package git_142;

public class Vehicle {
    private int horsepower;

    // Constructor for Vehicle class
    public Vehicle(int horsepower) {
        this.horsepower = horsepower;
    }

    // Method to drive
    public void drive() {
        System.out.println("Vehicle is being driven.");
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public static void main(String[] args) {
        Car car = new Car(80);
        car.drive();
    }
}

class Car extends Vehicle {
    private String make;

    // Constructor for Car class
    public Car(int horsepower) {
        super(horsepower); // Calling superclass constructor
        this.make = "Unknown";
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Overriding drive method
    @Override
    public void drive() {
        super.drive(); // Calling superclass method
        System.out.println("Car is being driven.");
    }
}
