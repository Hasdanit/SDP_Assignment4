package src.Task4;

public class NewState implements State {

    @Override
    public void payOrder(Order order) {
        order.setState(new PaidState());
        System.out.println("Order has been paid.");
    }

    @Override
    public void shipOrder(Order order) {
        System.out.println("Cannot ship a new order.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cannot deliver a new order.");
    }

    @Override
    public void cancelOrder(Order order) {
        order.setState(new CancelledState());
        System.out.println("Order has been cancelled.");
    }
}
