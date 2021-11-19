package Models;

public class SavingsAccount extends BankAccount {
    private float interestRate;
    private boolean flag;
    private static int totSavingsAccounts;

    public SavingsAccount(String ownerName, int accountNo, float balance, float interestRate, boolean flag) {
        super(ownerName, accountNo, balance);
        this.interestRate = interestRate;
        this.flag = flag;
        totSavingsAccounts++;
    }

    public SavingsAccount() {
        super();
        this.interestRate = 0.0f;
        this.flag = false;
        totSavingsAccounts++;
    }
    public float calculateBalance(){
        return super.getAccountBalance()*interestRate+super.getAccountBalance();
    }
    
    @Override
    public String printAccount() {
        return super.printAccount()+" "+this.interestRate+ " "+this.flag;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    public static int getTotSavingsAccounts() {
        return totSavingsAccounts;
    }
}
