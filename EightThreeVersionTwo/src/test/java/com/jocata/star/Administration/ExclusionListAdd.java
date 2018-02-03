package com.jocata.star.Administration;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
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

public class ExclusionListAdd extends mainbaseLatest {

	 public static String name="JOCATA";

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
	
	
	
	private static int getRandomNumberInRange(){
		
		
		
		Random randomGenerator = new Random(); 
		
		
		int Low = 29;
		int High = 1404;
		int Result = randomGenerator.nextInt(High-Low) + Low;
		
		int randomInt = randomGenerator.nextInt(1000); 
		
		
		
		return Result;
		

		}

	
	
	 public void sleep(int seconds){
		   
		   try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	


	 
	 @Test(priority=40)
	 public void clickExclusionlist(){
		 
		 //try{
		 
		 try{
				
			 ExtentTestManager.startTest("  Administration Exclusion List Add and  Modify"); 
			 
			 sleep(4);
		 fluentWait(By.xpath("//span[text()='Administration']")).click();
 
		 sleep(4);
		fluentWait(By.xpath("//a[text()='Exclusions List']")).click();
		
		sleep(4);
		fluentWait(By.xpath("//a[@id='addExclsnLink']")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(4);
		fluentWait(By.xpath(".//*[@id='exTypeCombo-inputEl']")).click();
		sleep(4);
		fluentWait(By.xpath("//li[text()='Customer ID']")).click();
		
		sleep(4);
		fluentWait(By.xpath(".//*[@id='statusCombo-inputEl']")).click();
		
		sleep(4);
		fluentWait(By.xpath("//li/span")).click();
		sleep(4);

		int randomnu=		getRandomNumberInRange();
		
		System.out.println(name+randomnu);

		
		sleep(4);
		fluentWait(By.xpath("//div[7]/div[2]/div/div/div/img")).click();
		sleep(4);
        fluentWait(By.xpath(".//*[@id='custIdText-inputEl']")).sendKeys(name+randomnu);
        sleep(4);
        fluentWait(By.xpath(".//*[@id='custIdText-inputEl']")).sendKeys(Keys.ENTER);
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


        sleep(4);

        fluentWait(By.xpath("//div[2]/div/div[2]/div/table/tbody/tr/td/div/div")).click();
		
        
        sleep(4);
		fluentWait(By.xpath("//a[6]/span/span/span[2]")).click();
   
		sleep(4);

		
		fluentWait(By.xpath("//div[@id='addExclusionButtonDiv']//a")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
		sleep(4);
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		 
		sleep(4);
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(4);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy(0,-350)", "");

		//............................................Modify...........................................................//
		
		
		sleep(3);
		fluentWait(By.xpath(".//*[@id='textValues-inputEl']")).sendKeys(name+randomnu);
		sleep(3);
		fluentWait(By.xpath(".//*[@id='textValues-inputEl']")).sendKeys(Keys.ENTER);
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
        sleep(3);
		fluentWait(By.cssSelector("div.x-grid-row-checker")).click();
		sleep(3);
		fluentWait(By.xpath(".//*[@id='editExclsnLink']")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(3);
		fluentWait(By.xpath(".//*[@id='statusCombo-inputEl']")).click();

		
		
		//sleep(4);
		//fluentWait(By.xpath("//li[2]/span")).click();
		
		sleep(3);
		fluentWait(By.xpath("//div[@id='updateExclusionButtonDiv']/a")).click();
		
		sleep(3);
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(3);
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));



		sleep(3);

		JavascriptExecutor jsesecond = (JavascriptExecutor)driver;
		
		jsesecond.executeScript("window.scrollBy(0,-350)", "");


		 }catch(Exception e){
			 System.out.println(e.getMessage());
			 
		    	ExtentTestManager.getTest().log(LogStatus.FAIL, " Administration Exclusion List Add and  Modify  ");

			 
		    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			     driver.navigate().refresh();
		    	
		 }
		
	 
	 }
	 
	 
	 
	 
	 
	 
	 
}
