
class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class SportsCar extends Car {
    SportsCar(String brand, int speed) {
        super(brand, speed);
    }

    void showType() {
        System.out.println("Car Type: Sports Car");
    }
}

class ElectricCar extends Car {
    ElectricCar(String brand, int speed) {
        super(brand, speed);
    }

    void showType() {
        System.out.println("Car Type: Electric Car");
    }
}

public class CarTypeProgram {
    public static void main(String[] args) {
        SportsCar s1 = new SportsCar("Ferrari", 320);
        ElectricCar e1 = new ElectricCar("Tesla", 250);

        s1.display();
        s1.showType();

        System.out.println();

        e1.display();
        e1.showType();
    }
}
