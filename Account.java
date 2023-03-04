 
public class Account {
    private static int account_count;
    private double balance;
    private int id;

    public Account(){
        this.id = Account.account_count;
        Account.account_count++;
    }
    public Account(double startingBalance){
        this.balance = startingBalance;
    }
    //withdraw money from the balance 
    public boolean withdraw(double amount){
        if((balance - amount)>0){
            this.balance = balance - amount;
            return true;
        }
        else{
            return false;
        }
    }
    //get balance of the account
    public double getBalance(){
        return this.balance;
    }
    //add money to deposite
    public void deposit(double amount){
        balance += amount;
    }
    //get id of the account
    public int getId(){
        return this.id;
    }
}
