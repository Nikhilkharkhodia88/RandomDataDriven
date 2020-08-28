package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BaseTest;

public class RegisterPage extends BaseTest {

	public WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//input[@name='firstName']")
	WebElement firstname;

	private @FindBy(xpath = "//input[@name='lastName']")
	WebElement lastname;

	private @FindBy(xpath = "//input[@name='phone']")
	WebElement phone;

	private @FindBy(xpath = "//input[@id='userName']")
	WebElement email;

	private @FindBy(xpath = "//input[@name='address1']")
	WebElement address;

	private @FindBy(xpath = "//input[@name='city']")
	WebElement city;

	private @FindBy(xpath = "//input[@name='state']")
	WebElement state;

	private @FindBy(xpath = "//input[@name='postalCode']")
	WebElement postalcode;

	private @FindBy(xpath = "//select[@name='country']")
	WebElement country;

	private @FindBy(xpath = "//input[@id='email']")
	WebElement userName;

	private @FindBy(xpath = "//input[@name='password']")
	WebElement userPassword;

	private @FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement confirmPassword;

	private @FindBy(xpath = "//input[@name='submit']") 
	WebElement submit;

	public WebElement clickonfirstName() {
		return firstname;
	}

	public WebElement clickonLastName() {
		return lastname;
	}
	public WebElement enterphonenumber() {
		return phone;
	}
	public WebElement enteremail() {
		return email;
	}
	public WebElement enteraddress() {
		return address;
	}
	public WebElement entercity() {
		return city;
	}
	public WebElement enterpostalcode() {
		return postalcode;
	}
	public WebElement enterstate() {
		return state;
	}
}
