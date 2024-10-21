package src.Task4;

public class PaidState implements State {

    @Override
    public void payOrder(Order order) {
        System.out.println("Order already paid.");
    }

    @Override
    public void shipOrder(Order order) {
        order.setState(new ShippedState());
        System.out.println("Order has been shipped.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver a paid order.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Cannot cancel a paid order.");
    }

}
