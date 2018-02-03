package com.jocata.TranscationSetails;

import java.util.List;
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

public class TrancastionDetails extends mainbaseLatest {

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
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

	@Test(priority = 42)
	public void logintranscationdetails() {

		ExtentTestManager.startTest("  Transaction Details : Search For Trancations  ");

		sleep(8);

		fluentWait(By.xpath("//span[text()='Case Files']")).click();
		sleep(7);
		fluentWait(By.xpath("//a[text()='Transaction Details']")).click();

		sleep(8);

		fluentWait(By.xpath("//input[@name='searchCusId']")).sendKeys("JOCATA1308");
		// fluentWait(By.xpath(".//*[@id='transctnssearchCusId0']")).sendKeys("JOCATA1308");

		sleep(8);
		fluentWait(By.xpath(".//*[@id='transActPeriod']")).sendKeys("04 Aug 15 - 12 Aug 15");

		sleep(8);
		fluentWait(By.xpath("//div[@id='searchTrnsctnBtn']/a")).click();
		sleep(6);

		List<WebElement> details = driver.findElements(By.xpath("//tr[contains(@id,'gridview')]"));

		for (WebElement noofdetails : details) {

			String Trancationdetailsnum = noofdetails.getText();

			ExtentTestManager.getTest().log(LogStatus.INFO, Trancationdetailsnum);

		}

		sleep(5);
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		ExtentTestManager.getTest().log(LogStatus.PASS, " Transaction Details : Search For Trancations ");

	}

}
