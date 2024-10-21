package src.Task5;

ublic class Director extends Approver {

    @Override
    public void handleRequest(ExpenseRequest request) {
        if (request.getAmount() < 10000)
            System.out.println("Director approved $" + request.getAmount());
        else if (nextApprover != null)
            nextApprover.handleRequest(request);
    }
}