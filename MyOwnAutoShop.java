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

// Requirement 2: Create a subclass called Truck with additional fields and methods
class Truck extends Car {
    int weight;

    // Constructor for initializing Truck fields, including super constructor call
    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    // Method to calculate the sale price with discount based on weight
    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return regularPrice * 0.9; // 10% discount
        } else {
            return regularPrice * 0.8; // 20% discount
        }
    }
}