package entities;

public class EmployeAula77Exer2 {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        this.grossSalary += (this.grossSalary * (percentage/100));
    }

    /*
    public String toString(){
            return name + ", $ " + String.format("%.2f", netSalary());
    }
     */
}
