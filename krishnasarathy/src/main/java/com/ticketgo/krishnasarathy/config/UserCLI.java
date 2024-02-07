package com.ticketgo.krishnasarathy.config;

import static com.ticketgo.krishnasarathy.enumerated.Role.ADMIN;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.ticketgo.krishnasarathy.Repository.UserRepository;
import com.ticketgo.krishnasarathy.model.User;

import lombok.RequiredArgsConstructor;


@Component  //creating a container inside spring bean
@RequiredArgsConstructor //final key word
@SuppressWarnings("null")
public class UserCLI implements CommandLineRunner {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    
    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count()>0) 
            return;
        
        var user=User.builder() //import user from usermodel
            .username("Krishnasarathy")
            .email("ksadmin@ticketgo.com")
            .password(passwordEncoder.encode("Ks@123"))
            .role(ADMIN)
            .build();
        
        userRepository.save(user);
        
    }

}
