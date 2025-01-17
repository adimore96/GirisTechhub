/*
5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
*/

class BankAccount{
    protected int amount;
    BankAccount(int amount){
        this.amount = amount;
    }

    public void deposit(int deposite){
        amount = amount+deposite;
        System.out.println("Amount Deposited: "+deposite);
        System.out.println("Current Balance: "+amount);
    }

    public void withdraw(int withdraw){
        if(amount>=withdraw){
            amount -= withdraw;
            System.out.println("Amount withdrawn: "+withdraw);
        }else{
            System.out.println("Insufficient funds...!");
        }
    }

    public void getBalance(){
        System.out.println("Balance: "+amount);
    }
}

class SavingsAccount extends BankAccount{
    SavingsAccount(int amount){
        super(amount);
    }
    public void withdraw(int withdraw){
         if((amount-withdraw)<100){
           
            System.out.println("Withdrawal denied! Need to maintain funds..!");
        }else{
            super.withdraw(withdraw);
        }
    }
}

public class BankApp{
    public static void main(String args[]){
        SavingsAccount sa = new SavingsAccount(250);
        sa.deposit(100);
        sa.withdraw(250);
        sa.getBalance();
        sa.withdraw(50);
    }
}