package src.Task5;

class ExpenseRequest {

    private double amount;
    private String purpose;

    public ExpenseRequest(double amount, String purpose){
        this.amount=amount;
        this.purpose=purpose;
    }

    double getAmount(){ return amount; }

    String getPurpose(){ return purpose; }

}
