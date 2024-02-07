package com.ticketgo.krishnasarathy.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsetEventRequest {
     private String customer_name;

    private String event_name;

    
}
