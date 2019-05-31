package theDemoSiteTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DMTests {
	public static WebDriver driver;
	

	@BeforeClass
	public static void setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void teardown() throws InterruptedException {
		driver.quit();
		Thread.sleep(2000);
	}
	
	@Test
	public void userName() {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/");	
        WebElement adduser= driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
        adduser.click();
        WebElement enterusername= driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]\"));
        enterusername.sendKeys("user 2");
        WebElement enterpassword= driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
        enterpassword.sendKeys("password");
        WebElement savedetails= driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
        savedetails.click();
        
	}
	
	
	

}
