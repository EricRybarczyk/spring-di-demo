package dev.ericrybarczyk.springdidemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World, I Am Constructor.";
    }
}
