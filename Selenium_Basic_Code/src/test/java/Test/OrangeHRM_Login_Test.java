package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import AllcommonMethod.CommonMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Login_Test {
	CommonMethod wait;

    WebDriver driver;
    Pages.OrangeHRM_Login loginPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();  // optional
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage = new Pages.OrangeHRM_Login(driver);
    wait=new  CommonMethod (driver);
    }

    @Test
    public void loginTest() {
    	//wait.applyImplicitWait();
    	//wait.fluentWait(driver, loginPage.uName);
    	
        loginPage.login("Admin", "admin123");
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}