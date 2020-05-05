package dev.ericrybarczyk.springdidemo.controllers;

import dev.ericrybarczyk.springdidemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    private final GreetingService greetingService;

    // no qualifier so we will get the @Primary bean here
    public DemoController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        //System.out.println("Hello World! (this is inside the DemoController sayHello() method)");
        return greetingService.sayGreeting();
    }
}
