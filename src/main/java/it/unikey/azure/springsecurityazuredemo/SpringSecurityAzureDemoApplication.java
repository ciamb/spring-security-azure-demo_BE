package it.unikey.azure.springsecurityazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;


@SpringBootApplication
public class SpringSecurityAzureDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityAzureDemoApplication.class, args);
    }

}
