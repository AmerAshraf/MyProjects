package TestCases;


import java.io.IOException;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.SearchPage;

public class E_Search extends TestBase {

	public E_Search() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	@BeforeTest
	public void OpenEbay() {
		Openingbroswer();
	
	}
	@Test
	public void Login () {
       LoginPage LoginPageObject = new LoginPage(ChromebrowserObject);
       String Username = pro.getProperty("Email");
       String Password = pro.getProperty("Password");
       LoginPageObject.validLogin(Username, Password);
       
	}
	*/
	@Test
	public void SearchAndSelectProduct () {
       SearchPage SearchPageObject = new SearchPage(ChromebrowserObject);
       String Producto = pro.getProperty("Product1");
       SearchPageObject.SearchProduct(Producto);
	}
	//==============
	@Test
	public void SearchAndSelectProduct2 () {
       SearchPage SearchPageObject = new SearchPage(ChromebrowserObject);
       String Producto = pro.getProperty("Product2");
       SearchPageObject.SearchProduct(Producto);
	}
	
	//====================

/*
	@AfterTest
	public void closingbrowser () {
		ChromebrowserObject.close();
	}
	*/
}
