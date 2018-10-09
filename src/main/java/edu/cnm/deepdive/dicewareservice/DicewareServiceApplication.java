package edu.cnm.deepdive.dicewareservice;

import javax.xml.ws.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.Async;

@SpringBootApplication
public class DicewareServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(DicewareServiceApplication.class, args);

  }
}
