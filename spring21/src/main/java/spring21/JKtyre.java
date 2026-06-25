package spring21;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class JKtyre implements Wheel {

	@Override
	public void assembly() {
		// TODO Auto-generated method stub
		System.out.println("Jktyre arrived");
	}

}
