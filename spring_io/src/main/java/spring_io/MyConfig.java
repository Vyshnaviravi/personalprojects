package spring_io;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring_io")
public class MyConfig {

    @Bean
    public Spotify spotify() {
        return new Spotify();
    }
}