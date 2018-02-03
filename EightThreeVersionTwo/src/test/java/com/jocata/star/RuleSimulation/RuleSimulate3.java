package com.jocata.star.RuleSimulation;

import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.Randomwords;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class RuleSimulate3 extends mainbaseLatest {

	public String user = "Ram";

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

	@Test(priority = 30)
	public void clickRulesimualtes() {

		try {

			ExtentTestManager.startTest("  Rule Simulator : Simulate and Save   ");

			fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();

			fluentWait(By.xpath("//a[text()='Rule Simulator']")).click();

			sleep(7);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath(".//*[@id='rulesdropdown-inputEl']")).click();

			//........High value transactions in a new account
			
			fluentWait(By.xpath("//li[text()='High activity in a new account']")).click();

			fluentWait(By.xpath(".//*[@id='benchMarkIdCombo-inputEl']")).click();

			fluentWait(By.xpath("//tr[2]/td[2]/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")).click();

			try{
			
			fluentWait(By.xpath("//li[text()='B283']")).click();

			}catch(Exception e){
				ExtentTestManager.getTest().log(LogStatus.INFO,"Changeing the Benchmark ID");
				
			}
			sleep(12);

			fluentWait(By.xpath(".//*[@id='frequency']")).sendKeys("3");

			fluentWait(By.xpath(".//*[@id='no_of_slices']")).sendKeys("3");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//span[4]/a/span/span/span[2]")).click();

			// sleep(12);
			// ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow
			// :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver,
			// "ScreenshortForExtentReport")));

			// fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();

			sleep(13);

			fluentWait(By.xpath("//span[@id='saveSimulation']")).click();

			Randomwords h = new Randomwords();

			String raaaa = h.stp();

			System.out.println(user + raaaa);

			sleep(11);

			fluentWait(By.xpath("//input[@id='simulationGroupNameInput']")).sendKeys(user + raaaa);

			sleep(8);
			fluentWait(By.xpath("//div[@id='simulationsave']/a")).click();
			sleep(6);
			fluentWait(By.xpath("//div[contains(@id,'messagebox')]/a")).click();

			sleep(13);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			JavascriptExecutor jse = (JavascriptExecutor) driver;

			jse.executeScript("scroll(0, -350);");

			sleep(3);

			System.out.println("pass");

		} catch (Exception e) {

			System.out.println(e.getMessage());

			ExtentTestManager.getTest().log(LogStatus.FAIL, " Rule Simulator : Simulate  and save Fail ");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			driver.navigate().refresh();

		}

	}

}
