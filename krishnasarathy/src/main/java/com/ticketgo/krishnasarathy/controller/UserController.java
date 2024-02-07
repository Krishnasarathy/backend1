package com.ticketgo.krishnasarathy.controller;

import static com.ticketgo.krishnasarathy.Utils.MyConstant.USER;
import static com.ticketgo.krishnasarathy.Utils.MyConstant.USERLIST;
import static org.springframework.http.HttpStatus.EXPECTATION_FAILED;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketgo.krishnasarathy.dto.response.BasicResponse;
import com.ticketgo.krishnasarathy.dto.response.UserResponse;
import com.ticketgo.krishnasarathy.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(USER)
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;

        @GetMapping(USERLIST)
        public ResponseEntity<BasicResponse<UserResponse>> create() {
            BasicResponse<UserResponse> response=   new BasicResponse<>(); 
            try {
                response=userService.getAllUser();
                return new ResponseEntity<>(response,HttpStatus.OK);
            } catch (Exception e) {
                response.setMessage("Something went wrong");
                return new ResponseEntity<>(response,EXPECTATION_FAILED);
                
            }
        }
    
}
