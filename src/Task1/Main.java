package src.Task1;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100.00);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200.00);

        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(300.00);
    }
}
