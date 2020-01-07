package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestBase {
    public static WebDriver ChromebrowserObject;
    public static Properties pro;

	public TestBase () throws IOException {
		String propFilePath = System.getProperty("user.dir") + "\\src\\test\\java\\Config\\config.properties";
		pro = new Properties();		
		FileInputStream input = new FileInputStream(propFilePath);
		pro.load(input);
	}
	public void Openingbroswer () {
				System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
				ChromebrowserObject = new ChromeDriver();	
			    String URL = pro.getProperty("URL");
			    ChromebrowserObject.navigate().to(URL);
			    ChromebrowserObject.manage().window().maximize();	
	}
	
	@AfterTest
	public void closeDriver() {
		//Close Browser
		ChromebrowserObject.close();
	}
	

}
