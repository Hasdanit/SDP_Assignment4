package src.Task5;

public class TeamLead extends Approver {

    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() < 1000)
            System.out.println("Team Lead approved $" + request.getAmount());
        else if (nextApprover != null)
            nextApprover.handleRequest(request);
    }
}