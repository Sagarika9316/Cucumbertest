package urbanladder.C1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageLocators.LandingPage;
import resources.base;

public class validateUrvbanladderText extends base{

	public static Logger log=LogManager.getLogger(base.class.getName());

@Test(priority=1)
public void validateText() throws InterruptedException, IOException{
	driver=initializeDriver();
	driver.get(p.getProperty("homeurl"));
	driver.manage().window().maximize();
	LandingPage l=new LandingPage(driver);
	Thread.sleep(10000L);
	l.closePopUp().click();
	String exptitle=driver.getTitle();
	System.out.println(exptitle);
	Assert.assertEquals(exptitle,"Furniture Online: @Upto 40% Off on Wooden Furniture Online in India at Best Price - Urban Ladder");
	driver.quit();
}
	
@Test(priority=2)
public void validateTable()throws InterruptedException, IOException{
driver=initializeDriver();
driver.get(p.getProperty("homeurl"));
driver.manage().window().maximize();
LandingPage l=new LandingPage(driver);
Thread.sleep(10000L);
l.closePopUp().click();
l.Table().sendKeys("table");
l.Table().sendKeys(Keys.ENTER);
Thread.sleep(1000);
Assert.assertEquals("(1836 Products)",l.Count().getText());
System.out.println(l.Count().getText());
driver.quit();

}

@Test(priority=3)
public void validTabledrop()throws InterruptedException, IOException{
	driver=initializeDriver();
	driver.get(p.getProperty("homeurl"));
	driver.manage().window().maximize();
	LandingPage l=new LandingPage(driver);
	Thread.sleep(10000L);
	l.closePopUp().click();
	l.Table().sendKeys("table");
	l.Table().sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	l.Check().click();
	Thread.sleep(10000L);
	l.closePopUp().click();
	Thread.sleep(1000);
	l.Recommend().click();
	l.New().click();
	Thread.sleep(1000);
	l.Newtable().click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> iter= windows.iterator();
	String presentWindow =iter.next();
	String NewWindow = iter.next();
	driver.switchTo().window(NewWindow);
	
	String pageTitle = driver.getTitle();
	if(pageTitle.contains("Lopez Coffee Table")) {
		Assert.assertTrue(true);
	}else {
		Assert.assertTrue(false);
	}
	System.out.println(pageTitle);
	
	driver.quit();
}

@Test(priority=4)
public void Addtocart()throws InterruptedException, IOException{
	driver=initializeDriver();
	driver.get(p.getProperty("homeurl"));
	driver.manage().window().maximize();
	LandingPage l=new LandingPage(driver);
	Thread.sleep(10000L);
	l.closePopUp().click();
	l.Table().sendKeys("table");
	l.Table().sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	l.Check().click();
	Thread.sleep(10000L);
	l.closePopUp().click();
	Thread.sleep(1000);
	l.Recommend().click();
	l.New().click();
	Thread.sleep(1000);
	l.Newtable().click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> iter= windows.iterator();
	String presentWindow =iter.next();
	String NewWindow = iter.next();
	driver.switchTo().window(NewWindow);
	
	String pageTitle = driver.getTitle();
	l.Add().click();
	System.out.println(l.getdate().getText());
	driver.close();
}

}


