package com.example.firstapp.Dto;

import com.example.firstapp.Model.Role;
import com.example.firstapp.Model.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


public class UserSignupRequestVO {
    private long id;

    private String userName;

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "UserSignupRequestVO{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", jwtToken='" + jwtToken + '\'' +
                ", password='" + password + '\'' +
                ", roleList=" + roleList +
                '}';
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<UserRole> roleList) {
        this.roleList = roleList;
    }

    private String jwtToken;

    private String password;

    private List<UserRole> roleList;

}
