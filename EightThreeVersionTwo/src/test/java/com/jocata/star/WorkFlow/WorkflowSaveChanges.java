package com.jocata.star.WorkFlow;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class WorkflowSaveChanges extends  mainbaseLatest {

	public WebElement fluentWait(final By locator){
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	        .withTimeout(30, TimeUnit.SECONDS)
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
	
	
	@Test(priority=14)
	public void login() throws IOException{
			
	
		 ExtentTestManager.startTest("  WorkFlow Dispiration : Actions  ");
		
		/*		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("l3_user");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Star@123");
				driver.findElement(By.xpath("//span[@id='loginButtonExt-btnIconEl']")).click();
		*/		clickDashboard();
				}

				public  void clickDashboard() throws IOException{
					//driver.findElement(By.xpath("//span[text()='Rules and Patterns']")).click();
					//driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
					
					
					
					
					fluentWait(By.xpath("//span[text()='Case Files']")).click();
					//sleep(11);
					
					
					fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();
					
		//..........................................................Case Type............................................................//
					
					
					
					
					fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();
					sleep(8);
					
				fluentWait(By.xpath("//li[text()='Other Cases']")).click();	
					
					
					
		//.................................................................Search.......................................................//
				
				
				
			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
			
			
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			
			sleep(4);
			
			 List<WebElement> jocata=driver.findElements(By.xpath("//tbody[contains(@id,'gridview-')]/tr"));
				
				for (WebElement ele : jocata) {
					
					
			String text=ele.getText();
			
			ExtentTestManager.getTest().log(LogStatus.INFO, text);	

					
				}
			

				
			fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();
			
			
			
			
			//............................................clicking the workflow...........................................................//

  
			//
			
			sleep(6);
			
			fluentWait(By.xpath("//*[contains(@id,'workflowBtn')]")).click();
			
			
			
			sleep(6);
			fluentWait(By.xpath(".//*[@id='escalCommCombo-inputEl']")).click();
				
			
			fluentWait(By.xpath("//div[contains(@id,'boundlist-')][2]//ul/li")).click();
			
			
			
			fluentWait(By.xpath("//div[4]/div/div[2]/div/div/a/span/span/span[2]")).click();
			
			//..................Click o Suggest STR........................................................................//
			
			
			//fluentWait(By.xpath("//div[@class='workflowpanelDivinPopUpContent_title tleft']//following::img[5]")).click();
			
			fluentWait(By.xpath("//img[@id='tool-1661-toolEl_3']")).click();
			
		
			
			
			
			
			
			sleep(10);
			fluentWait(By.xpath(".//*[@id='accTypeCombo24234-inputEl']")).click();
			sleep(10);
			fluentWait(By.xpath("//ul[@class='x-list-plain']//following::li[5]")).click();

			
			sleep(20);
			
			fluentWait(By.xpath("//span[text()='Details of Related Account']")).click();
			
			
			
			/*WebElement elementToClick = driver.findElement(By.xpath("//span[text()='Add Account']"));



			// Scroll the browser to the element's X position

			((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");



			// Click the element

			elementToClick.click();*/
			
			
			driver.findElement(By.xpath("//a[@class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon']")).click();
			
			
			fluentWait(By.xpath("//table[3]/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click();   //click on image icoin
			
			
			
			fluentWait(By.xpath("//div[2]/div/div[2]/div/table/tbody/tr[2]/td/div/div")).click();
			
			
			
			fluentWait(By.xpath("//a[6]/span/span/span[2]")).click();
			
			//fluentWait(By.xpath("//span[text()='Save Changes']")).click();
			
			
			driver.findElement(By.xpath("//a[@class='x-btn x-unselectable x-btn-toolbar x-box-item x-toolbar-item x-btn-default-toolbar-small x-noicon x-btn-noicon x-btn-default-toolbar-small-noicon'][3]")).click();
			
			//Status change
			
			
			fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a[2]")).click();
			
			
			
			
			
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			
			jse.executeScript("window.scrollBy(0,-450)", "");
			
			
			
			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();
			


			
			
			
			
			
			
			
			
}
}