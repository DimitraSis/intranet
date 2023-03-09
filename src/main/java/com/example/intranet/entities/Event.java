package com.example.intranet.entities;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private List<Participant> participantList= new ArrayList<>();

    public Event() {

    }

    public void addParticipant(Participant participant){

        participantList.add(participant);
    }

    public List<Participant> getParticipantList() {
        return participantList;
    }
}
