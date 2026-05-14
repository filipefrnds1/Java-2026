package projecttrycatch.entities;

import projecttrycatch.model.exceptions.DomainExceptionAccount3;

public class Account3 {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account3(){

    }

    public Account3(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber(){
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount){
        withdrawError(amount);
        balance -= amount;
    }

    public void withdrawError(Double amount){
        if(amount > withdrawLimit){
            throw new DomainExceptionAccount3("The amount exceeds withdraw limit");
        }
        if(amount > balance){
            throw new DomainExceptionAccount3("Not enough balance");
        }
    }


}
