
public class RestaurantBilling {

    static final double TAX_RATE = 0.10;

    // Method 1: Price only
    static double calculateBill(double price) {
        return price + (price * TAX_RATE);
    }

    // Method 2: Price and Quantity
    static double calculateBill(double price, int quantity) {
        double subtotal = price * quantity;
        return subtotal + (subtotal * TAX_RATE);
    }

    // Method 3: Price, Quantity and Discount
    static double calculateBill(double price, int quantity, double discount) {
        double subtotal = (price * quantity) - discount;
        return subtotal + (subtotal * TAX_RATE);
    }

    public static void main(String[] args) {

        System.out.println("=== Restaurant Billing System ===");

        double bill1 = calculateBill(500);
        System.out.println("Price Only: Rs. " + bill1);

        double bill2 = calculateBill(500, 3);
        System.out.println("Price + Quantity: Rs. " + bill2);

        double bill3 = calculateBill(500, 3, 200);
        System.out.println("Price + Quantity + Discount: Rs. " + bill3);
    }
}
