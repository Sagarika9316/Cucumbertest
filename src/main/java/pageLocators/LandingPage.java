package pageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	By PopUp=By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]");
	By table=By.id("search");
	By tablecount=By.xpath("//*[@id=\"search-results\"]/div[1]/span");
	By check=By.xpath("//*[@id=\"filters_availability_In_Stock_Only\"]");
	By recom=By.xpath("//*[@id=\"search-results\"]/div[2]/div[1]/div/div/div/div/div[2]/div[1]/span");
	By newarrivals=By.xpath("//li[normalize-space()='New Arrivals']");
	By newtable=By.xpath("//*[@id=\"search-results\"]/div[3]/ul/li[1]/div/a/img");
	By Title=By.xpath("//*[@id=\"product-show\"]/div[1]/h1");
	By addcart=By.id("add-to-cart-button");
	By date=By.xpath("//*[@id=\"line_items\"]/div/div[2]/div");
	
	
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement closePopUp() {
		// TODO Auto-generated method stub
		return driver.findElement(PopUp);
	}
	
	public WebElement Table() {
		return driver.findElement(table);
	}
	
	public WebElement Count() {
		return driver.findElement(tablecount);
	}
	
	public WebElement Check() {
		return driver.findElement(check);
	}
	
	public WebElement Recommend() {
		return driver.findElement(recom);
		
	}
	public WebElement New() {
		return driver.findElement(newarrivals);
	}
	public WebElement Newtable() {
		return driver.findElement(newtable);
	}
	public WebElement getTitle() {
		return driver.findElement(Title);
	}
	public WebElement Add() {
		return driver.findElement(addcart);
	}

	public  WebElement getdate() {
		// TODO Auto-generated method stub
		return driver.findElement(date);
	}
}
