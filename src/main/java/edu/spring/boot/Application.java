package edu.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@Controller
@ServletComponentScan
public class Application extends WebMvcConfigurerAdapter{

    @RequestMapping("/thymeleaf")
    public String tleaf() {
        return "template";
    }

    @RequestMapping("/viewresolver")
    public String viewResolver() {
        return "viewresolver";
    }

    @ResponseBody
    @RequestMapping("/cat")
    public Cat cat() {
        return new Cat("Athena", "Bengal", 1);
    }

//    @RequestMapping("/mustache")
//    public String mustache(Model model) {
//        model.addAttribute("company", "Roga & Copyta limited");
//        return "template";
//    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
