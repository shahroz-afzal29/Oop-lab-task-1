
class Engine {
    String type;
    int horsepower;

    Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    void displayEngine() {
        System.out.println("Engine Type: " + type);
        System.out.println("Horsepower: " + horsepower);
    }
}

class Car {
    String brand;
    Engine engine;

    Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
        engine.displayEngine();
    }
}

public class CarEngineProgram {
    public static void main(String[] args) {
        Engine e1 = new Engine("Petrol", 150);

        Car c1 = new Car("Toyota", e1);

        c1.display();
    }
}
