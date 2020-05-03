package dev.ericrybarczyk.springdidemo.controllers;

import dev.ericrybarczyk.springdidemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        // pretend we are an IoC container and inject the needed dependency
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        final String EXPECTED = "Hello World";
        String actual = controller.getGreeting();
        assertEquals(EXPECTED, actual);
    }
}