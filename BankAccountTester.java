
public class BankAccountTester
{
    
    public static void main(String args[])
    {
        
        System.out.println("Information of Bank Accounts are as follows: ");
        
        BankAccount Abdullah = new BankAccount();
        BankAccount Osama = new BankAccount();
        BankAccount Ziyad = new BankAccount();
        BankAccount Malik = new BankAccount(237485732,25000,"SAR");
        
        Osama.setAccountNumber(239284914);
        Osama.setBalance(30000);
        Osama.setCurrency("SAR");
        System.out.println(Osama.toString());
        
        Abdullah.setAccountNumber(239487250);
        Abdullah.setBalance(40000);
        Abdullah.setCurrency("USD");
        System.out.println(Abdullah.toString());
        
        Ziyad.setAccountNumber(234628395);
        Ziyad.setBalance(60000);
        Ziyad.setCurrency("EUR");
        System.out.println(Ziyad.toString());
        
        System.out.println(Malik.toString());
       
        System.out.println();
        
        System.out.println("Operatin on bank Accounts: ");
        System.out.println("Withdraing 15000 USD from account "+Abdullah.getAccountNumber());
        if(Abdullah.withdraw(15000))
            System.out.println(Abdullah.toString());
        else
            System.out.println("Account Number "+Abdullah.getAccountNumber()+" don't have enough money to withdraw 15000 USD");
        
        System.out.println("Withdrawing 70000 EUR from account "+Ziyad.getAccountNumber());
        if(Ziyad.withdraw(70000))
            System.out.println(Ziyad.toString());
        else 
            System.out.println("Account Number ["+Ziyad.getAccountNumber()+"] don't have enough money to withdraw 70000 EUR");
        
        System.out.println("Depositing 10000 SAR to account "+Malik.getAccountNumber());
        Malik.deposit(10000);
        System.out.println(Malik.toString());
      
    }
   
}
//creating a class that contain personal information 
class BankAccount 
{
    int accountNumber;
    double balance;
    String currency;
    
    //Constrcotr method 
    public BankAccount()
    {
        accountNumber = -1;
        balance = 0;
        currency = "";
    }
    //overloading methods for bank information 
    public BankAccount(int accountNum,double initialBalance)
    {
        accountNumber = accountNum;
        balance = initialBalance;
        currency = "SAR";
    }
    public BankAccount(int accountNum, String aCurrency)
    {
        accountNumber = accountNum;
        balance = 0;
        currency = aCurrency;
    }
    public BankAccount(int accountNum,double initialBalance,String aCurrency)
    {
        accountNumber = accountNum;
        balance = initialBalance;
        currency = aCurrency;
        
    }
    //Getter methods 
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public String getCurrency()
    {
        return currency;
    }
    //Setter methods 
    public void setAccountNumber(int accountNum)
    {
        accountNumber = accountNum;
    }
    
    public void setBalance(double updatedBalance)
    {
        balance = updatedBalance;
    }
    
    public void setCurrency(String aCurrency)
    {
        currency = aCurrency;
    }
    //Method for withdraw money 
    public boolean withdraw(double amount)
    {
        if(amount <=0)
        return false;
        
        if(balance<amount)
            return false;

        balance -= amount;

        return true;
    }
        public boolean deposit(double amount)
    {
        if(amount <=0)
        return false;
        
        balance += amount;

        return true;
    }
    //Method to return Bank Account information 
    public String toString()
    {
        return String.format("Bank Account Number [%d] includes %s %.2f",accountNumber,currency,balance);
    }
}
