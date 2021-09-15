package com.example.firstapp.Service;


import com.example.firstapp.Dto.UserDto;
import com.example.firstapp.Dto.UserSignupRequestVO;
import com.example.firstapp.response.BaseResponse;

public interface Service {
    void Saveuser(UserDto userDto);
    public BaseResponse logOfUser(UserSignupRequestVO userSignupRequestVO);
}
