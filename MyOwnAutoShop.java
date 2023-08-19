// Requirement 1: Create a superclass called Car with fields and methods
class Car {
    int speed;
    double regularPrice;
    String color;

    // Constructor for initializing Car fields
    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    // Method to calculate the sale price (to be overridden by subclasses)
    public double getSalePrice() {
        return regularPrice;
    }
}