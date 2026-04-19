package projectcomposi133.entities;

import java.time.LocalDateTime;

public class Client {

    private String name;
    private String email;
    private LocalDateTime birthDate;

    public Client(){

    }

    public Client(String name, String email, LocalDateTime birthDate) {
        setName(name);
        setEmail(email);
        setBirthDate(birthDate);
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

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
}
