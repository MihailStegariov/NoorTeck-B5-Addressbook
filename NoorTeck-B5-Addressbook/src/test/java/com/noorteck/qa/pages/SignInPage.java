package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI{

	@FindBy(id = "session_email")
	WebElement emailField;

	@FindBy(id = "session_password")
	WebElement passwordField;

	@FindBy(css = ".btn.btn-primary")
	WebElement signInButton;
	
	@FindBy(xpath = "//*[@id=\"navbar\"]/div[1]/a[2]")
	WebElement addressesButton;

	public SignInPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String email) {
		enter(emailField, email);
	}

	public void enterPassword(String userPassword) {
		enter(passwordField, userPassword);
	}

	public void clickSignIn() {
		click(signInButton);
		
	}
	
		public void clickAddresses() {
			click(addressesButton);
		
	}
}