class Shape {

    void area() {
        System.out.println("Area of Shape");
    }

    // Overloading: Square
    void area(int side) {
        System.out.println("Area of Square: " + (side * side));
    }

    // Overloading: Rectangle
    void area(int length, int width) {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

class Rectangle extends Shape {

    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Overriding
    @Override
    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

public class ShapeRectangle {

    public static void main(String[] args) {

        Shape s1 = new Shape();

        s1.area();
        s1.area(5);
        s1.area(6, 4);

        Rectangle r1 = new Rectangle(8, 5);
        r1.area();
    }
}
