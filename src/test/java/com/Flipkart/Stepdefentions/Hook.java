package com.Flipkart.Stepdefentions;

import com.Flipkart.Resources.CommonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends CommonActions {
	
	CommonActions c = new CommonActions ();
	
	@Before
	
	public void beforescen (){
		c.URL("https://www.flipkart.com/");
	
		
	}
	@After
	
	public void afterscen (){
		
		//driver.quit();

}
}