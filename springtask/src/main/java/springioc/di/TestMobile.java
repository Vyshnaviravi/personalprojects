package springioc.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMobile {
// @Autowired
// Mobile m;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//loading config class to container
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Mobile m=context.getBean(Mobile.class);
		m.insert();
	}
}
