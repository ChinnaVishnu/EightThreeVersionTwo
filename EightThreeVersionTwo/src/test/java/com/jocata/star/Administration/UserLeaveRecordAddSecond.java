package com.jocata.star.Administration;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
import com.jocata.star.practisesecond.TestArraylist3;
import com.relevantcodes.extentreports.LogStatus;

public class UserLeaveRecordAddSecond extends mainbaseLatest {

	
private static int getRandomNumberInRange(){
	    
Random randomGenerator = new Random(); 
		
		
		int Low = 1;
		int High = 28;
		int Result = randomGenerator.nextInt(High-Low) + Low;
	
		return Result;
		

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

	 
	 
	 @Test(priority=39)
	 public void clickonleaveRecord(){
		 
		 try{
				
			 ExtentTestManager.startTest("  SystemConfigurations  User Leave Record : Add and Edit "); 
			 
			 
		 sleep(4);
		 fluentWait(By.xpath("//span[text()='Administration']")).click();
		 
		 sleep(4);
		 fluentWait(By.xpath("//a[text()='System Configurations']")).click();
		 sleep(4);
          fluentWait(By.xpath("//span[text()='User Leave Record']")).click();
	    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

          sleep(4);
          fluentWait(By.xpath("//a[text()='User Leave Record']")).click();
	    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

          sleep(4);
          fluentWait(By.xpath("//div[@id='formAdd']")).click();
          
          sleep(4);
          fluentWait(By.xpath("//td[2]/img")).click();
	    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

          TestArraylist3 too=new TestArraylist3();
      	
          List<String>namse=	too.models();
          int randomnu=getRandomNumberInRange();

      String rannames=    String.valueOf(randomnu);
      
      System.out.println(namse.get(randomnu));
      
          sleep(4);
          try{
          
          fluentWait(By.xpath(".//*[@id='userIdText-inputEl']")).sendKeys(namse.get(randomnu));
          sleep(4);
          fluentWait(By.xpath(".//*[@id='userIdText-inputEl']")).sendKeys(Keys.ENTER);
          
          }catch(Exception e){
        	  System.out.println("user alreay exist ");
		    	ExtentTestManager.getTest().log(LogStatus.INFO, " SystemConfigurations  User Leave Record : Add and Edit ");
		    	driver.navigate().refresh();
		    	

          }
	    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

          sleep(4);
          fluentWait(By.xpath("//div[2]/div/table/tbody/tr/td/div/div")).click();
          
          
          sleep(4);
          fluentWait(By.xpath("//a[6]/span/span/span[2]")).click();
          
	    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

          sleep(4);
          fluentWait(By.xpath(".//*[@id='assignOption-inputEl']")).click();
          sleep(4);
          fluentWait(By.xpath("//div[9]/div/ul/li[3]")).click();
          sleep(4);
          fluentWait(By.xpath(".//*[@id='startDate-inputEl']")).sendKeys("27 May 2017");
          sleep(4);
          fluentWait(By.xpath(".//*[@id='endDate-inputEl']")).sendKeys("28 May 2017");
          sleep(4);
          fluentWait(By.xpath(".//*[@id='comments']")).sendKeys("wxvnss");
          
          sleep(4);
          fluentWait(By.xpath(".//*[@id='Inactive']")).click();
          sleep(4);
	    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

          fluentWait(By.xpath("//div[@id='submitULRReport']//a")).click();
          sleep(4);
          fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();
          
          
      //.....................................................................................................................//
          sleep(4);
         fluentWait(By.xpath(".//*[@id='textuserId-inputEl']")).sendKeys(namse.get(randomnu)); 
         sleep(4);
         fluentWait(By.xpath(".//*[@id='textuserId-inputEl']")).sendKeys(Keys.ENTER);
	    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

         sleep(4);
         fluentWait(By.cssSelector("div.x-grid-row-checker")).click();
         sleep(4);
		 fluentWait(By.xpath("//div[@id='formModify']")).click();
		 sleep(4);
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		 fluentWait(By.xpath("//div[@id='submitULRReport']//a")).click();
		 sleep(4);
	    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	    fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();

		 
	    
		 }catch(Exception e){
			 System.out.println(e.getMessage());
			 
		    	ExtentTestManager.getTest().log(LogStatus.FAIL, " SystemConfigurations  User Leave Record : Add and Edit ");

			 
		    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		    	driver.navigate().refresh();
			 
		 }
		 
	 }
	 
	
}



