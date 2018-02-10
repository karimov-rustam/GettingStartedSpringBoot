package spring.boot.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootDataApplication {

    @Autowired
    private EntityManager em;


    @RequestMapping("/stocks")
    public List<Stock> stocks() {
        return em.createQuery("select s from Stock s").getResultList();

    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataApplication.class, args);
    }
}
