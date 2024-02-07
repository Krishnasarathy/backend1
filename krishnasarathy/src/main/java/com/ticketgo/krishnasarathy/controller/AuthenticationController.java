package com.ticketgo.krishnasarathy.controller;


import static com.ticketgo.krishnasarathy.Utils.MyConstant.LOGIN;
import static com.ticketgo.krishnasarathy.Utils.MyConstant.REGISTER;
import static org.springframework.http.HttpStatus.ACCEPTED;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketgo.krishnasarathy.Utils.MyConstant;
import com.ticketgo.krishnasarathy.dto.request.LoginRequest;
import com.ticketgo.krishnasarathy.dto.request.RegisterRequest;
import com.ticketgo.krishnasarathy.dto.response.LoginResponse;
import com.ticketgo.krishnasarathy.dto.response.RegisterResponse;
import com.ticketgo.krishnasarathy.service.AuthenticationService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping(MyConstant.AUTH)
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

  
    @PostMapping(REGISTER)
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request){
        RegisterResponse response=new RegisterResponse();
        try {
            response=authenticationService.register(request);
            return new ResponseEntity<>(response,ACCEPTED);

        } catch (Exception e) {
            response.setMessage("Something went wrong");
            return new ResponseEntity<>(response,EXPECTATION_FAILED);
        }
    }

    @PostMapping(LOGIN)
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request){
        LoginResponse response= new LoginResponse();
        try {
            response=authenticationService.login(request);
            return new ResponseEntity<>(response,ACCEPTED);
        } catch (Exception e) {
            System.out.println(e.getCause());
            response.setMessage("Something went wrong");
            response.setToken("");
            return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
        }
    }
}
