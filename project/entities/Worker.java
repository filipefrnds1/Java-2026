package project.entities;

import project.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private List<HourContract> cont = new ArrayList<>();
    private Department department;

    public Worker(String name, WorkerLevel level, Double baseSalary, Department dep) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = dep;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<HourContract> getCont() {
        return cont;
    }

    public void setCont(List<HourContract> cont) {
        this.cont = cont;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void addContract(HourContract contract){
        cont.add(contract);
    }

    public void removeContract(HourContract contract){
        cont.remove(contract);
    }

    public Double income(int year, int month){
        double sum = baseSalary;
        for(HourContract c : cont){
            if(year == c.getDate().getYear() && month == c.getDate().getMonthValue()){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
