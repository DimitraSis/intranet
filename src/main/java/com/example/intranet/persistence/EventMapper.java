package com.example.intranet.persistence;

import com.example.intranet.entities.Event;

import java.util.List;

public class EventMapper {

    private static Event event = new Event();

    public static Event getEvent() {
        return event;
    }


}
