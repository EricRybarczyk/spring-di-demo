package dev.ericrybarczyk.springdidemo.controllers;

import dev.ericrybarczyk.springdidemo.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        // pretend we are an IoC container and inject the needed dependency
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        final String EXPECTED = "Hello World";
        String actual = controller.getGreeting();
        assertEquals(EXPECTED, actual);
    }
}