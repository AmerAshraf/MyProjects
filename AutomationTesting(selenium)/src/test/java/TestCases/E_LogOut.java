package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.CheckOutPage;
import Pages.LogOutPage;
import Pages.LoginPage;
import Pages.SearchPage;

public class E_LogOut extends TestBase {

	public E_LogOut() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeTest
	public void OpenEbay() {
		Openingbroswer();
	
	}
	@Test(priority=1)
	public void Login () {
       LoginPage LoginPageObject = new LoginPage(ChromebrowserObject);
       String Username = pro.getProperty("Email");
       String Password = pro.getProperty("Password");
       LoginPageObject.validLogin(Username, Password);
       
	}
	
	@Test(dependsOnMethods= {"Login"})
	public void AssertPageTitle () {
		String actualPageTitle = ChromebrowserObject.getTitle();
		String ExpectedPageTitle ="Electronics, Cars, Fashion, Collectibles, Coupons and More | EBay" ;
		Assert.assertEquals(actualPageTitle, ExpectedPageTitle);
	}
	
	@Test(priority=2)
	public void SearchAndSelectProduct () {
       SearchPage SearchPageObject = new SearchPage(ChromebrowserObject);
       String Producto = pro.getProperty("Product1");
       SearchPageObject.SearchProduct(Producto);
	}
	//==============
	@Test(priority=2)
	public void SearchAndSelectProduct2 () {
       SearchPage SearchPageObject = new SearchPage(ChromebrowserObject);
       String Producto = pro.getProperty("Product2");
       SearchPageObject.SearchProduct(Producto);
	}
	
	//===========
	@Test(priority=3,dependsOnMethods= {"SearchAndSelectProduct2"})
	public void Checkout () {
       CheckOutPage CheckOutPageObject = new CheckOutPage(ChromebrowserObject);
       CheckOutPageObject.CheckOutButton();
	}
	
	
	//==============
	@Test(priority=4,dependsOnMethods= {"Checkout"})
	public void LogOuto () {
       LogOutPage LogOutPageObject = new LogOutPage(ChromebrowserObject);
       LogOutPageObject.LogOutButton();
	}
}