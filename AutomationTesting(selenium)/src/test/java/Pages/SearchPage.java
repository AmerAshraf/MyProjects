package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage {
     //variables
	WebDriver browserObject;
	
	//constructor
	public SearchPage(WebDriver browserObject){
		this.browserObject =browserObject;
	}
	//Element locators
	By Searchbar = By.id("gh-ac");
	By S10 =By.xpath("//div[@class='s-item__image-wrapper']/img");
	By AddButton = By.xpath("//*[@id=\'isCartBtn_btn\']");
	
		//functions
	

	public void SearchProduct(String ProductName) {
		WebElement Search =browserObject.findElement(Searchbar);
		Search.sendKeys(ProductName);
		Search.sendKeys(Keys.ENTER);
		browserObject.findElement(S10).click();
		browserObject.findElement(AddButton).click();
	}
		
}
