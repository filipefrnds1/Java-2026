package projectpolimorfismo.entities;

public class Individual extends TaxPayer{

    private Double healthExpend;

    public Individual(){
        
    }

    public Individual(String name, Double anuIncome, Double healthExpend) {
        super(name, anuIncome);
        this.healthExpend = healthExpend;
    }

    public Double getHealthExpend() {
        return healthExpend;
    }

    public void setHealthExpend(Double healthExpend) {
        this.healthExpend = healthExpend;
    }

    @Override
    public double taxesPaid(){

        if (getAnuIncome() >= 20000.00) {
            return (getAnuIncome() * 0.25) - (getHealthExpend()*0.50);

        }
        else {
            return (getAnuIncome() * 0.15) - (getHealthExpend()*0.50);
        }

    }
}
