package src.Task5;

class ApprovalChain {

    private Approver chain;

    ApprovalChain() {

        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        chain = teamLead;
    }

    void processRequest(ExpenseRequest request) { chain.handleRequest(request); }
}
