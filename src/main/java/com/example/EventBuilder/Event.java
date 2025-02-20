package com.example.EventBuilder;

// Event class
public class Event {
    private final String type;
    private final Object data;

    public Event(String type, Object data) {
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public Object getData() {
        return data;
    }
}

// Event Listener Interface
interface EventListener {
    void onEvent(Event event);
}

