package oopPractices;

public class Account {
    int accountNumber;
    String owner;
    double balance;
    double limit;


    boolean withdraw(double amount) {
        double newBalance = this.balance - amount;
        this.balance = newBalance;
        if (this.balance < amount){
            return false;
    }
        else{
            this.balance -= amount;
        }
            return true;
    }

    void deposit(double amount){
        this.balance += amount;
    }
    boolean transferTo(Account destination, double amount){
        this.balance -= amount;
        if(this.balance < amount){
            return false;
        }else {
            this.balance -= amount;
            destination.balance += amount;
            return true;
        }
    }

    public static void main(String[] args) {
        Account myFirstAccount = new Account();
        myFirstAccount.accountNumber = 21111111;
        myFirstAccount.owner = "Fatai";
        myFirstAccount.balance = 5000000.00;


        boolean successful = myFirstAccount.withdraw(500000);
        if(successful){
            System.out.println("Congratulation you got your money");
        } else{
            System.out.println("Where is my money");
        }

        myFirstAccount.deposit(200000);
        System.out.println("Account owner:" + myFirstAccount.owner);
        System.out.println("Account number:" + myFirstAccount.accountNumber);
        System.out.println("Current balance:" + myFirstAccount.balance);


        Account mySecondAccount = new Account();
        mySecondAccount.accountNumber = 311111111;
        mySecondAccount.owner = "Kareem";
        mySecondAccount.balance = 10000000;

        mySecondAccount.withdraw(1000000);
        System.out.println("Account owner:" + mySecondAccount.owner);
        System.out.println("Account number:" + mySecondAccount.accountNumber);
        System.out.println("Current balance:" + mySecondAccount.balance);

        myFirstAccount.balance = 5000000;
        mySecondAccount.balance = 10000000;

        mySecondAccount.transferTo(myFirstAccount, 2500000);

        System.out.println("My first account=" + myFirstAccount.balance);
        System.out.println("My second account=" + mySecondAccount.balance);





    }
}
