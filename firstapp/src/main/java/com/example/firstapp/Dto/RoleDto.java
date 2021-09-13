package com.example.firstapp.Dto;

import lombok.Getter;
import lombok.Setter;


public class RoleDto {
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

    private String roleName;


}
