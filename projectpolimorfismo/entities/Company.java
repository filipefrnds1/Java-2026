package projectpolimorfismo.entities;

public class Company extends TaxPayer{

    private Integer employee;

    public Company(){

    }

    public Company(String name, Double anuIncome, Integer employee) {
        super(name, anuIncome);
        this.employee = employee;
    }

    public Integer getEmployee() {
        return employee;
    }

    public void setEmployee(Integer employee) {
        this.employee = employee;
    }

    @Override
    public double taxesPaid() {

        if(getEmployee() > 10){
            return getAnuIncome()*0.14;
        }
        else{
            return getAnuIncome()*0.16;
        }

    }
}
