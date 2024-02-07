package com.ticketgo.krishnasarathy.Utils;

import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.HEAD;
import static org.springframework.http.HttpMethod.PATCH;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.HttpMethod.PUT;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;

public class MyConstant {
    // Request Mapping
    public static final String AUTH="/api/v1/auth";
    public static final String USER="/api/v1/user";

    // End Points
    public static final String REGISTER="/register";
    public static final String LOGIN="/login";
    public static final String USERLIST="/list";

    
    // Web Security
    public static final List
    <String> ORIGINS=Arrays.asList("https://localhost:4000");
    public static final List<String> HEADERS=Arrays.asList(HttpHeaders.AUTHORIZATION,HttpHeaders.CONTENT_TYPE);
    public static final List<String> METHODS=Arrays.asList(GET.name(),POST.name(),
    PUT.name(),PATCH.name(),DELETE.name(),HEAD.name());

}
