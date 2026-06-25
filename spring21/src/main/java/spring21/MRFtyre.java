package spring21;

import org.springframework.stereotype.Component;

@Component
public class MRFtyre implements Wheel{

	@Override
	public void assembly() {
		// TODO Auto-generated method stub
		System.out.println("MRFtyre arrived");
	}

}
