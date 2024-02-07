package com.ticketgo.krishnasarathy.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticketgo.krishnasarathy.model.User;

public interface UserRepository extends JpaRepository<User,String>{

    Optional<User> findByEmail(String username);

}
