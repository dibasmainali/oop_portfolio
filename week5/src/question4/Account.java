package question4;

class Account {
    private String name;
    private int accountNumber;
    private double balance;

    public Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public Account(String name, int accountNumber) {
        this(name, accountNumber, 0.0);
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
    
    @Override
    public String toString() {
        return "Account holder: " + name + "\nAccount Number: " + accountNumber + "\nBalance: $" + balance;
    }
}