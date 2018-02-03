package com.jocata.star.Taskboard;

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

public class SearchForTrancations extends mainbaseLatest {

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

	@Test(priority = 12)

	public void clickcaseid() {

		sleep(6);

		try {

			ExtentTestManager.startTest(" Taskborad: Search for Transactions(AccountNumber or Customer ID) ");

			fluentWait(By.xpath("//span[text()='Case Files']")).click();

			sleep(6);
			fluentWait(By.xpath("//ul[@id='trans-nav']//a[text()='Task Board']")).click();

			// ..........................................................Case
			// Type............................................................//

			sleep(6);
			fluentWait(By.xpath("//input[@id='casesTypesCombo-inputEl']")).click();

			fluentWait(By.xpath("//li[text()='Other Cases']")).click();

			// .................................................................Search.......................................................//

			sleep(6);
			fluentWait(By.xpath("//div[@id='buttonSearch']/a")).click();
			sleep(9);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//tbody[starts-with(@id,'gridview')]/tr")).click();

			sleep(16);

			fluentWait(By.xpath("//td[4]/div/span")).click();

			/// fluentWait(By.xpath("//span[@class='qckPrvwLabel']")).click();
			sleep(9);
			fluentWait(By.xpath("//input[@name='searchCusId']")).sendKeys("JOCATA1308");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath(".//*[@id='transActPeriod']")).sendKeys("04 Aug 15 - 12 Aug 15");

			// fluentWait(By.xpath("//div[3]/ul/li[6]")).click();
			sleep(9);

			fluentWait(By.xpath("//td[text()='Amount Involved']")).click();
			sleep(9);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//td[2]/div/a/span/span/span[2]")).click();
			sleep(19);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		} catch (Exception e) {
			System.out.println(e.getMessage());

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.FAIL,
					" Taskborad: Search for Transactions(AccountNumber or Customer ID) ");

			driver.navigate().refresh();

		}

	}

}
