package com.jocata.star.Administration;

import java.util.Random;
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

public class SysytemConfigurationFalsePositiveLimits extends mainbaseLatest {

	private static int getRandomNumberInRange() {

		Random randomGenerator = new Random();

		int randomInt = randomGenerator.nextInt(100);

		return randomInt;

	}

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(20, TimeUnit.SECONDS)
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

	@Test(priority = 38)
	public void clicknotification() {

		try {

			ExtentTestManager.startTest("   SystemConfigurations FalsePositive : Limits Update  ");

			fluentWait(By.xpath("//span[text()='Administration']")).click();

			fluentWait(By.xpath("//a[text()='System Configurations']")).click();

			fluentWait(By.xpath("//span[text()='False Positive Limits']")).click();

			fluentWait(By.xpath("//a[text()='False Positive Limits']")).click();

			fluentWait(By.xpath(".//*[@id='durationId']")).clear();

			sleep(5);
			// ................................Maximum Duration
			// (Days)..........................//

			int randomnum = getRandomNumberInRange();

			System.out.println(randomnum);

			fluentWait(By.xpath(".//*[@id='durationId']")).sendKeys(String.valueOf(randomnum));

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(5);
			fluentWait(By.xpath("//div[@id='saveButton']//a")).click();

			fluentWait(By.xpath("//a[2]/span/span/span[2]")).click();
			sleep(4);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();

			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		} catch (Exception e) {
			System.out.println(e.getMessage());

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.FAIL, " SystemConfigurations FalsePositive : Limits Update  ");
		}

	}
}
