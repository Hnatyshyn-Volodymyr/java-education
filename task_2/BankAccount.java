package task_2;

public class BankAccount {

	private String accountNumber;
	
	private double balance;
	
	public BankAccount (String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
    	if (amount < 0) { throw new IllegalArgumentException("Deposit amount must b possitive"); }
    	
    	balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) { throw new IllegalArgumentException("Withdrawal amount must be positive."); }
        if (amount > balance) { throw new IllegalArgumentException("Insufficient funds."); }
        
        balance -= amount;
    }
	
	public static void main(String []args) {
		
		BankAccount account = new BankAccount("1234567", 10000.0);
		
		account.deposit(5000.0);
		System.out.printf("Account balance: %.2f%n", account.getBalance());
	
		account.withdraw(2000.0);
		System.out.printf("Account balance: %.2f", account.getBalance());
	}
}
