package com.bae.webDriver.test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.Test;

public class usingWebDriverTest {
	private static final String True = null;
	private static final CharSequence key = null;
	public static WebDriver driver;
	
	
	@BeforeClass
	public static void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	}
	
	@AfterClass
	public static void teardown() {
		driver.quit();
	}
	
	@Ignore
	@Test
	public void Test(){
	driver.manage().window().maximize();
	driver.get("https://www.google.co.uk/");
}
	@Ignore
	@Test
	public void Test2() throws InterruptedException {
	driver.manage().window().maximize();
	driver.get("https://www.google.co.uk/");
	WebElement WE = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
    WE.sendKeys("Whatever");
    WebElement WE1 = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/div/center/input[1]"));
    WE1.click();
    WebElement WE2 = driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a"));
    WE2.click();
    WebElement WE3 = driver.findElement(By.xpath("//*[@id=\"logo\"]/img"));
    
   if (WE3.isDisplayed()) {
	   System.out.println("Google's logo can be found on this page");
   }
    }
   
	@Ignore
	@Test
	public void Test3() throws InterruptedException{
	Actions action = new Actions(driver);
	driver.manage().window().maximize();
	driver.get("https://www.youidraw.com/apps/painter/?_ga=2.190952554.1173224123.1559129610-2088403867.1559129610");
	WebElement paintbrush = driver.findElement(By.xpath("//*[@id=\"brush\"]"));
	paintbrush.click();
	WebElement canvasSize = driver.findElement(By.xpath("//*[@id=\"catch\"]"));
	action.moveToElement(canvasSize).moveByOffset(-450,-250).clickAndHold().moveByOffset(0,300).moveByOffset(0, -150).clickAndHold().moveByOffset(50, 150).moveByOffset(-50,-150).clickAndHold().moveByOffset(50, -150).release().perform();
	action.moveToElement(canvasSize).moveByOffset(-350, -250).clickAndHold().moveByOffset(0,300).moveByOffset(0, -300).clickAndHold().moveByOffset(50, 0).moveByOffset(0,125).moveByOffset(-50,0).moveByOffset(50,175).release().perform();
    action.moveToElement(canvasSize).moveByOffset(-250, -250).clickAndHold().moveByOffset(0,150).moveByOffset(50, 0).moveByOffset(0, -150).moveByOffset(0, 300).release().perform();
    action.moveToElement(canvasSize).moveByOffset(-150, -250).clickAndHold().moveByOffset(50, 0).moveByOffset(-50, 0).moveByOffset(0, 150).moveByOffset(50, 0).moveByOffset(0,150).moveByOffset(-50, 0).release().perform();
    action.moveToElement(canvasSize).moveByOffset(-75,-250).clickAndHold().moveByOffset(100, 0).moveByOffset(-50, 0).moveByOffset(0, 300).release().perform();
    action.moveToElement(canvasSize).moveByOffset(50,-250).clickAndHold().moveByOffset(0, 300).moveByOffset(0, -300).moveByOffset(75, 0).moveByOffset(0, 300).moveByOffset(0, -150).moveByOffset(-75, 0).release().perform();
    action.moveToElement(canvasSize).moveByOffset(175, -250).clickAndHold().moveByOffset(0, 300).moveByOffset(100, 0).release().perform();
    action.moveToElement(canvasSize).moveByOffset(275, -250).clickAndHold().moveByOffset(50, 0).moveByOffset(50, 50).moveByOffset(50, -50).moveByOffset(50, 0).moveByOffset(0, 100).moveByOffset(-100, 100).moveByOffset(-100, -100).moveByOffset(0,-100).release().perform();
    Thread.sleep(5000);
	}
	
	@Ignore
	@Test
	public void Test4() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/");
		WebElement addUser= driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
		addUser.click();
		WebElement enterUserName= driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		enterUserName.click();
		enterUserName.sendKeys("User 1");
		WebElement enterPassword= driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		enterPassword.click();
		enterPassword.sendKeys("Password");
		enterPassword.submit();
		WebElement login = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
		login.click();
		WebElement EUN = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		EUN.click();
		EUN.sendKeys("User 1");
		WebElement EP = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		EP.click();
		EP.sendKeys("Password");
		EP.submit();
		Thread.sleep(5000);
	}
	
	@Ignore
	@Test
	public void Test5() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement searchDress = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
		searchDress.click();
		searchDress.sendKeys("Dresses");
		searchDress.submit();
		WebElement newDress = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img"));
		Boolean b = newDress.isDisplayed();
		if (b) {
			System.out.println("This is contained");
			assertTrue(b);
		} else {
			System.out.println("This is not contained");
			fail();
		}
		newDress.click();
		Thread.sleep(5000);
	}
	

	@Test
	public void Test6() throws InterruptedException{
		Actions action =new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://www.phptravels.net/");
    	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);System.out.println(scr.getAbsolutePath());
		WebElement checkIn = driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input"));
		checkIn.click();
		WebElement checkin1=driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[5]/td[5]"));
		checkin1.click();
		WebElement checkout1=driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[6]/td[2]"));
		checkout1.click();
		WebElement bookingHotel = driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/a"));
		bookingHotel.click();
		action.sendKeys("London").perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ENTER).perform();
		bookingHotel.submit();
		WebElement hotel = driver.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[2]/td/div[3]/a/button"));
	    hotel.click();
	    action.sendKeys(Keys.SPACE).perform();
//	    WebElement selection = driver.findElement(By.xpath("//*[@id=\"ROOMS\"]/div/table/tbody/tr[1]/td/div[2]/div[2]/div/div[3]/div/label"));
//	    selection.click();
	    action.sendKeys(Keys.SPACE).perform();
		
		
		Thread.sleep(5000);
	}
	
	@Ignore
	@Test
	public void Test7() throws InterruptedException{
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/");
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		WE.click();
		WE.sendKeys("cute puppies");
		WE.submit();
		driver.navigate().refresh();
		driver.navigate().back();
		
		Thread.sleep(5000);
		
	}
	
	@Ignore
	@Test
	public void Test8() throws InterruptedException{
		Actions action= new Actions(driver); 
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		WebElement WE = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		WE.click();
		WebElement WE1 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		WE1.click();
		WE1.sendKeys("Krystal");
		action.sendKeys(Keys.TAB,"Ryan",Keys.TAB,Keys.TAB,"krystalryan95@hotmail.co.uk",Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"User 1",Keys.TAB,"Password",Keys.TAB,"Password").perform();
		WebElement WE2 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input"));
		WE2.click();
		WebElement WE3 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
		WE3.click();
		WebElement WE4 =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input"));
		WE4.click();
		WE4.sendKeys("User 1");
		WebElement WE5 =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input"));
		WE5.click();
		WE5.sendKeys("Password");
		WebElement WE6 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
		WE6.click();
		Thread.sleep(15000);
		
	}
	
}
	
	
	


