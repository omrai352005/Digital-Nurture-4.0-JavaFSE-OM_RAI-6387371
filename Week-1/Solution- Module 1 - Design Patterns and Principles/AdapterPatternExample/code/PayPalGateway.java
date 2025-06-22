package AdapterPatternExample.code;

// Adaptee 1
public class PayPalGateway {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed through PayPal.");
    }
}

