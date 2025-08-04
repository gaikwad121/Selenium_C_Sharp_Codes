package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllcommonMethod.CommonMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverMethod {
public static WebDriver driver;
	 @BeforeMethod
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();  // optional
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 }

	    @Test
	    public void loginTest() throws MalformedURLException {
	    	//wait.applyImplicitWait();
	    	//wait.fluentWait(driver, loginPage.uName);
	    	driver.navigate().to("https://www.facebook.com/login/");
	    	URL myUrl=new URL("https://www.facebook.com/login/");
	    	driver.navigate().to(myUrl);
	    }
	    @AfterTest
	    void TearDown() {
	    	driver.quit();
	    }
}