package beans;

public class Engine {
	private String modelYear;	
	public void setModeYear(String modelyear) {
		this.modelYear=modelyear;
	}
	public String getModelYear() {
		return modelYear;
	}
	public Engine(){}
	public Engine(String modelYear) {
		this.modelYear = modelYear;
	}
}
