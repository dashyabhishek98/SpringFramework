package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		ApplicationContext factory = new ClassPathXmlApplicationContext("resources/Spring.xml");
		//Normal Output
		/*A object
		B object
		C object*/
		
		//After depends-on
		/*C object
		B object
		A object*/
		
	}

}
