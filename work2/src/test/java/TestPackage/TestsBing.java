package TestPackage;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestsBing{
	
	public static WebDriver driver;
	
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();	
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Given("^I go to \"([^\"]*)\" website$")
	public void i_go_to_website(String arg1){
		driver.manage().window().maximize();
	    driver.get(arg1);
	    
	}

	@When("^I search for \"([^\"]*)\"$")
	public void i_search_for(String arg1) throws InterruptedException{
		WebElement WE = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
		WE.click();
		WE.sendKeys(arg1);
		WE.submit();
		Thread.sleep(2000);

	 
	}
	
	@Then("^I am taken to a list of data for that search$")
	public void i_am_taken_to_a_list_of_data_for_that_search(){
	WebElement WE = driver.findElement(By.xpath("//*[@id=\"sb_form\"]/div"));
	Boolean b = WE.isDisplayed();
	if (b==true) {
		System.out.println("This is contained");
		assertTrue(b);
	}
	else {
		System.out.println("This is not contained");
		fail();
	}
	
	
	
	   
	}

}
