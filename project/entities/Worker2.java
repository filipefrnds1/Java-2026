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

    


}
