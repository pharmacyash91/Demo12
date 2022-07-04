package ABC;

import java.util.List;

import javax.print.attribute.standard.Copies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardpage {
	
	@FindBy(xpath="/ha")
	public List <WebElement> courses;
	
	public Dashboardpage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifycourse() {
		boolean flag = false;
				for(WebElement course: courses) {
					//flag = course.isDisplayed();
					String namecourse = course.getText();
					System.out.println("name of course:"+namecourse);
				}
				return flag ;
	}

}
