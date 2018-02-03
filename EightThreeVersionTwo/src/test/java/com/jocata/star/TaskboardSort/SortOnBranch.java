package com.jocata.star.TaskboardSort;

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
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class SortOnBranch extends mainbaseLatest {

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

	@Test(priority = 6)

	public void clickcaseid() {

		try {

			ExtentTestManager.startTest(" TaskBoard : Sort on Branch ");

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			// ..........................................................Case
			// Type............................................................//

			sleep(6);
			fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

			// .................................................................Search.......................................................//

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(6);
			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
			sleep(6);

			// fluentWait(By.xpath("//div[6]/div/span/span")).click();

			WebElement branchele = fluentWait(By.xpath("//span[@data-qtip='Branch']"));

			Actions action = new Actions(driver);

			action.moveToElement(branchele).build().perform();

			sleep(3);

			fluentWait(By.xpath("//div[6]/div/div")).click();

			sleep(3);
			fluentWait(By.xpath("//div[2]/div[2]/div/a/span")).click();

			sleep(16);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			WebElement branchelesec = fluentWait(By.xpath("//span[@data-qtip='Branch']"));

			Actions actionsec = new Actions(driver);

			actionsec.moveToElement(branchelesec).build().perform();

			sleep(3);

			fluentWait(By.xpath("//div[6]/div/div")).click();

			sleep(3);
			fluentWait(By.xpath("//div[2]/div[2]/div[2]/a/span")).click();
			sleep(16);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		} catch (Exception e) {

			System.out.println(e.getMessage());

			ExtentTestManager.getTest().log(LogStatus.FAIL,
					" TaskBoard Sort on Branch Fail because No Matching Records ");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		}

	}

}
