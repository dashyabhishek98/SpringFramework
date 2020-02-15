package beans;

public class CarFactory{
	public String carName;

	public void setCarName(String carName) {
		this.carName=carName;		
	}
	
	public Car getInstance() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		 Car c = (Car)Class.forName(carName).newInstance();
		 System.out.println(c);
		 return c;
	}
	
}
