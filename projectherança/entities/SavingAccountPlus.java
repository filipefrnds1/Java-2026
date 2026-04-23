package projectherança.entities;

public class SavingAccountPlus extends SavingsAccount2{

    @Override
    public void withdraw(double amount){
        balance -= amount + 2.0;
    }
}
