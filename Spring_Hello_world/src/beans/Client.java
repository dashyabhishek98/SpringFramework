package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String files[] = {"resources/Spring.xml"};
		ApplicationContext factory = new ClassPathXmlApplicationContext(files);
		Car c = (Car)factory.getBean("cf");
		c.drive();
		
	}

}
