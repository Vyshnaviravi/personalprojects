package com.jsp.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = {UserDetailsServiceAutoConfiguration.class})
public class MovieManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(MovieManagementApplication.class, args);
    }
}
