package com.jocata.star.RuleBulider;

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

public class RuleBuliderUpdate extends mainbaseLatest {

	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(90, TimeUnit.SECONDS)
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

	@Test(priority = 25)
	public void clickrulebuliderupdate() {
		try {
			sleep(8);
			ExtentTestManager.startTest(" RuleBuilder :  Edit Rule Update   ");

			fluentWait(By.xpath("//span[text()='Rules and Patterns']")).click();

			sleep(8);

			fluentWait(By.xpath("//a[text()='Rule Builder']")).click();

			sleep(7);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			// ...................................................Rule Name...............................................................//

			fluentWait(By.xpath(".//*[@id='selectRuleNameCombo-inputEl']")).click();
			sleep(9);
			fluentWait(By.xpath(".//*[@id='selectRuleNameCombo-inputEl']")).sendKeys("rule1489661539806");
			sleep(9);
			fluentWait(By.xpath("//div[@data-qtip='rule1489661539806']")).click();

			sleep(9);
			// ..........................Reference
			// Number.................................................................//

			fluentWait(By.xpath("//input[@id='ruleReferenceNmbr']")).clear();

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			sleep(8);
			fluentWait(By.xpath("//input[@id='ruleReferenceNmbr']")).sendKeys("12367");
			sleep(9);
			fluentWait(By.xpath("//div[@id='createRuleTransDet']//span")).click();

			// sucessfully created

			sleep(6);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			fluentWait(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();

			sleep(7);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		} catch (Exception e) {

			sleep(6);
			ExtentTestManager.getTest().log(LogStatus.FAIL, "RuleBuilder :  Edit Rule Update");

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		}

	}

}
