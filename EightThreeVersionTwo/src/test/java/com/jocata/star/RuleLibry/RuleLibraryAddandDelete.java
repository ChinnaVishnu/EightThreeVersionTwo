package com.jocata.star.RuleLibry;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class RuleLibraryAddandDelete extends mainbaseLatest {

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

	@Test(priority = 29)
	public void deletebenchmark() throws HeadlessException, AWTException, IOException {

		ExtentTestManager.startTest("  RuleLibrary : SearchRule Expand Delete Benchmark ");

		clickAddbench();

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

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[@id='searchRuleButton']/a")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//img[@title='Add']")).click();

			sleep(6);
			fluentWait(By.xpath("//div/div/div/ul/li/div")).click();

			fluentWait(By.xpath(".//*[@id='rulesConfValueses2thresholdValue1']")).sendKeys("120");

			fluentWait(By.xpath(".//*[@id='rulesConfValueses2thresholdValue2']")).sendKeys("130");

			fluentWait(By.xpath(".//*[@id='rulesConfValueses3thresholdValue1']")).sendKeys("111");

			fluentWait(By.xpath(".//*[@id='rulesConfValueses3thresholdValue2']")).sendKeys("122");

			fluentWait(By.xpath("//td[3]/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click();

			fluentWait(By.xpath("//div[12]/div/ul/li[4]")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//div[@id='ruleEveryForWeekly']/label")).click();

			sleep(8);
			WebElement referenceperiod = fluentWait(By.id("rulePeriod"));
			referenceperiod.sendKeys("24");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			/*
			 * Select selectseond=new Select(referenceperiod);
			 * selectseond.selectByVisibleText("Rolling Months");
			 */

			fluentWait(By.id("rulePeriodType-inputEl")).click();

			fluentWait(By.xpath("//li[text()='Days']")).click();

			fluentWait(By.xpath("//div[@id='addBnchmrkButton']")).click();

			try {
				WebElement elementnn = fluentWait(By.xpath("//div[contains(@id,'-toolbar')]//div//a[3]"));

				// JavascriptExecutor js =(JavascriptExecutor)driver;
				((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementnn.getLocation().y + ")");
				elementnn.click();

				sleep(8);
				ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
						.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			} catch (org.openqa.selenium.NoSuchElementException e) {

				System.out.println("no element");

			}

			try {
				fluentWait(By.xpath("//div[contains(@id,'messagebox-')]//a")).click();

				String Addbench = fluentWait(By.xpath("//tr[@id='gridview-1038-record-ext-record-7']")).getText();

				ExtentTestManager.getTest().log(LogStatus.INFO, " Add Benchmark ");

				ExtentTestManager.getTest().log(LogStatus.PASS, Addbench);

			} catch (org.openqa.selenium.NoSuchElementException e) {
				System.out.println("no element");

				ExtentTestManager.getTest().log(LogStatus.SKIP, " MISSING WINDOW POPUP ");

			} catch (org.openqa.selenium.WebDriverException e) {
				System.out.println("hi");

			}

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			System.out.println("This is Create a New Bench Mark");

			sleep(10);

			JavascriptExecutor jseNetworkAn = (JavascriptExecutor) driver;

			jseNetworkAn.executeScript("window.scrollBy(0,-900)", "");

			sleep(10);

			System.out.println("SucessFully created a bench mark");

			sleep(10);

			// fluentWait(By.xpath("//td[4]/div")).click();

			fluentWait(By.xpath("//td[10]/div/a[2]/img")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(9);
			fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a[2]")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(9);

			fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		} catch (Exception e) {

			ExtentTestManager.getTest().log(LogStatus.FAIL, " RuleLibrary : SearchRule Expand Delete Benchmark   ");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		}

	}

}
