package com.jocata.star.Administration;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.mainbaseLatest;

public class NotificationConfigurationUpdate  extends mainbaseLatest {

	
	private static int getRandomNumberInRange(){
		

		Random randomGenerator = new Random(); 
		
		
		int randomInt = randomGenerator.nextInt(100); 
		
		
		
		return randomInt;
		

		}

	
	
	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(20, TimeUnit.SECONDS)
	        .pollingEvery(5, TimeUnit.SECONDS)
	        .ignoring(NoSuchElementException.class);

	    WebElement foo = wait.until(
	        new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                return driver.findElement(locator);
	            }
	        }
	    );
	    return foo;
	};
	
	
	
	 public void sleep(int seconds){
		   
		   try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	

	 @Test
	 public void clicknotification(){
		 
		 
		 fluentWait(By.xpath("//span[text()='Administration']")).click();
		 
		 fluentWait(By.xpath("//a[text()='System Configurations']")).click();
		 
		 fluentWait(By.xpath("//a[text()='Notification Configurations']")).click();
		 
		 sleep(8);
		 
WebElement element=	driver.findElement(By.xpath("//td[7]/div"));

Actions action=new Actions(driver);

action.moveToElement(element).build().perform();

action.click().build().perform();

sleep(8);

//driver.findElement(By.xpath("//td[7]/div")).clear(); 

fluentWait(By.xpath("//input[contains(@id,'textfield')]")).clear();


 int randomnum=getRandomNumberInRange();
 
 
String testare= String.valueOf(randomnum);

 System.out.println(testare);

 sleep(6);
 
fluentWait(By.xpath("//input[contains(@id,'textfield')]")).sendKeys(testare);	




/*
String raghu = null;

fluentWait(By.xpath("//input[contains(@id,'textfield')]")).sendKeys(raghu+"@gmail.com");	*/ 

		 
sleep(6);
		
fluentWait(By.xpath("//div[@id='updateNotifConf']//a")).click();
sleep(6);

		 
fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();


	 }
	 
	 
	
	
	
}
