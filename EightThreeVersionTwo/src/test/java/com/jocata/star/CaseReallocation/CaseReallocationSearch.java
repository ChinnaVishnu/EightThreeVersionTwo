package com.jocata.star.CaseReallocation;

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

public class CaseReallocationSearch  extends mainbaseLatest{

	
	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(10, TimeUnit.SECONDS)
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
	

	 
	@Test(priority=19)
	 public void clickCasereallocatiom(){
		 try{
 			
	         ExtentTestManager.startTest("  Case Reallocation :Select required parameters Search "); 
		
		sleep(5);
		fluentWait(By.xpath("//span[text()='Case Files']")).click();
		sleep(5);
		fluentWait(By.xpath("//a[text()='Case Re-allocation']")).click();
		
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		//..............................................level.........................................//
		sleep(4);
		fluentWait(By.xpath(".//*[@id='userLevelCombo-inputEl']")).click();
		
		sleep(4);
		fluentWait(By.xpath("//div[contains(@id,'boundlist')]//ul/li[2]/span")).click();
		
		
		sleep(4);
		fluentWait(By.xpath(".//*[@id='userNameCombo-inputEl']")).click();
		
		fluentWait(By.xpath("//div[contains(@id,'boundlist')]//following::ul[1]/li[1]/span")).click();
		
		
		sleep(4);
		fluentWait(By.xpath(".//*[@id='assignedPeriodRange']")).sendKeys("17 May 99 - 17 May 17");
		
		fluentWait(By.xpath("//img[@class='calendar']")).click();
		sleep(4);
		fluentWait(By.xpath("//li[text()='Last 60 Days']")).click();
		sleep(4);
		fluentWait(By.xpath(".//*[@id='workflowSubStatusCombo-inputEl']")).click();
		sleep(4);
		 fluentWait(By.xpath("//div[contains(@id,'ext-gen')]/span")).click();
		 
		sleep(4);
		 fluentWait(By.xpath("//label[text()='Workflow Sub-Status']")).click();
		sleep(4);
		 fluentWait(By.xpath("//div[@id='searchTrnsctnBtn']//a")).click();
		 
		 sleep(4);
		 fluentWait(By.xpath("//div[@class='x-grid-row-checker']")).click();
		 
		 sleep(4);

		 fluentWait(By.xpath(".//*[@id='distributnTypeCombo-inputEl']")).click();
		 
		 sleep(4);

		 fluentWait(By.xpath("//li[text()='Regular']")).click();
		 
		 sleep(4);

		 fluentWait(By.xpath("//div[@id='reallocatinBtnDiv']/a")).click();
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		 
		 sleep(5);
		 try{
		 fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a[2]")).click();
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		 }catch(Exception e){
			 System.out.println(e.getMessage());
			 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			 
		 }
		 
		 try{
		 fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();
          sleep(5);		 
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		 
		 }catch(Exception e){
		 ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
       
		 }
		 
		 
		 
		 }catch(Exception e){
			 System.out.println(e.getMessage());
			 
		    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		    	ExtentTestManager.getTest().log(LogStatus.FAIL, " Case Reallocation :Select required parameters Search Fail ");
	
			 
		 }
		 
	 }
	 
	 
	 
	
	
	
}
