package easymytrip.example.easymytrip;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {

    @GetMapping("/bus")

    public String getData() {
        return "please book your bus ticket on vande bharat 80% discount" ; }

}


