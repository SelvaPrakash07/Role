package com.example.firstapp.Dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UserDto {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RoleDto> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleDto> roles) {
        this.roles = roles;
    }

    private String password;

    private List<RoleDto> roles;


}
