package co.edu.uco.ucobet.generales.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"co.edu.uco.ucobet"})
@ComponentScan(basePackages = {"co.edu.uco.ucobet"})
@EntityScan(basePackages = {"co.edu.uco.ucobet"})
public class UcoGeneralesApplication {
    public static void main(String[] args) {
        SpringApplication.run(UcoGeneralesApplication.class, args);
    }
}
