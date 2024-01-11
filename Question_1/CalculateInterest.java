
public class CalculateInterest {

	public static void main(String[] args) {
	      Account account = new Account(40000.00,4.75);
	        SavingsAccount savingsAccount = new SavingsAccount(5000,4.23);
	        CurrentAccount currentAccount = new CurrentAccount(30000,7.3);

	       

	        account.addInterest();
	        savingsAccount.addInterest();
	        currentAccount.addInterest();
	    }
	}
	


