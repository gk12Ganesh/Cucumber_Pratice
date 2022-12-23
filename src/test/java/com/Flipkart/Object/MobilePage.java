package com.Flipkart.Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Flipkart.Resources.CommonActions;

public class MobilePage extends CommonActions {

	public MobilePage (){
	
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(),'✕')]")
	private WebElement loginclick;
	
	@FindBy(xpath = "//input[@name='q']")
    private WebElement mobilesearch;
	
	@FindBy(xpath = "//div[@class='_4rR01T']")
	 private WebElement mobileclick;
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement clickbuynow;

	public WebElement getClickbuynow() {
		return clickbuynow;
	}

	public WebElement getMobileclick() {
		return mobileclick;
	}

	public WebElement getLoginclick() {
		return loginclick;
	
	}

	public WebElement getMobilesearch() {
		return mobilesearch;
	}

}
