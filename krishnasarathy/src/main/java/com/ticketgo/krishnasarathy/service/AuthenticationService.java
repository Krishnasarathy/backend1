package com.ticketgo.krishnasarathy.service;

import com.ticketgo.krishnasarathy.dto.request.LoginRequest;
import com.ticketgo.krishnasarathy.dto.request.RegisterRequest;
import com.ticketgo.krishnasarathy.dto.response.LoginResponse;
import com.ticketgo.krishnasarathy.dto.response.RegisterResponse;

public interface AuthenticationService {

    RegisterResponse register(RegisterRequest request);

    LoginResponse login(LoginRequest request);

}
