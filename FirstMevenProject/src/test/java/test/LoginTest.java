package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ABC.Dashboardpage;
import ABC.LoginPage;



public class LoginTest {
	
	WebDriver driver = null;
	Dashboardpage dp = null;
	LoginPage lp = null;
	
	@Test
	public void test01() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/abc/Downloads/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		
		lp = new LoginPage(driver);
		dp= lp.getdashboard();
		//dp = lp.getdashboard();
		//lp.loginToApplication("kiran@gmail.com", "123456");
		Assert.assertEquals(driver.getTitle(), "javabykiran | dashborad");
	}

	@Test
	public void test02() {
		
		Assert.assertTrue(dp.verifycourse());
	}
	
	
}
