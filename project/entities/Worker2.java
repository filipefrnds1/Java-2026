package project.entities;

import project.entities.enums.WorkerLevel2;

import java.util.ArrayList;
import java.util.List;

public class Worker2 {
    private String name;
    private WorkerLevel2 level;
    private Double baseSalary;

    Department2 depart;
    List<HourContract2> list = new ArrayList<>();

    public Worker2(){

    }

    public Worker2(String name, WorkerLevel2 level, Double baseSalary, Department2 depart){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.depart = depart;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public WorkerLevel2 getLevel(){
        return level;
    }

    public void setLevel(WorkerLevel2 level){
        this.level = level;
    }

    public Double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary){
        this.baseSalary = baseSalary;
    }

    public Department2 getDepart(){
        return depart;
    }

    public void setDepart(Department2 depart){
        this.depart = depart;
    }

    public void addContract(HourContract2 contract){
        list.add(contract);
    }

    public void removeContract(HourContract2 contract){
        list.remove(contract);
    }


    public Double income(Integer year, Integer month){
        double sum = baseSalary;
        for(int i = 0; i < list.size(); i++){
            if(year == list.get(i).getDate().getYear() && month == list.get(i).getDate().getMonthValue()){
                sum += list.get(i).totalValue();
            }
        }
        return sum;
    }


    /*
    public Double income(Integer year, Integer month){
        double sum = baseSalary;
        for (HourContract2 hourContract2 : list) {
            if (year == hourContract2.getDate().getYear() && month == hourContract2.getDate().getMonthValue()) {
                sum += hourContract2.totalValue();
            }
        }
        return sum;
    }
    */


}
