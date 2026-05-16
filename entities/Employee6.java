package entities;

public class Employee6 {
    private Integer id;
    private String name;
    private Double salary;

    public Employee6(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void percentSalary(double percent){
        salary += (salary * percent);
    }
    @Override
    public String toString(){
        return getId() +
                ", " +
                getName() +
                ", " +
                String.format("%.2f", getSalary());
    }
}
