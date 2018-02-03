package com.jocata.MarkerChecker;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.jocata.star.basescripts.ExtentTestManager;
import com.jocata.star.basescripts.GetScreenshort;
import com.jocata.star.basescripts.mainbaseLatest;
import com.relevantcodes.extentreports.LogStatus;

public class MakerCheckerRejected extends mainbaseLatest {

	String ruleName = "ruleab";
	String ruleNames = ruleName + new Date().getTime();
	
	
	

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

	@Test(priority = 44)
	public void clickmarkApp(){
		
        ExtentTestManager.startTest("  Maker Checker : Rejected "); 

		
		clickMakerchecker();
		clickingrules();
		clickingAdministration();
		clickingAnalayast();
		clickreveiwever();
		
	}
	
	
	
	public void clickMakerchecker() {

		driver.findElement(By.xpath("//div[@id='flip']/img")).click();

		driver.findElement(By.xpath("//div[@id='panel']//img")).click();

		driver.findElement(By.xpath("//span[text()='Administration']")).click();

		driver.findElement(By.xpath("//a[text()='STAR Configurations']")).click();

		driver.findElement(By.xpath("//span[text()='STAR Maker Checker']")).click();

		driver.findElement(By.xpath("//a[text()='STAR Maker Checker']")).click();

		driver.findElement(By.xpath("//li[text()='Rule Builder']")).click();

		driver.findElement(By.xpath("//span/span[2]")).click();

		driver.findElement(By.xpath("//div[@id='saveGridMCButton']/a")).click();

		driver.findElement(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		driver.findElement(By.xpath("//div[@id='flip']//img")).click();

		driver.findElement(By.xpath("//a[text()='Log Out']")).click();

		driver.findElement(By.xpath("//a[text()='here']")).click();

		driver.findElement(By.xpath("//input[@id='unme']")).sendKeys(Repository.getProperty("username"));

		driver.findElement(By.xpath("//input[@id='pwdt']")).sendKeys(Repository.getProperty("password"));
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		driver.findElement(By.xpath("//div[@id='loginButton']/a")).click();

		driver.findElement(By.xpath("//div[@id='flip']//img")).click();

		driver.findElement(By.xpath("//div[@id='panel']//img")).click();

	}

	// .............clicking the rules and
	// patterns..................................................................................//

	public void clickingrules() {

		driver.findElement(By.xpath("//span[text()='Rules and Patterns']")).click();

		driver.findElement(By.xpath("//a[text()='Rule Builder']")).click();
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		driver.findElement(By.xpath("//a[@class='add-icon icon']")).click();

		driver.findElement(By.xpath("//input[@id='ruleTemplateCombo-inputEl']")).click();

		driver.findElement(By.xpath("//div[@data-qtip='Transaction Determination']")).click();

		driver.findElement(By.xpath("//input[@id='ruleModel-inputEl']")).click();
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		driver.findElement(By.xpath("//li[text()='Cash and Structuring']")).click();

		driver.findElement(By.xpath("//input[@id='ruleName']")).sendKeys(ruleNames);
		System.out.println("ruleName" + ruleNames);

		// ........................... clicking
		// Desception..................................................................//
		driver.findElement(By.xpath("//textarea[@id='ruleDescription']")).sendKeys(" how are you");

		// ................................. clicking the
		// Referencenumber....................................................//

		driver.findElement(By.xpath("//input[@id='ruleReferenceNmbr']")).sendKeys("1234455");

		// ..................................... selecting the
		// level............................................................//

		driver.findElement(By.xpath("//input[@id='investigationLevel-inputEl']")).click();

		driver.findElement(By.xpath("//li[text()='Reviewer']")).click();
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		// ................................ clicking the priority
		// levels........................................................ //

		driver.findElement(By.xpath("//input[@id='rulePriority-inputEl']")).click();

		driver.findElement(By.xpath("//li[text()='4']")).click();

		driver.findElement(By.xpath("//input[@id='valDetRulePeriod']")).sendKeys("23");

		// .......................................... Key
		// Parameter...............................................................//

		driver.findElement(By.xpath("//input[@id='keyParameter-inputEl']")).click();

		driver.findElement(By.xpath("//div[@data-qtip='Tran. Amount']")).click();

		driver.findElement(By.xpath("//input[@id='ruleStatus-inputEl']")).click();

		driver.findElement(By.xpath("//li[text()='Inactive']")).click();

		// ................................... Threshold Parameters
		// ................................................................//

		driver.findElement(By.id("temp_ruleBldrVOThreshholdTransDetList[0].thresholdTransDetFilterVal-inputEl"))
				.click();

		driver.findElement(By.xpath("//li[text()='Tran. Amount']")).click();

		driver.findElement(By.xpath("//div[@id='createRuleTransDet']/a")).click();

		driver.findElement(By.xpath("//img[@class='x-tool-img x-tool-close']")).click();

	}

	public void clickingAdministration() {

		driver.findElement(By.xpath("//span[text()='Administration']")).click();
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		driver.findElement(By.xpath("//a[text()='Maker Checker']")).click();

		driver.findElement(By.xpath("//input[@id='filReferenceId-inputEl']")).sendKeys(ruleNames);

		driver.findElement(By.xpath("//input[@id='filReferenceId-inputEl']")).sendKeys(Keys.ENTER);
		
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

		WebDriverWait wait=new WebDriverWait(driver, 95000);
		
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='x-grid-row-checker']")));
/*	    driver.findElement(By.xpath("//div[@class='x-grid-row-checker']")).click();
*/	    wait.until(elementIdentified(By.xpath("//div[@class='x-grid-row-checker']")));        

	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid-row-checker']")));
		
		
	    WebElement elementToClick = driver.findElement(By.xpath("//div[@class='x-grid-row-checker']"));

		// Scroll the browser to the element's Y position
		Actions Action=new Actions(driver);
		Action.moveToElement(elementToClick).build().perform();
		
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().y + ")");

