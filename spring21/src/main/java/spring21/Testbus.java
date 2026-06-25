package spring21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testbus {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(MyConfig.class);
		Bus bus= applicationContext.getBean(Bus.class);
		bus.test();
	}

}
