package dev.ericrybarczyk.springdidemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    public String sayHello() {
        System.out.println("Hello World! (this is inside the DemoController sayHello() method)");
        return "Hi Folks!";
    }
}
