package pageLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpecialFurniture {
	public WebDriver driver;
	By sets=By.xpath("//a[contains(@class,'category')] ");
	By title=By.xpath("//*[@id=\"content\"]/div[1]/div/h1");
	By stories=By.xpath(" //a[normalize-space()='View all Customer Stories']");
	By firststory=By.xpath("(//div[@class='testidet'])");
	By PopUp=By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]");
	By SearchBed=By.xpath("//*[@id=\"search\"]");
	By clickfirstbed=By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/a/img");
	By Email=By.xpath("/html/body/div[1]/footer/div[1]/div[1]/form/div[1]/input");
	By Subscribe=By.cssSelector("#nl-subscribe-footer > div.col-md-5.column.large-5 > input");
	
	public SpecialFurniture (WebDriver driver) {
		this.driver=driver;
	}
	
	public List<WebElement> Sets() {
		// TODO Auto-generated method stub
		return driver.findElements(sets);
	}
	 
	public WebElement grabTitle() {
		return driver.findElement(title);
	}
	public WebElement Stories() {
		return driver.findElement(stories);
	}
	public List<WebElement> FirstStory() {
		return driver.findElements(firststory);
	}
	
	public WebElement closePopUp() {
		// TODO Auto-generated method stub
		return driver.findElement(PopUp);
	}
	public WebElement BedSearch() {
	
		return driver.findElement(SearchBed);
	}
	public WebElement ClickfirstBed() {
		return driver.findElement(clickfirstbed);
	}
	public WebElement email() {
		
		return driver.findElement(Email);
	}
	public WebElement subscribe() {
		return driver.findElement(Subscribe);
	}
	
}
