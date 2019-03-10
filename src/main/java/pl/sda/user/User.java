package pl.sda.user;

import java.util.Objects;

public class User {

    private Integer id;
    private String email;
    private String password;

    public User(String email,
                String password) {
        this.email = Objects.requireNonNull(email, "Email should be defined");
        this.password = Objects.requireNonNull(password, "Password should be defined");;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
