class Payment {

    void makePayment(double amount) {
        System.out.println("Making Payment: " + amount);
    }
}

class Cash extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("Cash Payment: Rs. " + amount);
    }
}

class Card extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("Card Payment: Rs. " + amount);
    }
}

class Online extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("Online Payment: Rs. " + amount);
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        Payment p1 = new Cash();
        Payment p2 = new Card();
        Payment p3 = new Online();

        p1.makePayment(1000);
        p2.makePayment(2000);
        p3.makePayment(3000);
    }
}
