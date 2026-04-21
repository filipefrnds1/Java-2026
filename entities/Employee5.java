package entities;

public class Employee5 {

    private Integer id;
    private String name;
    private Double salary;

    public Employee5(){

    }

    public Employee5(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getSalary(){
        return salary;
    }

    public void percentSalary(double percent){
        salary += salary * percent / 100;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getId()).append(", ").append(getName()).append(", ").append(String.format("%.2f", getSalary()));
        return sb.toString();
    }
}
