package beans;

public class Test {
	private static Test test=null;
	private Test() {
		
	}
	public static Test getInstance() {
		if(test==null) {
			test=new Test();
			return test;
		}
		else {
			return test;
		}
	}
}
