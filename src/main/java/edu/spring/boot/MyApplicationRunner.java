package edu.spring.boot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println("These are the args for the application");

        for (String arg :
                applicationArguments.getOptionNames()) {
            System.out.println(arg);
        }
    }
}
