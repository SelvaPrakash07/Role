package com.example.firstapp.Model;


import lombok.*;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="user")
public class User {
    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(List<UserRole> roles) {
        this.roles = roles;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "role")
    private List<UserRole> roles;

    public User(User user) {
        this.id = user.getId();
        this.roles = user.getRoles();
        this.userName = user.getUserName();
    }

}

