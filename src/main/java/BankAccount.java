public class BankAccount {
	private String name;
    private int balance;
    private int minBalance = -1000;

    // Constructor
    public BankAccount(String name, int balance) {
    	this.name=name;
        this.balance = balance;
    }

    // GETTERS
    public int getBalance() {
        return this.balance;
    }

    public int getMinBalance() {
        return this.minBalance;
    }

    // SETTERS
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Method to withdraw amount
    public boolean withdraw(int amount) {
        if (balance - amount < minBalance) {
        	System.out.println("amount exited the minimum limit");
            return false;
        }
        balance = balance - amount;
        return true;
    }

    // Method to deposit amount
    public void deposit(int amount) {
        this.balance = this.balance + amount;
    }

    // Method to transfer amount to another BankAccount
    public String transfer(BankAccount targetAccount, int amount) {
    	if(this.balance-amount<minBalance) {
    		return "ERROR"
    	}
        this.withdraw(amount);
        targetAccount.deposit(amount);
        return this.name+" have been deposited "+amount+" by "+targetAccount.name;
    }
}