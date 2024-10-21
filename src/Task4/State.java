package src.Task4;

public interface State {
    void payOrder(Order order);
    void shipOrder(Order order);
    void deliverOrder(Order order);
    void cancelOrder(Order order);
}