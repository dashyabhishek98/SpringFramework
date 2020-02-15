package beans;

public class CarFactory{
	public static String carName;

	public static String setCarName(String carName) {
		CarFactory.carName=carName;
		return carName; 
	}
	
	public static Car getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		 Car c = (Car)Class.forName(carName).newInstance();
		 System.out.println(c);
		 return c;
	}
	
}
