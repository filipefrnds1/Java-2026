package projectpolimorfismo.entities;

import projectherança.entities.Account2;

public class BusinessAccount2 extends Account2 {
    public Double loadLimit;

    public BusinessAccount2(){
        super();
    }

    public BusinessAccount2(Integer number, String holder, Double balance, Double loadLimit) {
        super(number, holder, balance);
        this.loadLimit = loadLimit;
    }

    public Double getLoadLimit() {
        return loadLimit;
    }

    public void setLoadLimit(Double loadLimit) {
        this.loadLimit = loadLimit;
    }

    public void loan(Double amount){
        if(amount <= loadLimit){
            balance += loadLimit - 10.0;
        }
    }

    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }
}
