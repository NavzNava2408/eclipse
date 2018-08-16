package org.seleniumhq.selenium.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQASelectable {
	
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
	public void mthodTest() {
		driver.get(url);
		
		//searchbar.sendKeys("fainting goats");
		//searchbar.sendKeys(Keys.ENTER);
		WebElement ulink = driver.findElement(By.xpath("//*[@id=\"menu-item-142\"]/a"));
		ulink.click();
		Actions action = new Actions(driver);
		//action.dragAndDrop(driver.findElement(By.xpath("//*[@id=\"draggableview\"]/p")), driver.findElement(By.xpath("//*[@id=\"droppableview\"]"))).perform();
		//WebElement insuname = driver.findElement(By.name("username"));
		//insuname.sendKeys("qauser");
		//driver.findElement(By.name("password")).sendKeys("password");
		//driver.findElement(By.name("FormsButton2")).click();
		//assertEquals("Dropped!",driver.findElement(By.xpath("//*[@id=\"droppableview\"]/p")).getText());
		
	}


}
