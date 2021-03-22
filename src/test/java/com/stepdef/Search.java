package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.common.Base;
import com.test.page.MyPageHome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search extends Base {
	
	MyPageHome mh;
	
	
	@Given("^I am on the home page$")
	public void i_am_on_the_home_page() throws Throwable {
		
	     driver = getdriver();
	    
	   
	}

	@When("^I enter text on search box$")
	public void i_enter_text_on_search_box() throws Throwable {
		
		mh = new MyPageHome(driver);
		mh.get_text().sendKeys("mens shoes");
		
	    
	   
	}

	@When("^I click on the search button$")
	public void i_click_on_the_search_button() throws Throwable {
		
		mh.get_button().click();
	    
	   
	}

	@When("^I click on the mens shoes nike$")
	public void i_click_on_the_mens_shoes_nike() throws Throwable {
		
		mh.get_sh().click();
	    
	   
	}

	@When("^I click on the Nike Mens shoe black$")
	public void i_click_on_the_Nike_Mens_shoe_black() throws Throwable {
		
		mh.get_bl().click();
	    
	   
	}

	@When("^I click on the shoe$")
	public void i_click_on_the_shoe() throws Throwable {
		
		mh.get_shoe().click();
	    
	   
	}

	@When("^I click on the size fits$")
	public void i_click_on_the_size_fits() throws Throwable {
	    
		mh.get_sz().click();
	   
	}

	@Then("^I successfully get to order$")
	public void i_successfully_get_to_order() throws Throwable {
	    
	   
	}

}
