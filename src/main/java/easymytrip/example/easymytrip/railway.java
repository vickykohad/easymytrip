package easymytrip.example.easymytrip;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class railway {

    @GetMapping("/railway")

    public String getData() {
        return "please book your train ticket on vande bharat 25% discount" ; }

    }


