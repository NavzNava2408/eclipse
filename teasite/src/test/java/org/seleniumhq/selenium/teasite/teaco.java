package org.seleniumhq.selenium.teasite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class teaco {
	
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000451989411\"]/div/p/span/strong")
	private WebElement coheader;
	
	public String cohtext() {
		return coheader.getText();
	}

}
