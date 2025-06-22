package AdapterPatternExample.code;

public class Main {
    public static void main(String[] args) {
        // Using PayPal
        PayPalGateway paypal = new PayPalGateway();
        PaymentProcessor paypalAdapter = new PayPalAdapter(paypal);
        paypalAdapter.processPayment(150.00);

        // Using Stripe
        StripeGateway stripe = new StripeGateway();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.processPayment(200.00);
    }
}
