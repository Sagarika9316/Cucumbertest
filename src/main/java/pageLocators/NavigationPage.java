package pageLocators;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage {
	public WebDriver driver;
	By navigation=By.xpath("//li[contains(@class,'topnav_item')] ");
	By onpage=By.xpath("//li[@class='slick-slide slick-active']//a");
	By dreamfurn=By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div[1]/a/img");
	By countdreamfurn=By.xpath("//div[contains(@class,'productbox')]");
	public NavigationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public List<WebElement> Navigation() {
		// TODO Auto-generated method stub
		return driver.findElements(navigation);
	}
	
	public WebElement OnPage() {
		return driver.findElement(onpage);
	}

	public WebElement Dreamfurn() {
		return driver.findElement(dreamfurn);
	}
	public List<WebElement> Countfurn() {
		// TODO Auto-generated method stub
		return driver.findElements(countdreamfurn);
	}
}
