package ABC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver = null;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="//button")
	WebElement loginBtn;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginToApplication(String uname, String pass) {
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}
	
	public Dashboardpage getdashboard() {
		
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginBtn.click();
		
		return new Dashboardpage(driver);
		
	}
	

}
