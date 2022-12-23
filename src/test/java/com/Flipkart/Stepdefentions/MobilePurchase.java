package com.Flipkart.Stepdefentions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.Flipkart.Object.MobilePage;
import com.Flipkart.Resources.CommonActions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MobilePurchase extends CommonActions {
	
	CommonActions c= new CommonActions();
	MobilePage mo = new MobilePage ();
	
	@Given("user login to flipkart")
	public void user_login_to_flipkart() {
		
		try {
		mo.getLoginclick().click();
		
		}catch (Exception e ){
			System.out.println("not req");
		}
	}
	String name;
	@When("user search for mobile")
	public void user_search_for_mobile()  {
		
		  name ="vivo mobiles";
		  
		  mo.getMobilesearch().sendKeys(name,Keys.ENTER);
		
		 
	}

	@When("user click on mobile")
	public void user_click_on_mobile() {
		mo.getMobileclick().click();
	   
	}

	@When("user click buy now")
	public void user_click_buy_now() {
		c.windowsh();
		mo.getClickbuynow().click();

	}

	@Then("user proceed payment")
	public void user_proceed_payment() {


	}



}
