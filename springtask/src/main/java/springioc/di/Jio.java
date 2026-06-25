package springioc.di;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim{
public void use() {
	System.out.println("Jio sim inserted");
}
}
