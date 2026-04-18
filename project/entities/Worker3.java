package project.entities;

import project.entities.enums.WorkerLevel3;

import java.util.ArrayList;
import java.util.List;

public class Worker3 {

    private String name;
    private WorkerLevel3 level;
    private Double baseSalary;

    private List<HourContract3> contract = new ArrayList<>();
    private Department3 department;

    public Worker3(){

    }

    public Worker3(String name, WorkerLevel3 level, Double baseSalary,Department3 department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public WorkerLevel3 getLevel(){
        return level;
    }

    public void setLevel(WorkerLevel3 level){
        this.level = level;
    }

    public Double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary){
        this.baseSalary = baseSalary;
    }

    public Department3 getDepartment(){
        return department;
    }

    public void setDepartment(Department3 department){
        this.department = department;
    }

    public void addContract(HourContract3 contract){
        this.contract.add(contract);
    }

    public void removeContract(HourContract3 contract){
        this.contract.remove(contract);
    }

    public double income(Integer year, Integer month){
        double sum = baseSalary;
        for(int i = 0; i < contract.size(); i++){
            if(year == contract.get(i).getDate().getYear() && month == contract.get(i).getDate().getMonthValue()){
                sum += contract.get(i).totalValue();
            }
        }
        return sum;
    }
    


}
