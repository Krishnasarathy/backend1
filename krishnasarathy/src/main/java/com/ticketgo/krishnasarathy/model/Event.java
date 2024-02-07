package com.ticketgo.krishnasarathy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Event")
public class Event {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private String event_id;

    @Column(nullable = false)
    private String event_name;

    @Column(nullable = false)
    private String event_type;

    @Column(nullable = false)
    private Double price;
    
}
