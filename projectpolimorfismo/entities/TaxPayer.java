package projectpolimorfismo.entities;

public abstract class TaxPayer {

    private String name;
    private Double anuIncome;

    public TaxPayer(){

    }

    public TaxPayer(String name, Double anuIncome) {
        this.name = name;
        this.anuIncome = anuIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnuIncome() {
        return anuIncome;
    }

    public void setAnuIncome(Double anuIncome) {
        this.anuIncome = anuIncome;
    }

    public abstract double taxesPaid();
}
