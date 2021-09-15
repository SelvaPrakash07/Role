package com.example.firstapp.Model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;


@Entity
@Table(name="userrole")
public class UserRole {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @OneToOne
    @JoinColumn(name="user_id_fk")
    private User user;

    @ManyToOne
    @JoinColumn(name="role_id_fk")
    private Role role;


}