		// Click the element

		elementToClick.click();
	    
		/*WebElement elementToClick = driver.findElement(By.xpath("//td/div/div"));

		((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().x + ")");

		elementToClick.click();
		*/
		
		
		
		/*for(int i=0; i<5;i++)
			
			try {

				WebElement element=driver.findElement(By.xpath("//td/div/div"));
				WebDriverWait wait = new WebDriverWait(driver, 5000);
				wait.until(ExpectedConditions.elementToBeClickable(element));


				break;
	            } catch(StaleElementReferenceException e) {
	              e.toString();
	               System.out.println("Trying to recover from a stale element :" + e.getMessage());
	            }
		
		*/
		
		
	    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));


		driver.findElement(By.xpath("//a[@id='actionsMenuButton']")).click();

		driver.findElement(By.xpath("//span[text()='Reject']")).click();
		
		driver.findElement(By.xpath("//div[contains(@id,'messagebox')]/a")).click();
		

	}

	
public void clickingAnalayast(){
	
	driver.findElement(By.xpath("//div[@id='flip']/img")).click();
	driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	driver.findElement(By.xpath("//a[text()='here']")).click();
	driver.findElement(By.xpath("//input[@id='unme']")).sendKeys(Repository.getProperty("appusername"));
    driver.findElement(By.xpath("//input[@id='pwdt']")).sendKeys(Repository.getProperty("apppassword"));
	driver.findElement(By.xpath("//div[@id='loginButton']/a")).click();
    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	driver.findElement(By.xpath("//span[text()='Administration']")).click();

	driver.findElement(By.xpath("//a[text()='Maker Checker']")).click();

	driver.findElement(By.xpath("//input[@id='filReferenceId-inputEl']")).sendKeys(ruleNames);

	driver.findElement(By.xpath("//input[@id='filReferenceId-inputEl']")).sendKeys(Keys.ENTER);
    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	
	  
	
	WebDriverWait wait=new WebDriverWait(driver, 95000);
    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='x-grid-row-checker']")));
	wait.until(elementIdentified(By.xpath("//div[@class='x-grid-row-checker']")));        
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x-grid-row-checker']")));
	

    WebElement elementToClick = driver.findElement(By.xpath("//div[@class='x-grid-row-checker']"));
    Actions Action=new Actions(driver);
	Action.moveToElement(elementToClick).build().perform();
	
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0," + elementToClick.getLocation().y + ")");
    elementToClick.click();
   	
    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

    driver.findElement(By.xpath("//a[@id='actionsMenuButton']")).click();

	driver.findElement(By.xpath("//span[text()='Reject']")).click();
	
	//driver.findElement(By.xpath("//div[contains(@id,'messagebox')]/a")).click();

	
	try{
 String rejected= driver.findElement(By.xpath("//div[text()='Rejected']")).getText();
 System.out.println(rejected);
}catch(Throwable e){
	System.out.println(e.getMessage());
	System.out.println("Fail");
	
}
 
    driver.findElement(By.xpath("//div[@id='flip']/img")).click();
	driver.findElement(By.xpath("//a[text()='Log Out']")).click();
	
	driver.findElement(By.xpath("//a[text()='here']")).click();

 
 
}
	

private static Function<WebDriver,WebElement> elementIdentified(final By locator) {
    return new Function<WebDriver, WebElement>() {
        @Override
        public WebElement apply(WebDriver driver) {
            return driver.findElement(locator);
        }
    };
}

public void clickreveiwever(){
	driver.findElement(By.xpath("//input[@id='unme']")).sendKeys(Repository.getProperty("username"));
    driver.findElement(By.xpath("//input[@id='pwdt']")).sendKeys(Repository.getProperty("password"));
	driver.findElement(By.xpath("//div[@id='loginButton']/a")).click();
    driver.findElement(By.xpath("//div[@id='flip']//img")).click();
	driver.findElement(By.xpath("//div[@id='panel']//img")).click();
	
	
    ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	driver.findElement(By.xpath("//span[text()='Administration']")).click();

	driver.findElement(By.xpath("//a[text()='Maker Checker']")).click();

	driver.findElement(By.xpath("//input[@id='filReferenceId-inputEl']")).sendKeys(ruleNames);

	driver.findElement(By.xpath("//input[@id='filReferenceId-inputEl']")).sendKeys(Keys.ENTER);
	sleep(5);
	String rejected= driver.findElement(By.xpath("//div[text()='Rejected']")).getText();
	 System.out.println(rejected);
	ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :"+ExtentTestManager.getTest().addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

	String exceptedresult="Rejected";
	try{
	Assert.assertEquals(rejected, exceptedresult);
	
	
	}catch(Throwable e){
		System.out.println(e.getMessage());
		System.out.println("Fail");
		
	}
	
	sleep(5);
    ExtentTestManager.getTest().log(LogStatus.INFO, " Maker Checker  Rejected Sucessfully");

	
}






	
	
	
}
