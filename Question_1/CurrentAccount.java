
public class CurrentAccount extends Account {
    

    public CurrentAccount(double balance, double interest) {
        super(balance, interest);
        
    }

    @Override
    public void addInterest() {
        if (balance > 0) {
            super.addInterest();
        }
        else {
        	System.out.println("Current Account - Balance is less than Minimum balance");
        }
    }
}