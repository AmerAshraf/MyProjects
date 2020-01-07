package TestCases;


import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.LoginPage;

public class E_Login extends TestBase {

	public E_Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
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
/*
	@AfterTest
	public void closingbrowser () {
		ChromebrowserObject.close();
	}
	*/
}
