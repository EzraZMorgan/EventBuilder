package com.example.EventBuilder;

public class EventBuilder {
    public static void main(String[] args) {
        EventDispatcher dispatcher = new EventDispatcher();

        // Adding a listener for "testEvent"
        dispatcher.addListener("testEvent", event ->
                System.out.println("Received event: " + event.getType() + " with data: " + event.getData())
        );

        // Dispatching an event
        dispatcher.dispatch(new Event("testEvent", "If you see this, that means this works!"));
    }
}
