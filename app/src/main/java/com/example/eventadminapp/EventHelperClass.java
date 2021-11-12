package com.example.eventadminapp;

public class EventHelperClass {
    String EventName, EventDate, EventInfo;

    public EventHelperClass() {
    }

    public EventHelperClass(String eventName, String eventDate, String eventInfo) {
        EventName = eventName;
        EventDate = eventDate;
        EventInfo = eventInfo;
    }

    public String getEventName() {
        return EventName;
    }

    public void setEventName(String eventName) {
        EventName = eventName;
    }

    public String getEventDate() {
        return EventDate;
    }

    public void setEventDate(String eventDate) {
        EventDate = eventDate;
    }

    public String getEventInfo() {
        return EventInfo;
    }

    public void setEventInfo(String eventInfo) {
        EventInfo = eventInfo;
    }
}
