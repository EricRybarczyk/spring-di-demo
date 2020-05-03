package dev.ericrybarczyk.springdidemo.controllers;

import dev.ericrybarczyk.springdidemo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        // generally mimic what Spring Framework does for us - provide needed dependencies
        controller = new PropertyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        // trivial test, but it shows the controller code works
        final String EXPECTED = "Hello World";
        String actual = controller.getGreeting();
        assertEquals(EXPECTED, actual);
    }
}