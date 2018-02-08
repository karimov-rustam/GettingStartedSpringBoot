package edu.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

    @Value("${name}")
    String name;

    @Autowired
    String message;

    @Autowired
    private MyMessage myMessage;

    @Autowired
    ApplicationArguments applicationArguments;

    @RequestMapping("/test")
    public String home() {
        return message;
    }


    @RequestMapping("/")
    public String welcome() {
        String value = applicationArguments.getOptionNames().iterator().next();
        return "Welcome, your lucky number is " + myMessage.getMessageValue() + value;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
