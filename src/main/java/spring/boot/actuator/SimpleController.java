package spring.boot.actuator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @Qualifier("counterService")
    @Autowired
    private CounterService counterService;

    @RequestMapping("/execute")
    public String execute() {
        counterService.increment("simple.service.execute");
        return "invoked";
    }
}
