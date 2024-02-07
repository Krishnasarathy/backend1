package com.ticketgo.krishnasarathy.dto.response;

import java.util.List;

import com.ticketgo.krishnasarathy.model.Event;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventResponse {
    private String message;
    private List<Event> data;
}
