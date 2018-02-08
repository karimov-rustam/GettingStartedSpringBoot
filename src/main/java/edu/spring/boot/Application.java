package edu.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableAutoConfiguration
//@Import(MyConfiguration.class)
//@ComponentScan()
@RestController
@SpringBootApplication
public class Application {

    @Value("${name}")
    String name;

    @Autowired
    String message;

    @Autowired
    private MyMessage myMessage;

    @RequestMapping("/test")
    public String home() {
        return message;
    }


    @RequestMapping("/")
    public String welcome() {
        return "Welcome, your lucky number is " + myMessage.getMessageValue();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
