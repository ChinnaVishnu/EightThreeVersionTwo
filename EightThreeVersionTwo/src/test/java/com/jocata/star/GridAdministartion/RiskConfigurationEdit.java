package com.jocata.star.GridAdministartion;

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

public class RiskConfigurationEdit  extends mainbaseLatest{

	
	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(40, TimeUnit.SECONDS)
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


	@Test(priority=43)
	public void clickriskconfigrationedit(){
		try{
			
			 ExtentTestManager.startTest("  Administration Risk Configuration Edit, Update, Delete,Save"); 
		
		sleep(4);
		fluentWait(By.xpath(".//*[@id='flip']/img")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(4);
		fluentWait(By.xpath("//div[@id='panel']//img")).click();
		sleep(4);
		fluentWait(By.xpath("//span[text()='Administration']")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(4);
		fluentWait(By.xpath("//a[text()='GRID Configurations']")).click();
		sleep(4);
		fluentWait(By.xpath("//span[text()='Risk Configuration']")).click();
		sleep(4);
		
		fluentWait(By.xpath("//a[text()='Risk Configuration']")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
		sleep(4);
		fluentWait(By.xpath(".//*[@id='headerriskConfig_header_hd-textEl']/a[1]")).click();
		sleep(4);
		
		fluentWait(By.xpath("//span/div/div/div/ul/li")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
		sleep(4);
		fluentWait(By.xpath("//table[2]/tbody/tr/td[2]/div/span/div/div/div/ul/li")).click();
		sleep(4);
		fluentWait(By.xpath("//table[3]/tbody/tr/td[2]/div/span/div/div/div/ul/li")).click();
		
		sleep(4);
		fluentWait(By.xpath("//table[4]/tbody/tr/td[2]/div/span/div/div/div/ul/li")).click();
		sleep(4);
		fluentWait(By.xpath("//table[5]/tbody/tr/td[2]/table/tbody/tr/td/input")).click();
		
		sleep(4);
		fluentWait(By.xpath("//li[text()='Medium']")).click();
		sleep(4);
		fluentWait(By.xpath("//span/div/a")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(4);
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a[2]")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(19);
		fluentWait(By.xpath("//div[@class='x-form-cb-wrap-inner x-form-cb-wrap-inner-no-box-label']/input")).click();
		
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(12);
		fluentWait(By.xpath(".//*[@id='headerriskConfig_header_hd-textEl']/a[2]")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
		sleep(12);
		fluentWait(By.xpath("//span/div/a/span/span/span[2]")).click();
		
		sleep(19);
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a[2]")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
		sleep(19);
		fluentWait(By.xpath("//div[@class='x-form-cb-wrap-inner x-form-cb-wrap-inner-no-box-label']/input")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


		sleep(12);
		fluentWait(By.xpath(".//*[@id='headerriskConfig_header_hd-textEl']/a[3]")).click();
    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		
		

		 }catch(Exception e){
			 System.out.println(e.getMessage());
			 
		    	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		    	ExtentTestManager.getTest().log(LogStatus.FAIL, " Administration Risk Configuration Edit, Update, Delete,Save");
		    	
		    	
		 }
	}
}
