package projectcomposi133.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client3 {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String name;
    private String email;
    private LocalDate birthDate;

    public Client3(){

    }

    public Client3(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Client: ").append(getName()).append(" (").append(fmt1.format(getBirthDate()))
                .append(") - ").append(getEmail()).append("\n");
        return sb.toString();
    }


}
