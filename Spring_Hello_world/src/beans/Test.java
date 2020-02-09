package beans;

import org.springframework.beans.factory.annotation.Required;

public class Test {
	private String driver;
	private String url;
	private String user;
	public Test(String driver, String url, String user, String password) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}
	@Required
	public String getDriver() {
		return driver;
	}
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String password;
	
	Test(){
		
	}
	
	public void hello() {
		System.out.println(driver+" "+url+" "+user+" :: "+password);
	}
}
