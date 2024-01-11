
public class Account {
	
		
	
	public double balance;
    public double interest;

    public Account(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void addInterest() {
        double interestAmount = (balance * interest)/100;
        balance += interestAmount;
        
        System.out.println("Total balance" + balance);
    }
}
