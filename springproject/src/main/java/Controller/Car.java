package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car{
	@Autowired
	Engine e1;
	
	void add()
	{
		e1.insert();
	}
}
