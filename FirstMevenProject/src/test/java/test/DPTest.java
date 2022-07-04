package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DPTest {
  @Test(dataProvider = "logindata")
  public void loginTest(String uname, String pass, String errMsg, String passErr) {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("file:///C:/Users/HP/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	  driver.findElement(By.id("email")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.xpath("//button")).click();
	  
	  if(driver.getTitle().equals("JavaByKiran | Dashborad"))
		  Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashborad");
	  else {
		  WebElement emailErr = driver.findElement(By.id("email_error"));
		  Assert.assertEquals(emailErr.getText(),errMsg);
		  
		  WebElement passError = driver.findElement(By.id("password_error"));
		  Assert.assertEquals(passError.getText(),passErr);
	  }

	  
  }

  @DataProvider
  public Object[][] logindata() {
    return new Object[][] {
      new Object[] { "","","please enter email.","Please enter password " },
      new Object[] { "mangesh","qwerty","please enter as kiran@gmail.com" ,"Please enter password 123456"},
      new Object[] { "kiran@gmail.com","123456","","" },
    };
  }
}
