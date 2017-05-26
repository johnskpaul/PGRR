package com.dbmi.pgrr;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class TN_pgrrLogin {
	 private WebDriver driver;
	  private String baseUrl;
	  
  @BeforeMethod
  public void beforeMethod() {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Apache\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    baseUrl = "http://dev.pgrr.dbmi.pitt.edu/";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
	  
  @Test
  public void tnPgrrLogin() {
	  driver.get(baseUrl + "/");
//    WebElement element = gm.getElement("Log in", "Title");
    
    driver.findElement(By.linkText("Log In")).click();
    driver.findElement(By.id("edit-name")).clear();
    driver.findElement(By.id("edit-name")).sendKeys("jop55");
    driver.findElement(By.id("edit-pass")).clear();
    driver.findElement(By.id("edit-pass")).sendKeys("9icn6digital$");
    driver.findElement(By.id("edit-submit")).click();
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
