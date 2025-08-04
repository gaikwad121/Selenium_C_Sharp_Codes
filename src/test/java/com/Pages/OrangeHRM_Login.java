package com.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import AllcommonMethod.CommonMethod;

public class OrangeHRM_Login {
    private WebDriver driver;
   public static  By uName = By.name("username");
   // By password = By.name("password");
  public static By pass=By.name("password");
  public   static By submit = By.xpath("//button[@type='submit']");

	CommonMethod wait=new  CommonMethod (driver);


    // Constructor to initialize WebDriver
    public OrangeHRM_Login(WebDriver driver) {
        this.driver = driver;
    }

    // Login method with username and password as parameters
    public void login(String username, String password) {
    	////try {
    	//Thread.sleep(2000);
    	//}catch(Exception e) {
    	//e.printStackTrace();
    	//}
    	//wait.ImplicitWait();
    	//wait.applyImplicitWait();
    	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	//wait.explicitWaitForVisibility(driver, username);
        //wait.explicitWaitForVisibility(driver, uName);
    	wait.fluentWait(driver, uName);
        driver.findElement(uName).sendKeys(username);
        wait.fluentWait(driver, pass);
        //wait.explicitWaitForVisibility(driver, pass);

        driver.findElement(pass).sendKeys(password);
       // wait.explicitWaitForVisibility(driver, submit);
wait.fluentWait(driver, submit);
        driver.findElement(submit).click();

    }
}
