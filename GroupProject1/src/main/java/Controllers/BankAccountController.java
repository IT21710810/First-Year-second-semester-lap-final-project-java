package Controllers;
import Models.SavingsAccount;
public class BankAccountController {
   SavingsAccount objSavings;   
   public SavingsAccount addSavingsAccount(String ownerName,int accountNo,float balance,float interestRate,boolean flag)
   {
       objSavings=new SavingsAccount(ownerName,accountNo,balance,interestRate,flag);
       return objSavings;
   }
}
