package src.Task5;

public class Manager extends Approver {

    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() < 5000)
            System.out.println("Manager approved $" + request.getAmount());
        else if (nextApprover != null)
            nextApprover.handleRequest(request);
    }
}
