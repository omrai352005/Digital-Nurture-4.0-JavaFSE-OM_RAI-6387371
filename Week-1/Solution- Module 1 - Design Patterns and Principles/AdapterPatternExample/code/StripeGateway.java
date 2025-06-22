package AdapterPatternExample.code;

// Adaptee 2
public class StripeGateway {
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed through Stripe.");
    }
}

