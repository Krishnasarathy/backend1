package com.ticketgo.krishnasarathy.service.impl;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ticketgo.krishnasarathy.Repository.UserRepository;
import com.ticketgo.krishnasarathy.dto.response.BasicResponse;
import com.ticketgo.krishnasarathy.dto.response.UserResponse;
import com.ticketgo.krishnasarathy.model.User;
import com.ticketgo.krishnasarathy.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class UserServiceimpl implements UserService{
    
    private final UserRepository userRepository;


    @Override
    public BasicResponse<UserResponse> getAllUser() {
        List<User> users=userRepository.findAll();
        List<UserResponse> useresponse=users.stream().map(user->UserResponse.builder()
        .id(user.getId())
        .name(user.getUsername())
        .email(user.getEmail())
        .build()).collect(Collectors.toList());
        return BasicResponse.<UserResponse>builder().message("User data fetch successfully").data(useresponse).build();
        
        
        
    }
    
}
