package org.seleniumhq.selenium.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DemoHome {
	
	@FindBy(xpath = "//*[@id=\"menu-item-141\"]/a")
	private WebElement drop;
	
	@FindBy(xpath = "//*[@id=\"menu-item-142\"]/a")
	private static WebElement select;
	
	@FindBy(xpath = "//*[@id=\"menu-item-140\"]/a")
	private static WebElement drag;
	
	@FindBy(xpath = "//*[@id=\"menu-item-374\"]/a")
	private WebElement register;
	
	public void clickregister() {
		register.click();
	}
	
	public void clickdrop() {
		drop.click();
	}
	
	public void clickselect() {
		select.click();
	}
	
	public void clickdrag() {
		drag.click();
	}

}
