package org.seleniumhq.selenium.teasite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class teamenu {
	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong")
	private WebElement greentea;
	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914921\"]/div/h1")
	private WebElement menuheader;
	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000453231072\"]/div/p/span/span/strong")
	private WebElement redtea;
	
	@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")
	private WebElement gtcheckout;
	
	@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451959280\"]/span")
	private WebElement rtcheckout;
	
	@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451961556\"]/span")
	private WebElement otcheckout;
	
	public void clickgtco() {
		gtcheckout.click();
	}
	
	public void clickrtco() {
		rtcheckout.click();
	}
	
	public void clickotco() {
		otcheckout.click();
	}
	
	public String greentext() {
		return greentea.getText();
	}
	
	public String redtext() {
		return redtea.getText();
	}
	
	public String mhtext() {
		return menuheader.getText();
	}

}
