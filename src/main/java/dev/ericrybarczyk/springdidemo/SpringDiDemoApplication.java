package dev.ericrybarczyk.springdidemo;

import dev.ericrybarczyk.springdidemo.controllers.DemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDiDemoApplication {

    /*
        This is a very minimal example, there is no web server so it just starts and stops quickly,
        but it does show, via the console output, that the Controller is instantiated by the framework.
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDiDemoApplication.class, args);
        DemoController controller = (DemoController) applicationContext.getBean("demoController");
        String greeting = controller.sayHello();
        System.out.println(greeting + " (Return value from DemoController.sayHello() which is  called from SpringDiDemoApplication main() method)");
    }

}
