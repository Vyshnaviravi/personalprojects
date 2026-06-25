package springioc.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Airtel implements Sim{

	public void use() {
		System.out.println("airtel sim inserted");
	}

}
