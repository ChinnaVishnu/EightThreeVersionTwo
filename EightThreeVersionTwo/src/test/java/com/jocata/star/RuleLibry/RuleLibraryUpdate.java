package com.jocata.star.RuleLibry;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;
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

public class RuleLibraryUpdate extends mainbaseLatest {

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

	@Test(priority = 28)
	public void deletebenchmark() {

		ExtentTestManager.startTest("  RuleLibrary : SearchRule Expand Edit Benchmark Update ");

		try {
			clickAddbench();
		} catch (HeadlessException | AWTException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickAddbench() throws HeadlessException, AWTException, IOException {

		try {

			fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();
			WebElement element = fluentWait(By.xpath("//a[text()='Rule Library']"));

			Actions action = new Actions(driver);
			action.moveToElement(element).click().build().perform();
			sleep(3);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			// .........................................Clicking the Search
			// Button.......................................................//

			fluentWait(By.xpath("//table[@id='rulesIdCombo-triggerWrap']")).click();

			List<WebElement> elements = driver.findElements(By.xpath("//ul/li/div"));

			for (WebElement all : elements) {

				System.out.println(all.getAttribute("data-qtip").toString());

				if (all.getAttribute("data-qtip").equals("1109")) {

					if (!all.isSelected()) {

						all.click();
					}

				}

			}

			sleep(4);

			fluentWait(By.xpath("//div[@id='searchRuleButton']/a")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//td[4]/div")).click();

			fluentWait(By.xpath("//img[@title='Edit']")).click();

			fluentWait(By.xpath("//div[@id='editRuleButton']/a")).click();

			sleep(4);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();

			sleep(4);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		} catch (Exception e) {

			sleep(6);
			ExtentTestManager.getTest().log(LogStatus.FAIL,
					"  RuleLibrary : SearchRule Expand Edit Benchmark Update   ");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		}

	}

}
