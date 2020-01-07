package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
     //variables
	WebDriver browserObject;
	
	//constructor
	public LoginPage(WebDriver browserObject){
		this.browserObject =browserObject;
	}
	//Element locators
	By Signin = By.xpath("//span[@id=\"gh-ug\"]/a");
	By Emailfield =By.xpath("//input[@id=\"userid\"]");
	By Passfield = By.xpath("//input[@id=\"pass\"]");
	By LoginButton = By.xpath("//button[@id=\"sgnBt\"]");
	//functions
	
	public void validLogin(String Email , String Password) {
		browserObject.findElement(Signin).click();
		//Wait 3 second To load page
		browserObject.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		browserObject.findElement(Emailfield).sendKeys(Email);
		browserObject.findElement(Passfield).sendKeys(Password);
		browserObject.findElement(LoginButton).click();

	}
}
