package entities;

public class Employee2 {
    private Integer id;
    private String name;
    private Double salario;

    public Employee2(){

    }

    public Employee2(Integer id, String name, Double salario){
        this.id = id;
        this.name = name;
        setSalario(salario);
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

    public Double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public void increasePercent(Double percent){
        this.salario += (percent/100) * salario;

    }

    @Override
    public String toString(){
        return getId() +
                ", " +
                getName() +
                ", " +
                String.format("%.2f", getSalario());
    }
}
