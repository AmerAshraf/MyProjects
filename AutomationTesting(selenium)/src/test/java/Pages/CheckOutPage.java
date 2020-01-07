package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckOutPage {
     //variables
	WebDriver browserObject;
	
	//constructor
	public CheckOutPage(WebDriver browserObject){
		this.browserObject =browserObject;
	}
	//Element locators	
	//By CardIcon = By.xpath("//li[@id='gh-cart']/a");
	///html/body/div[3]/header/div/ul[2]/li[3]/a
	//  //li[@id='gh-cart']/a
	By CheckoutButton = By.xpath("/html/body/div[4]/div/div[3]/div/div/button");  
	//  /html/body/div[4]/div/div[4]/div/div/button
	//  //div[@class='cartsummary-cta']/button
	//functions
	
	
	public void CheckOutButton() {				
		browserObject.findElement(CheckoutButton).click();
//		browserObject.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
}
