package spring.boot.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDataApplication {

    @Autowired
    private StockRepository repo;

    @RequestMapping("/stocks/{symbol}")
    public Stock stock(@PathVariable("symbol") String symbol) {
        return repo.findBySymbol(symbol);
    }

    @RequestMapping("/stocks/create")
    public String createStock() {
        Stock stock = new Stock();
        stock.setCeo("Rustam");
        stock.setCompanyName("Company Name");
        stock.setSymbol("CN");
        stock.setStockId(5);
        stock.setPrice(5.0d);
        repo.save(stock);
        return "created";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataApplication.class, args);
    }
}
