package project.entities;

import project.entities.enums.WorkerLevel5;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Worker5 {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM/yyyy");

    private String name;
    private WorkerLevel5 level;
    private Double baseSalary;
    private Department5 depart;

    List<HourContract5> contract = new ArrayList<>();

    public Worker5(String name, WorkerLevel5 level, Double baseSalary, Department5 depart) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.depart = depart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel5 getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel5 level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department5 getDepart() {
        return depart;
    }

    public void setDepart(Department5 depart) {
        this.depart = depart;
    }

    public void addContract(HourContract5 cont){
        contract.add(cont);
    }

    public void removeContract(HourContract5 cont){
        contract.remove(cont);
    }

    public Double income(Integer year,Integer month){
        double sum = baseSalary;
        for(HourContract5 cont : contract){
            if(year == cont.getDate().getYear() && month == cont.getDate().getMonthValue()){
                sum += cont.totalValue();
            }
        }
        return sum;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getName()).append("\n");
        sb.append("Department: ").append(getDepart().getName());
        return sb.toString();
    }
}
