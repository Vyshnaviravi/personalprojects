package spring_io;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Spotify {
    void play() {
    	System.out.println("NEE amrithadhare...");
    }
}