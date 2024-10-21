package src.Task5;

class Main {

    public static void main(String[] args){

        ApprovalChain approvalChain=new ApprovalChain();

        approvalChain.processRequest(new ExpenseRequest(500,"Team lunch"));
        approvalChain.processRequest(new ExpenseRequest(1500,"Conference trip"));
        approvalChain.processRequest(new ExpenseRequest(7000,"New equipment"));
        approvalChain.processRequest(new ExpenseRequest(12000,"Office renovation"));

    }

}