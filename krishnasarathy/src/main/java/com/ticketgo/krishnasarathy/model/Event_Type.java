package com.ticketgo.krishnasarathy.model;

import static jakarta.persistence.GenerationType.UUID;

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
@Table(name = "Event_Type")
public class Event_Type {
    @Id
    @GeneratedValue(strategy=UUID)
    private String event_type_id;

    @Column(nullable = false)
    private String event_type_name;
    

}
