package project.entities;

import project.entities.enums.WorkerLevel4;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Worker4 {

    private String name;
    private WorkerLevel4 level;
    private Double baseSalary;
    private Department4 department;

    List<HourContract4> contract = new ArrayList<>();

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/yyyy");

    public Worker4(){

    }

    public Worker4(String name, WorkerLevel4 level, Double baseSalary, Department4 department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel4 getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel4 level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department4 getDepartment() {
        return department;
    }

    public void setDepartment(Department4 department) {
        this.department = department;
    }

    public void addContract(HourContract4 contract){
        this.contract.add(contract);
    }

    public void removeContract(HourContract4 contract){
        this.contract.add(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;
        for(HourContract4 c : contract){
            if(c.getDate().getMonthValue() == month && c.getDate().getYear() == year){
                sum += c.totalValue();
            }
        }
        return sum;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Department: ").append(department.getName());
        return sb.toString();
    }

}
