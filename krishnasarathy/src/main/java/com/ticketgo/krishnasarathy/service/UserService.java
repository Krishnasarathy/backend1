package com.ticketgo.krishnasarathy.service;

import com.ticketgo.krishnasarathy.dto.response.BasicResponse;
import com.ticketgo.krishnasarathy.dto.response.UserResponse;

public interface UserService {

    BasicResponse<UserResponse> getAllUser();

}
