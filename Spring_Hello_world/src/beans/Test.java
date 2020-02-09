package beans;

public class Test {
	String gender;
	String age;
	public void setGender(String gender) {
		System.out.println("gender Method");
		this.gender = gender;
		
	}
	public void setAge(String age) {
		this.age=age;
	}
	Test(String gender,String age){
		this.gender=gender;
		this.age=age;
	}
	Test(){
		
	}
	/*private Test(String gender){
		System.out.println("Object Creation");
	}*/
	public void hello(String name) {
		System.out.println("Hello "+gender+" "+name+" :: "+age);
	}
}
