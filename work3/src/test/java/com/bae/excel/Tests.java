package com.bae.excel;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Constant.constant;

public class Tests {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public static void teardown() {
		driver.quit();
	}

	@Test
	public void Test4() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk/");

		FileInputStream file = null;
		try {
			file = new FileInputStream(constant.Path_TestData + constant.File_TestData);
		}

		catch (FileNotFoundException e) {
		}

		XSSFWorkbook workbook = null;

		try {
			workbook = new XSSFWorkbook(file);
		} catch (IOException e) {
		}

		for (int i = 1; i < 5; i++) {
			XSSFSheet sheet = workbook.getSheetAt(0);
			String username = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();
			WebElement addUser = driver.findElement(By
					.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]"));
			addUser.click();
			WebElement enterUserName = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
			enterUserName.click();
			enterUserName.sendKeys(username);
			WebElement enterPassword = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
			enterPassword.sendKeys(password);
			enterPassword.submit();
			WebElement login = driver.findElement(By
					.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]"));
			login.click();
			WebElement EUN = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
			EUN.click();
			EUN.sendKeys(username);
			WebElement EP = driver.findElement(By.xpath(
					"/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
			EP.sendKeys(password);
			EP.submit();

			WebElement checkLogin = driver
					.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
			XSSFCell cell2 = sheet.getRow(i).createCell(2);

			cell2.setCellValue(checkLogin.getText().replaceAll("\\*", ""));

		}
		try {
			FileOutputStream out = new FileOutputStream(new File(constant.Path_TestData + constant.File_TestData));
			workbook.write(out);
			out.close();
			System.out.println("File saved without issue");
		} catch (IOException e) {

		}

	}
}
