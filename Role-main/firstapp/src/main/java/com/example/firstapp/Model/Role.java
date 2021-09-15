package com.example.firstapp.Model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Column(name = "role_name")
    private String roleName;

}

