package spring.boot.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCacheApplication implements CommandLineRunner {

    @Autowired
    private StockTracker tracker;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCacheApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {
        System.out.println("The price is...");

        for (int i = 0; i < 10; i++) {
            System.out.println(tracker.getPrice("T"));
        }
    }
}
