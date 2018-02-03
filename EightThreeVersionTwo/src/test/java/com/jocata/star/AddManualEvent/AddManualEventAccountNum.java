package com.jocata.star.AddManualEvent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class AddManualEventAccountNum   extends mainbaseLatest {

	
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
	 
	 
	    @Test(priority=17)
		public void clickmanualEventAccountNum(){
		
	    	 try{
	    			
	         ExtentTestManager.startTest("  Add Manual Event : Search Account Num Save "); 
	         sleep(10);
			 fluentWait(By.xpath("//span[text()='Case Files']")).click();
			 fluentWait(By.xpath("//a[text()='Add Manual Event']")).click();
			 
			 sleep(6);
		    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			 fluentWait(By.xpath("//img[@id='searchEventAccountId']")).click();
			 sleep(6);
		    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			 //.........................Account No......................................//
			 fluentWait(By.xpath("//div[3]/div/table/tbody/tr/td/div/div")).click();
			 fluentWait(By.xpath("//a[6]/span/span/span[2]")).click();
			 
			 
			 sleep(6);
			 //.............................Customer ID ................................//
			 fluentWait(By.xpath("//img[@id='searchEventCustomerId']")).click();
			 fluentWait(By.xpath("//div[2]/div/table/tbody/tr/td/div/div")).click();
			 fluentWait(By.xpath("//a[6]/span/span/span[2]")).click();

			 
			 //................................. Rule Name...............................//
			 
			 sleep(6);
			 fluentWait(By.xpath("//input[@id='mruleId-inputEl']")).click();
			 fluentWait(By.xpath("//li[text()='Customer match with watchlist']")).click();

			 
			 //.............................period.......................................//
			 
			 fluentWait(By.xpath("//img[@class='calendar']")).click();
			 fluentWait(By.xpath("//li[text()='Today']")).click();

			 
			 //..................................... Total Amount..........................//
			 
			 sleep(6);
			 fluentWait(By.xpath("//input[@id='totalamount']")).sendKeys("4000");
			 
			    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	         fluentWait(By.xpath("//div[@id='addEventButton']/a")).click();
	         sleep(6);
			    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	         fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();

	         sleep(6);
	     	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	     	
	    	 }catch(Exception e){
				 System.out.println(e.getMessage());
				 
			    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			    	ExtentTestManager.getTest().log(LogStatus.FAIL, "Add Manual Event Search Account Num Save ");
			 }
	
	
}
}
