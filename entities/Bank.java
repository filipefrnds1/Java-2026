package entities;

public class Bank {
    private String accountNumber;
    private String name;
    private double accountValue;

    public Bank(){

    }

    public Bank(String accountNumber, String name, double accountValue){
        this.accountNumber = accountNumber;
        this.name = name;
        depValue(accountValue);
    }

    public Bank(String accountNumber, String name){
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void depValue(double valor){
        this.accountValue += valor;
    }

    public void saqValue(double valor){
        this.accountValue -= (valor+5.00);
    }

    public double getAccountValue(){
        return accountValue;
    }

    @Override
    public String toString(){
        return "Account " +
                getAccountNumber() +
                ", Holder: " +
                getName() +
                ", Balance: $ " +
                String.format("%.2f", getAccountValue());
    }


}
