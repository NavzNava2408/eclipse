package org.seleniumhq.selenium.teasite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class teahome {
	
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a")
	private WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[1]/a")
	private WebElement welcome;
	
	public void clickmenu() {
		menu.click();
	}
	
	public void clickcheckout() {
		checkout.click();
	}
	
	public void clickwelcome() {
		welcome.click();
	}

}
