package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

public static void main(String[] args) throws InterruptedException {
	 
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\SeleniumRevision\\driver\\chromedriver.exe");
	
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	   
	   driver.switchTo().frame("login_page");
	   Thread.sleep(1000);
	   WebElement txtuser = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	   txtuser.sendKeys("Prasad");
	   
}
	   
	  }
	   
	   
	   
			
			
        	 
        	 
		
         
	   
	
	
	

	
		
	
		
		
		
		
		
		
		
	

       
	


