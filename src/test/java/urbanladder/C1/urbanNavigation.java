package urbanladder.C1;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageLocators.NavigationPage;
import resources.base;

public class urbanNavigation extends base{
	public static Logger log=LogManager.getLogger(base.class.getName());
	@Test(priority=5)
	public void initialize() throws IOException, InterruptedException {
		driver=initializeDriver();
		driver.get(p.getProperty("homeurl"));
		driver.manage().window().maximize();
		NavigationPage N=new NavigationPage(driver);
		List<WebElement> items=N.Navigation();
		for(WebElement listsize : items) {
			WebElement strLinkText=listsize;
			System.out.println(strLinkText.getText());
			}
         
	}
	
		
@Test(priority=6)
public void CountOfBeds()throws IOException, InterruptedException {
	driver=initializeDriver();
	driver.get(p.getProperty("homeurl"));
	driver.manage().window().maximize();
	
NavigationPage N=new NavigationPage(driver);

N.OnPage().click();
N.Dreamfurn().click();
List<WebElement> cots=N.Countfurn();
int elementsCount = cots.size();
System.out.println("Total Number of All Element on webpage = "  + elementsCount);  
driver.quit();
}


}