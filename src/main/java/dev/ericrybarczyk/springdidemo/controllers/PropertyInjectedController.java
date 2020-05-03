package dev.ericrybarczyk.springdidemo.controllers;

import dev.ericrybarczyk.springdidemo.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
