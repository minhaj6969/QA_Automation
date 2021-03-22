package com.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPageHome {
	
	public WebDriver driver;
	public MyPageHome (WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath = "//input[@id = 'searchInputId']")
	WebElement get_text;
	public WebElement get_text(){
		return get_text;
		
		
	}
	@FindBy(xpath = "//button[@class='ADYzK']")
	WebElement get_button;
	public WebElement get_button(){
		return get_button;
	}
	@FindBy(xpath = "//a[contains(text(),'mens shoes nike')]")
	WebElement get_sh;
	public WebElement get_sh(){
		return get_sh;
	}
	@FindBy(xpath = "//a[contains(text(),'nike mens shoes black')]")
	WebElement get_bl;
	public WebElement get_bl(){
		return get_bl;
	}
	@FindBy(xpath = "(//img[@class='_2kmmO _14a-3 _2BVC5'])[1]")
	WebElement get_shoe;
	public WebElement get_shoe(){
		return get_shoe;
	}
	@FindBy(xpath = "//span[contains(text(),'Which size fits me?')]")
	WebElement get_sz;
	public WebElement get_sz(){
		return get_sz;
	}
	

}
