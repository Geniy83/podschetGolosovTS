package by.nahodkin.tslosika4telegrambot.application;

import by.nahodkin.tslosika4telegrambot.podschet.Podschet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("by.nahodkin.tslosika4telegrambot.entity")
@EnableJpaRepositories("by.nahodkin.tslosika4telegrambot.repository")
@ComponentScan("by.nahodkin.tslosika4telegrambot")
public class PodschetGolosovTsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PodschetGolosovTsApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(@Autowired Podschet podschet) {
        return args -> {
            podschet.protocol();
        };
    }
}
