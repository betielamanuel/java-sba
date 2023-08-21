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

// Requirement 3: Create a subclass called Ford with additional fields and methods
class Ford extends Car {
    int year;
    int manufacturerDiscount;

    // Constructor for initializing Ford fields, including super constructor call
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    // Method to calculate the sale price with manufacturer discount
    @Override
    public double getSalePrice() {
        return super.getSalePrice() - manufacturerDiscount;
    }
}

// Requirement 4: Create a subclass called Sedan with additional fields and methods
class Sedan extends Car {
    int length;

    // Constructor for initializing Sedan fields, including super constructor call
    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    // Method to calculate the sale price with discount based on length
    @Override
    public double getSalePrice() {
        if (length > 20) {
            return super.getSalePrice() * 0.95; // 5% discount
        } else {
            return super.getSalePrice() * 0.9; // 10% discount
        }
    }
}

// Requirement 5: Create the MyOwnAutoShop class with the main method
public class QuantumAutoMobile {
    public static void main(String[] args) {
        // Create instances of different classes and display sale prices
        Sedan hyperStreamSedan = new Sedan(150, 20000, "Red", 25);
        Ford fordGalacticCruiser = new Ford(180, 30000, "Blue", 2023, 2000);
        Ford fordQuantumX = new Ford(160, 25000, "Green", 2022, 1500);
        Car NeuroDriveCar = new Car(140, 18000, "Black");

        System.out.println("Sale price for Hyper Stream Sedan: $" + hyperStreamSedan.getSalePrice());
        System.out.println("Sale price for Ford Galactic Cruiser: $" + fordGalacticCruiser.getSalePrice());
        System.out.println("Sale price for Ford QuantumX: $" + fordQuantumX.getSalePrice());
        System.out.println("Sale price for NeuroDriveCar: $" + NeuroDriveCar.getSalePrice());
    }
} 

