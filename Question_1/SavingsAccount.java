
public class SavingsAccount extends Account {
    

    public SavingsAccount(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void addInterest() {
        if (balance > 0) {
            super.addInterest();
        }
        else {
        	System.out.println("Savings account - Balance is less than or equal to Zero");
        }
    }
}