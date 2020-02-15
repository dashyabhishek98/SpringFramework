package beans;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String files[] = {"resources/Spring.xml"};
		ApplicationContext factory = new ClassPathXmlApplicationContext(files);
		Calendar cal1=(Calendar)factory.getBean("c");
		Calendar cal2=(Calendar)factory.getBean("c");
		System.out.println(cal1==cal2);
		Test t1 = (Test)factory.getBean("t");
		Test t2 = (Test)factory.getBean("t");
		System.out.println(t1==t2);
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
