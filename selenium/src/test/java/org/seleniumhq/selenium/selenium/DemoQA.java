package org.seleniumhq.selenium.selenium;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class DemoQA {
	ChromeDriver driver;
	String url = "http://demoqa.com/";
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		try {
		Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@Test
	@Ignore
	public void mthodTest() {
		driver.get(url);
		DemoHome dh = PageFactory.initElements(driver, DemoHome.class);
		
		//searchbar.sendKeys("fainting goats");
		//searchbar.sendKeys(Keys.ENTER);
		//WebElement ulink = driver.findElement(By.xpath("//*[@id=\"menu-item-141\"]/a"));
		dh.clickdrop();
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggableview\"]/p")), driver.findElement(By.xpath("//*[@id=\"droppableview\"]"))).perform();
		//WebElement insuname = driver.findElement(By.name("username"));
		//insuname.sendKeys("qauser");
		//driver.findElement(By.name("password")).sendKeys("password");
		//driver.findElement(By.name("FormsButton2")).click();
		assertEquals("Dropped!",driver.findElement(By.xpath("//*[@id=\"droppableview\"]/p")).getText());
		
	}
	
	@Test
	public void ddtreg() {
		driver.get(url);
		DemoHome dh = PageFactory.initElements(driver, DemoHome.class);
		dh.clickregister();
		ExcelStuff ES = PageFactory.initElements(driver, ExcelStuff.class);
	
		ExcelStuff.setExcelFile("C:\\Users\\Admin\\Desktop\\DDTReg.xlsx", 0);
		ExcelStuff.getExcelWSheet();
		
		for (int i=1; i < ExcelStuff.getExcelWSheet().getPhysicalNumberOfRows(); i++) {
			for (int j=0; j < ExcelStuff.getExcelWSheet().getRow(i).getPhysicalNumberOfCells();j++) {
				String[] place = {"name_3_firstname" , "name_3_lastname", "phone_9" , "username" , "email_1" , "profile_pic_10", "description", "password_2" , "confirm_password_password_2"};
				driver.findElement(By.id(place[j])).sendKeys(ExcelStuff.getCellData(i, j));
			}
			System.out.println(i);
		}
		driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input")).click();
		
	}


}
