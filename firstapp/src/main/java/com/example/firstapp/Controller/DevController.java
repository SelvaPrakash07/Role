package com.example.firstapp.Controller;


import com.example.firstapp.Dto.UserDto;
import com.example.firstapp.Dto.UserSignupRequestVO;
import com.example.firstapp.Service.Service;
import com.example.firstapp.response.BaseResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class DevController {

    @Autowired
    private Service service;

    @PostMapping(value="/save")
    public void Save(@RequestBody UserDto userDto){
        service.Saveuser(userDto);
    }

    @GetMapping(value = "/user/login", consumes = {"application/json"})
    @ApiOperation(value = "user login ")
    public BaseResponse UserLogin(@RequestBody UserSignupRequestVO userSignupRequestVO) {
        return service.logOfUser(userSignupRequestVO);
    }

    @RolesAllowed(value="USER")
    @GetMapping(value="/hello")
    public String HelloWorld(){
        final String hello = "hello";
        return hello;
    }
    @RolesAllowed(value="ADMIN")
    @GetMapping(value="/bye")
    public String Admin(){
        final String hello = "Admin";
        return hello;
    }


}
