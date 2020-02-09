package beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String files[] = {"resources/Engine.xml","resources/Car.xml"};
		ApplicationContext factory = new ClassPathXmlApplicationContext(files);
		Car c = (Car)factory.getBean("c");
		c.print();
		/*Resource r = new ClassPathResource("resources/Spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Object o =factory.getBean("t");
		Test test = (Test)o;
		test.hello("Abhishek");*/
		/*try {
		Class c = Class.forName("beans.Test");
		Constructor cons[] = c.getDeclaredConstructors();
		cons[0].setAccessible(true);
		Object o = cons[0].newInstance(null);
		Test t = (Test)o;
		t.hello();
		}
		catch(Exception e) {
			
		}*/
		/*System.out.println(o==o1);
		System.out.println(o==o2);*/
	}

}
