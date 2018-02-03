package com.jocata.star.Administration;

import java.util.Random;
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
import com.jocata.star.practise.SpecialCharactres;
import com.relevantcodes.extentreports.LogStatus;

public class NotificationConfigurationUpdate2 extends mainbaseLatest {

	static String user = "raghu";

	public static String stp() {

		char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			char c = chars[random.nextInt(chars.length)];
			sb.append(c);
		}
		String output = sb.toString();
		System.out.println(user + output);

		System.out.println(user + output + "@gmail.com");

		return output;

	}

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

	@Test(priority = 41)
	public void clicknotification() {

		ExtentTestManager.startTest(" Notification Configurations : Update ");

		sleep(7);
		
		fluentWait(By.xpath("//span[text()='Administration']")).click();

		sleep(5);
		fluentWait(By.xpath("//a[text()='System Configurations']")).click();
		sleep(5);
		fluentWait(By.xpath("//a[text()='Notification Configurations']")).click();

		sleep(8);

		WebElement custommail = driver.findElement(By.xpath("//td[6]/div"));

		Actions actioncustom = new Actions(driver);

		actioncustom.moveToElement(custommail).build().perform();

		actioncustom.click().build().perform();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(8);

		fluentWait(By.xpath("//input[contains(@id,'textfield')]")).clear();
		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		String custommails = stp();

		fluentWait(By.xpath("//input[contains(@id,'textfield')]")).sendKeys(user + custommails + "@gmail.com");

		sleep(8);

		WebElement element = driver.findElement(By.xpath("//td[7]/div"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		action.click().build().perform();

		sleep(8);

		// driver.findElement(By.xpath("//td[7]/div")).clear();

		fluentWait(By.xpath("//td[2]//following::input[4]")).clear();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		int randomnum = getRandomNumberInRange();

		String testare = String.valueOf(randomnum);

		System.out.println(testare);

		sleep(6);

		fluentWait(By.xpath("//td[2]//following::input[4]")).sendKeys(testare);

		/*
		 * String raghu = null;
		 * 
		 * fluentWait(By.xpath("//input[contains(@id,'textfield')]")).sendKeys(
		 * raghu+"@gmail.com");
		 */

		sleep(6);

		fluentWait(By.xpath("//div[@id='updateNotifConf']//a")).click();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		sleep(6);

		fluentWait(By.xpath("//div[contains(@id,'messagebox')]//a")).click();

		ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
				.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	}

}
