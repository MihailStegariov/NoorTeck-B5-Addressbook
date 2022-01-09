package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//a[@class = 'nav-item nav-link active']")
	WebElement homeButton;

	@FindBy(xpath = "//*[text()='Addresses']")
	WebElement addressesButton;

	@FindBy(xpath = "//*[text()='Sign out']")
	WebElement signOutButton;

	@FindBy(xpath = "//h1[text() = 'Welcome to Address Book']")
	WebElement addressBookTitle;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickHome() {
		click(homeButton);
	}

	public void clickAddresses() {
		click(addressesButton);
	}

	public void clickSignOut() {
		click(signOutButton);
	}

	public String welcomeText() {
		return getText(addressBookTitle);
	}
}