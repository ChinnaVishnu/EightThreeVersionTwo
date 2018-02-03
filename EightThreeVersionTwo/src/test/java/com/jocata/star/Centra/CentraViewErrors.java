package com.jocata.star.Centra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

public class CentraViewErrors extends mainbaseLatest {

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

	@Test(priority = 31)
	public void clickViewErrors() throws InterruptedException, AWTException {

		try {

			ExtentTestManager.startTest("  CENTRA STR : Search View Errors  ");
			sleep(10);

			fluentWait(By.xpath("//span[text()='CENTRA']")).click();

			sleep(10);

			fluentWait(By.xpath("//a[text()='Regulatory Reports']")).click();

			sleep(10);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			sleep(5);

			fluentWait(By.xpath("//span[text()='STR']")).click();

			sleep(5);
			fluentWait(By.xpath("//span/span[2]")).click();

			sleep(5);

			fluentWait(By.xpath("//a[@id='strReportLink']")).click();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

			sleep(5);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			Robot robot = new Robot(); // Robot class throws AWT Exception

			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);

			robot.keyPress(KeyEvent.VK_J);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

			Thread.sleep(3000);

			robot.keyPress(KeyEvent.VK_CONTROL);

			robot.keyPress(KeyEvent.VK_W);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

			robot.keyRelease(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_W);

			robot.keyRelease(KeyEvent.VK_CONTROL);

			/*
			 * Robot robot = new Robot(); // Robot class throws AWT Exception
			 * Thread.sleep(2000); // Thread.sleep throws InterruptedException
			 * robot.keyPress(KeyEvent.VK_DOWN); // press arrow down key of
			 * keyboard to navigate and select Save radio button
			 * 
			 * Thread.sleep(2000); // sleep has only been used to showcase each
			 * event separately robot.keyPress(KeyEvent.VK_TAB);
			 * Thread.sleep(2000); robot.keyPress(KeyEvent.VK_TAB);
			 * Thread.sleep(2000); robot.keyPress(KeyEvent.VK_TAB);
			 * Thread.sleep(2000); robot.keyPress(KeyEvent.VK_ENTER); // press
			 * enter key of keyboard to perform above selected action
			 * Thread.sleep(2000); robot.keyPress(KeyEvent.VK_CONTROL);
			 * 
			 * robot.keyPress(KeyEvent.VK_J); Thread.sleep(3000);
			 * 
			 * robot.keyPress(KeyEvent.VK_CONTROL);
			 * 
			 * 
			 * 
			 * 
			 * robot.keyPress(KeyEvent.VK_W); Thread.sleep(3000);
			 * 
			 * 
			 * 
			 * robot.keyPress(KeyEvent.VK_ALT);
			 * 
			 * Thread.sleep(3000);
			 * 
			 * robot.keyRelease(KeyEvent.VK_4);
			 * 
			 * 
			 * Thread.sleep(3000); Actions actions = new Actions(driver);
			 * actions.keyDown(Keys.ALT); Thread.sleep(3000);
			 * actions.sendKeys(Keys.F4); actions.keyUp(Keys.ALT);
			 * actions.perform();
			 * 
			 * 
			 * 
			 * robot.keyRelease(KeyEvent.VK_J); robot.keyRelease(KeyEvent.VK_W);
			 * 
			 * robot.keyRelease(KeyEvent.VK_ALT); //
			 * robot.keyRelease(KeyEvent.VK_F4);
			 * 
			 * robot.keyRelease(KeyEvent.VK_CONTROL);
			 * 
			 * 
			 * 
			 * 
			 * robot.keyPress(KeyEvent.VK_CONTROL);
			 * 
			 * robot.keyPress(KeyEvent.VK_J); Thread.sleep(3000);
			 * 
			 * robot.keyPress(KeyEvent.VK_CONTROL);
			 * 
			 * 
			 * 
			 * 
			 * robot.keyPress(KeyEvent.VK_W);
			 * 
			 * Thread.sleep(3000);
			 * 
			 * robot.keyRelease(KeyEvent.VK_J); robot.keyRelease(KeyEvent.VK_W);
			 * 
			 * robot.keyRelease(KeyEvent.VK_CONTROL);
			 */

			Thread.sleep(13000);

			// driver.navigate().refresh();

			// driver.findElement(By.xpath("//span[text()='Case
			// Files']")).click();

			System.out.println("pass");

		} catch (Exception e) {
			System.out.println(e.getMessage());

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.FAIL, " CENTRA STR : Search View Errors ");
		}

	}
}
