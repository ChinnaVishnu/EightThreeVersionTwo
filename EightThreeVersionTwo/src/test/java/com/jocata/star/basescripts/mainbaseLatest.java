package com.jocata.star.basescripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class mainbaseLatest extends Utills {

	// public static FirefoxProfile firefoxProfile;

	// public ScreenRecorder screenRecorder;
	public static ExtentReports extent;

	// public static ExtentTest test;
	public static Properties Repository = new Properties();
	public File f;
	public FileInputStream FI;

	public mainbaseLatest() {

		// reports=new
		// ExtentReports(System.getProperty("user.dir")+"\\test-output\\RamScreenshot.html");
		// reports=ExtentManager.Instance();

	}

	@BeforeSuite
	public void fristlogin() throws InterruptedException, IOException {
		/*
		 * firefoxProfile = new FirefoxProfile();
		 * firefoxProfile.setAcceptUntrustedCertificates(true);
		 * firefoxProfile.setPreference("app.update.enabled", false);
		 * firefoxProfile.setPreference("browser.download.folderList",2);
		 * firefoxProfile.setPreference(
		 * "browser.download.manager.showWhenStarting",false);
		 * firefoxProfile.setPreference("browser.download.dir",
		 * getDownloadLocation());
		 * firefoxProfile.setPreference("browser.helperApps.neverAsk.openFile",
		 * "application/pdf, application/x-pdf, application/acrobat, applications/vnd.pdf, text/pdf, text/x-pdf, application/octet-stream, application/vnd.openxmlformats-officedocument.wordprocessingml.document, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/x-rar-compressed, application/zip"
		 * ); firefoxProfile.setPreference(
		 * "browser.helperApps.neverAsk.saveToDisk",
		 * "application/pdf, application/x-pdf, application/acrobat, applications/vnd.pdf, text/pdf, text/x-pdf, application/octet-stream, application/vnd.openxmlformats-officedocument.wordprocessingml.document, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/x-rar-compressed, application/zip"
		 * ); firefoxProfile.setPreference("browser.helperApps.alwaysAsk.force",
		 * false); firefoxProfile.setPreference(
		 * "browser.download.manager.showAlertOnComplete",false);
		 */

		/*
		 * String dateTimeString = new SimpleDateFormat("MMddhhmmss")
		 * .format(new Date());
		 * 
		 * String path = System.getProperty("user.dir"); extent=new
		 * ExtentReports(path+"/Reports/Automation_Report "+ dateTimeString +
		 * " .html",false, DisplayOrder.NEWEST_FIRST);
		 */

		loadPropertiesFile();
		selectBrowser(Repository.getProperty("browser"));
		impliciteWait(30);
		driver.get(Repository.getProperty("url"));
		impliciteWait(30);

		WebElement element = driver.findElement(By.xpath(".//*[@id='unme']"));
		element.sendKeys(Repository.getProperty("username"));
		mainbaseLatest.highLightElement(driver, element);

		WebElement elementse = driver.findElement(By.xpath(".//*[@id='pwdt']"));
		elementse.sendKeys(Repository.getProperty("password"));

		/*
		 * mainbaseLatest.highLightElement(driver, elementse);
		 * driver.findElement(By.xpath(".//*[@id='LoginButton']")).click();
		 */

		// Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='loginButtonExt']")).click();

		Thread.sleep(6000);
		// Thread.sleep(6000);

		driver.findElement(By.xpath(".//*[@id='flip']/div/img")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='panel']/fieldset/div[1]/a[1]/img")).click();

		Thread.sleep(2000);

		/*
		 * String dateTimeString = new SimpleDateFormat("MMddhhmmss")
		 * .format(new Date());
		 * 
		 * String path = System.getProperty("user.dir");
		 * 
		 * 
		 * extent = new ExtentReports(path+"/Reports/Automation_Report "+
		 * dateTimeString +" .html",false, DisplayOrder.NEWEST_FIRST);
		 * 
		 * 
		 * 
		 */

		// reports=ExtentManager.Instance();
	}

	@BeforeClass
	public void setUp() throws Exception {

	}

	/*
	 * 
	 * 
	 * @BeforeClass public void setUp() throws Exception {
	 * 
	 * 
	 * 
	 * 
	 * extent=new ExtentReports(System.getProperty("user.dir")+
	 * "\\test-output\\ExtentScreenshot.html");
	 * 
	 * 
	 * GraphicsConfiguration gc = GraphicsEnvironment
	 * .getLocalGraphicsEnvironment().getDefaultScreenDevice()
	 * .getDefaultConfiguration(); // Create a instance of ScreenRecorder with
	 * the required configurations screenRecorder = new ScreenRecorder(gc, new
	 * Format(MediaTypeKey,MediaType.FILE, MimeTypeKey, MIME_QUICKTIME), new
	 * Format(MediaTypeKey, MediaType.VIDEO,
	 * EncodingKey,ENCODING_QUICKTIME_JPEG, CompressorNameKey,
	 * ENCODING_QUICKTIME_JPEG, DepthKey, (int) 24,FrameRateKey,
	 * Rational.valueOf(15), QualityKey, 1.0f, //KeyFrameIntervalKey, (int) (15
	 * * 60)), new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",
	 * FrameRateKey,Rational.valueOf(30)), null); // Create a new instance of
	 * the Firefox driver //driver = new FirefoxDriver(); // Call the start
	 * method of ScreenRecorder to begin recording //screenRecorder.start(); }
	 */

	public WebElement findElement(By by) {
		WebElement elem = driver.findElement(by);
		// draw a border around the found element
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		}
		return elem;
	}

	public void loadPropertiesFile() throws IOException {

		// f=new File("D:\\AdvancedSTAR\\config.properties");
		f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");

		FI = new FileInputStream(f);
		Repository.load(FI);
	}

	public static void highLightElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

			System.out.println(e.getMessage());
		}

		js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", element);

	}

	/*
	 * public static String[][] getTableArray(String xlFilePath, String
	 * sheetName, String tableName,String startname) throws Exception{
	 * String[][] tabArray=null;
	 * 
	 * Workbook workbook = Workbook.getWorkbook(new File(xlFilePath)); Sheet
	 * sheet = workbook.getSheet(sheetName); int startRow,startCol, endRow,
	 * endCol,ci,cj; Cell tableStart=sheet.findCell(tableName);
	 * startRow=tableStart.getRow(); startCol=tableStart.getColumn();
	 * 
	 * Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100,
	 * 64000, false);
	 * 
	 * endRow=tableEnd.getRow(); endCol=tableEnd.getColumn();
	 * System.out.println("startRow="+startRow+", endRow="+endRow+", " +
	 * "startCol="+startCol+", endCol="+endCol); tabArray=new
	 * String[endRow-startRow-1][endCol-startCol-1]; ci=0;
	 * 
	 * for (int i=startRow+1;i<endRow;i++,ci++){ cj=0; for (int
	 * j=startCol+1;j<endCol;j++,cj++){
	 * tabArray[ci][cj]=sheet.getCell(j,i).getContents(); } }
	 * 
	 * 
	 * return(tabArray); }
	 * 
	 */

	/*
	 * 
	 * @AfterMethod public void getResult(ITestResult result) throws
	 * IOException{
	 * 
	 * if (result.getStatus()==ITestResult.FAILURE) {
	 * 
	 * String screenshortpath=GetScreenshort.capture(driver,
	 * "ScreenshortForExtentReport");
	 * 
	 * 
	 * logger.log(LogStatus.FAIL, result.getThrowable());
	 * 
	 * logger.log(LogStatus.FAIL, "Screenshortbelow :"
	 * +test.addScreenCapture(screenshortpath));
	 * 
	 * } reports.endTest(logger);
	 * 
	 * }
	 * 
	 * @AfterTest
	 * 
	 * public void endReport() throws InterruptedException, IOException{
	 * 
	 * reports.flush(); reports.close(); driver.close();
	 * //screenRecorder.stop();
	 * 
	 * }
	 */

	/*
	 * 
	 * @AfterMethod public void getResult(ITestResult result) throws
	 * IOException{
	 * 
	 * if (result.getStatus()==ITestResult.FAILURE) {
	 * 
	 * String screenshortpath=GetScreenshort.capture(driver,
	 * "ScreenshortForExtentReport");
	 * 
	 * 
	 * logger.log(LogStatus.FAIL, result.getThrowable());
	 * 
	 * logger.log(LogStatus.FAIL, "Screenshortbelow :"
	 * +logger.addScreenCapture(screenshortpath));
	 * 
	 * } reports.endTest(logger);
	 * 
	 * }
	 * 
	 * @AfterTest public void endReport() throws InterruptedException{
	 * 
	 * reports.flush(); reports.close(); driver.close();
	 * 
	 * }
	 */

	@AfterMethod
	public void getResult(ITestResult result, ITestContext testContext) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			// String screenshortpath=GetScreenshort.capture(driver,
			// "ScreenshortForExtentReport");
			ExtentTestManager.getTest().log(LogStatus.INFO, "Screenshortbelow :" + ExtentTestManager.getTest()
					.addScreenCapture(GetScreenshort.capture(driver, "ScreenshortForExtentReport")));

			ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());

		}
		ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
		ExtentManager.getReporter().flush();

	}

	// @AfterMethod
	protected void afterMethod(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenshortpath = GetScreenshort.capture(driver, "ScreenshortForExtentReport");
			ExtentTestManager.getTest().log(LogStatus.FAIL, result.getThrowable());

		} else if (result.getStatus() == ITestResult.SKIP) {
			ExtentTestManager.getTest().log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
		} else {
			// ExtentTestManager.getTest().log(LogStatus.PASS, "test pass");
		}

		ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
		ExtentManager.getReporter().flush();

	}

	protected String getStackTrace(Throwable t) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);
		return sw.toString();
	}

	@AfterTest
	public void endReport() {

		// driver.close();

	}

}
