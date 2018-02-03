package com.jocata.star.Administration;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class AuditLogModuleName extends mainbaseLatest {

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

	@Test(priority = 37)
	public void clickonAuditlogmodulename() throws AWTException, InterruptedException {

		try {

			ExtentTestManager.startTest("  Audit Log : Search with Module Name And Export ");

			fluentWait(By.xpath("//span[text()='Administration']")).click();

			fluentWait(By.xpath("//a[text()='Audit Log']")).click();

			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath(".//*[@id='textModuleId-inputEl']")).sendKeys("MIS Reports - Delete");

			sleep(7);
			fluentWait(By.xpath(".//*[@id='textModuleId-inputEl']")).sendKeys(Keys.ENTER);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			sleep(7);
			fluentWait(By.xpath("//div[@id='form']")).click();

			sleep(15);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

			Robot robot = new Robot(); // Robot class throws AWT Exception
			Thread.sleep(2000); // Thread.sleep throws InterruptedException
			robot.keyPress(KeyEvent.VK_DOWN); // press arrow down key of
												// keyboard to navigate and
												// select Save radio button

			Thread.sleep(2000); // sleep has only been used to showcase each
								// event separately
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			// press enter key of keyboard to perform above selected action

			Thread.sleep(3000);
			/*
			 * robot.keyPress(KeyEvent.VK_CONTROL);
			 * 
			 * robot.keyPress(KeyEvent.VK_J);
			 * 
			 * 
			 * ExtentTestManager.getTest().log(LogStatus.INFO,
			 * "Screenshortbelow :"
			 * +ExtentTestManager.getTest().addScreenCapture(GetScreenshort.
			 * testrobot("ScreenshortForExtentReport")));
			 * 
			 * Thread.sleep(3000);
			 * 
			 * robot.keyPress(KeyEvent.VK_CONTROL);
			 * 
			 * robot.keyPress(KeyEvent.VK_W);
			 * 
			 * 
			 * 
			 * robot.keyRelease(KeyEvent.VK_J); robot.keyRelease(KeyEvent.VK_W);
			 * 
			 * robot.keyRelease(KeyEvent.VK_CONTROL);
			 */
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

			sleep(4);
			System.out.println("pass audit log");

		} catch (Exception e) {
			System.out.println(e.getMessage());

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.INFO, " CENTRA STR :  Search Update STR Details ");
			sleep(6);

			fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();

			// if(fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).isDisplayed()){

			// };

		}

	}

}
