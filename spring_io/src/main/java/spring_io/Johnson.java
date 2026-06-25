package spring_io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Johnson {
public static void main(String[] args) {
	//Spotify spotify=new Spotify();
	//spotify.play();
	
	//loading config classes to container
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	Spotify s1=applicationContext.getBean(Spotify.class);
	s1.play();
	Spotify s2=applicationContext.getBean(Spotify.class);
	
	System.out.println(s1==s2);
}
}