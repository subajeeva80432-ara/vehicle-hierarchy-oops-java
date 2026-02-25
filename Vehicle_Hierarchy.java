class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void start() {
        System.out.println("Vehicle is starting...");
    }

    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed + " km/h");
    }
}

class Car extends Vehicle {

    Car(String brand, int speed) {
        super(brand, speed);
    }

    void start() {
        System.out.println("Car starts with key ignition.");
    }
}

class Bike extends Vehicle {

    Bike(String brand, int speed) {
        super(brand, speed);
    }

    void start() {
        System.out.println("Bike starts with kick or self-start.");
    }
}

class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Car("Hyundai", 120);
        Vehicle v2 = new Bike("Yamaha", 90);

        v1.display();
        v1.start();

        System.out.println();

        v2.display();
        v2.start();
    }
}