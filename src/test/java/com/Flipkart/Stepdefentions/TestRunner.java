package com.Flipkart.Stepdefentions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith (Cucumber.class)
	@CucumberOptions(   features = " src\\test\\resources\\Features\\Mobi.feature",
	                       glue  = "com.Flipkart.Stepdefentions",
	                       monochrome= true
	                    
	
			
			
			)
	public class TestRunner {
}
