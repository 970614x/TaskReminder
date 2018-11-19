package pl.chrislembr.task.models.entities;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "user_login")
@Data
public class UserEntity {
    private @Id @GeneratedValue int id;
    private String login;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
