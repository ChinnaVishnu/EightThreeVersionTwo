package com.jocata.star.Administration;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class UserPermissionsReport extends mainbaseLatest{

	
	public WebElement fluentWait(final By locator) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(40, TimeUnit.SECONDS)
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

	@Test(priority = 46)
	public void clickriskconfigrationedit() {
		try {
			
			ExtentTestManager.startTest("Grid :User Permission Report");
			sleep(5);
			fluentWait(By.xpath(".//*[@id='flip']/img")).click();
			sleep(5);
			fluentWait(By.xpath(".//*[@id='panel']/fieldset/div[1]/a[1]/img")).click();
			
			sleep(5);
			fluentWait(By.xpath("//span[text()='Administration']")).click();
			
			sleep(4);
			fluentWait(By.xpath("//a[text()='User Permissions Report']")).click();
			
			sleep(4);
			
			fluentWait(By.xpath("//span/span[2]")).click();
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
			.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));
			
			sleep(10);

			System.out.println("pass");
			Robot robot = new Robot();  // Robot class throws AWT Exception	
	        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
	        robot.keyPress(KeyEvent.VK_UP);  // press arrow down key of keyboard to navigate and select Save radio button	
	        
	        Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
	        robot.keyPress(KeyEvent.VK_TAB);	
	        Thread.sleep(2000);	
	        robot.keyPress(KeyEvent.VK_TAB);	
	        Thread.sleep(2000);	
	        robot.keyPress(KeyEvent.VK_TAB);	
	        Thread.sleep(2000);	
	        robot.keyPress(KeyEvent.VK_ENTER);	
	    // press enter key of keyboard to perform above selected action	
			
		//	Runtime.getRuntime().exec("D:\\AUTOMATION REQUIRED DOCS\\WebDriverThrid");
			
			Thread.sleep(11000);

			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
					+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

			Robot robotvv = new Robot();

			robotvv.keyPress(KeyEvent.VK_CONTROL);

			Thread.sleep(3000);

			robotvv.keyPress(KeyEvent.VK_END);

			Thread.sleep(3000);

			robotvv.keyRelease(KeyEvent.VK_CONTROL);

			Thread.sleep(3000);

			robotvv.keyRelease(KeyEvent.VK_END);

			Thread.sleep(11000);
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"
					+ ExtentTestManager.getTest().addScreenCapture(GetScreenshort.testrobot("ScreenshortForExtentReport")));

			robot.keyPress(KeyEvent.VK_ALT);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_F4);

			Thread.sleep(3000);
			robot.keyRelease(KeyEvent.VK_F4);
			Thread.sleep(3000);
			robot.keyRelease(KeyEvent.VK_ALT);

			System.out.println("pass from frist Second ");

			
			ExtentTestManager.getTest().log(LogStatus.INFO,  "Showing User Permission Report Results Successfully");
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	
	
	}
}
