package za.co.autogods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import za.co.autogods.service.GameService;

@SpringBootApplication
public class AutoGodsApplication {

    @Autowired
    private GameService gameService;

    public static void main(String[] args) {
        SpringApplication.run(AutoGodsApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            gameService.start();
        };
    }

}
