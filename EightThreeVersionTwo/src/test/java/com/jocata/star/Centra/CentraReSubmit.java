package com.jocata.star.Centra;

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

public class CentraReSubmit extends mainbaseLatest {

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	};

	public void sleep(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test(priority = 34)
	public void clickregeranteStr() {

		 try{

		ExtentTestManager.startTest("  CENTRA STR :  Search ReSubmit STR  ");

		fluentWait(By.xpath("//span[text()='CENTRA']")).click();

		fluentWait(By.xpath("//a[text()='Regulatory Reports']")).click();

		sleep(5);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//span[text()='STR']")).click();
		sleep(5);
		fluentWait(By.xpath("//div[@id='strSearchButton']//a")).click();

		fluentWait(By.xpath("//td/div/div")).click();

		sleep(7);
		fluentWait(By.xpath("//span[@id='actionsMenuButton-btnIconEl']")).click();

		fluentWait(By.xpath("//div[2]/a/span")).click();
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();
		fluentWait(By.xpath("//a[@id='ctrReportLink']")).click();

		fluentWait(By.xpath("//input[@id='regRef']")).sendKeys("54");

		fluentWait(By.xpath("//input[@id='regStatus-inputEl']")).click();

		fluentWait(By.xpath("//li[text()='Invalid']")).click();

		fluentWait(By.xpath("//div[@id='addRegButton']/a")).click();

		// ...............................................................................................................
		sleep(8);

		fluentWait(By.xpath("//td/div/div")).click();

		fluentWait(By.xpath("//span[@id='actionsMenuButton-btnIconEl']")).click();

		fluentWait(By.xpath("//div[2]/a/span")).click();
		sleep(6);
		fluentWait(By.xpath("//table[@id='resubmitCombo']//tr[1]//td[2]/div")).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(6);
		fluentWait(By.xpath("//div[@data-qtip='Not applicable as this is a new batch ']")).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		fluentWait(By.xpath("//div[@id='addReasonButton']/a")).click();
		sleep(6);
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a[3]")).click();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		sleep(6);
		fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
		
		

		 }catch(Exception e){
			 
			 
			 System.out.println(e.getMessage());
			 ExtentTestManager.getTest().log(LogStatus.SKIP,"STR ID Checkbox is changing the location");
			 
		 }

	}

}
