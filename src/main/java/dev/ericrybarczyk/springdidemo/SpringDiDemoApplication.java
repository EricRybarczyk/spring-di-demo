package dev.ericrybarczyk.springdidemo;

import dev.ericrybarczyk.springdidemo.controllers.*;
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
        System.out.println("------- Primary Bean");
        String greeting = controller.sayHello();
        System.out.println(greeting + " (Return value from DemoController.sayHello() which is called from SpringDiDemoApplication main() method)");

        System.out.println("------- I18nController");
        I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        // get references to our Spring Components to see how they can get injected for us

        System.out.println("------- Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
        System.out.println("Output from injected PropertyInjectedController: " + propertyInjectedController.getGreeting());

        System.out.println("------- Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
        System.out.println("Output from injected SetterInjectedController: " + setterInjectedController.getGreeting());

        System.out.println("------- Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
        System.out.println("Output from injected ConstructorInjectedController:" + constructorInjectedController.getGreeting());
    }

}
