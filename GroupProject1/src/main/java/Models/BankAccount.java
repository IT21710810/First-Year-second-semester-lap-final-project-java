package Models;

public class BankAccount {
    private String ownerName;
    private int accountNo;
    private float balance;

    public BankAccount(String ownerName, int accountNo, float balance) {
        this.ownerName = ownerName;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public BankAccount() {
        this.ownerName = null;
        this.accountNo = 0;
        this.balance = 0.0f;
    }

    public String printAccount() {
        return ownerName + " " + accountNo + " (" + balance + " )";
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getAccountNumber() {
        return this.accountNo;
    }

    public float getAccountBalance() {
        return this.balance;
    }
    
    
    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public void setAccountNumber(int no) {
        this.accountNo = no;
    }

    public void setAccountBalance(float balance) {
        this.balance = balance;
    }
}
