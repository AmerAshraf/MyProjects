package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LogOutPage {
     //variables
	WebDriver browserObject;
	
	//constructor
	public LogOutPage(WebDriver browserObject){
		this.browserObject =browserObject;
	}
	//Element locators
	By HomePage = By.xpath("//*[@id=\'gh-la\']");
	By dropdownlist =By.xpath("//*[@id=\'gh-ug\']");
	By Logoutbuttonn = By.xpath("//li[@id=\\\'gh-uo\\\']/a");
	
		//functions
	
	public void LogOutButton() {
		browserObject.findElement(HomePage).click();
		browserObject.findElement(dropdownlist).click();
		browserObject.findElement(Logoutbuttonn).click();
	}
		
}
