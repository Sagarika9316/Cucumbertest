package urbanladder.C1;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import pageLocators.SpecialFurniture;
import resources.base;

public class Furniture extends base {
	public static Logger log=LogManager.getLogger(base.class.getName());
	@Test(priority=7)
	public void validateSpecialfurniture() throws IOException, InterruptedException {
		driver=initializeDriver();
		driver.get(p.getProperty("homeurl"));
		driver.manage().window().maximize();
		SpecialFurniture S=new SpecialFurniture(driver);
		List<WebElement> s= S.Sets();//any locator that captures all the items of drop box.
		for(int i=0 ;i <s.size();i++){
			if(s.get(i).getText().contains("Study")){
				s.get(i).click();
				break;
				}

		}
		String pageTitle = driver.getTitle();
		if(pageTitle.contains("Study")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		driver.quit();
	}

	@Test(priority=8)
	public void validateTable()throws InterruptedException, IOException{
		driver=initializeDriver();
		driver.get(p.getProperty("homeurl"));
		driver.manage().window().maximize();
		SpecialFurniture S=new SpecialFurniture(driver);
		
		List<WebElement> s= S.Sets();//any locator that captures all the items of drop box.
		
		for(int i=0 ;i <s.size();i++){
			if(s.get(i).getText().contains("Seating")){
				s.get(i).click();
				break;
				}
		}
		S.Stories().click();
		List<WebElement> L= S.FirstStory();
		for(int j=0;j<L.size();j++) {
			String name=L.get(0).getText();
			System.out.println(name);
			break;
		}
		
		
		
	}
	@Test(priority=9)
	public void validateSubscribe()throws InterruptedException, IOException{
		driver=initializeDriver();
		driver.get(p.getProperty("homeurl"));
		driver.manage().window().maximize();
		SpecialFurniture S=new SpecialFurniture(driver);
		S.email().sendKeys("sagarikapamisetty@gmail.com");
		S.subscribe().click();
	}
	
	
	
	
}
