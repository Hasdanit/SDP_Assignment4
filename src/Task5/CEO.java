package src.Task5;

public class CEO extends Approver {

    @Override
    public void handleRequest(ExpenseRequest request) {
        System.out.println("CEO approved $" + request.getAmount());
    }
}
