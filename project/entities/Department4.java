package project.entities;

public class Department4 {

    private String name;

    public Department4(){

    }

    public Department4(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return getName();
    }
}
