package by.kobyzau.tg.bot.pbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Profile("prod")
public class BootApp {


  @GetMapping("/")
  public String hello() {
    return "hello";
  }

  public static void main(String[] args) {
    SpringApplication.run(BootApp.class, args);
  }
}
