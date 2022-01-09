package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI{

	@FindBy(xpath = "//a[text() = 'New Address")
	WebElement newAddressButton;
	
	@FindBy(css = "input[id = 'address_first_name']")
	WebElement firstNameField;
	
	@FindBy(css = "input[id = 'address_last_name']")
	WebElement lastNameField;
	
	@FindBy(css = "input[id = 'address_street_address']")
	WebElement addressOneField;
	
	@FindBy(css = "input[id = 'address_secondary_address']")
	WebElement addressTwoField;
	
	@FindBy(css = "input[id = 'address_city']")
	WebElement cityField;
	
	@FindBy(css = "select[id = 'address_state']")
	WebElement stateDropDown;
	
	@FindBy(css = "input[id = 'address_zip_code']")
	WebElement zipCodeField;
	
	@FindBy(xpath = "//*[@value = 'us']")
	WebElement countryUnitedStatesRadio;
	
	@FindBy(css = "input[id = 'address_age']")
	WebElement ageField;
	
	@FindBy(css = "input[id = 'address_website']")
	WebElement websiteField;
	
	@FindBy(css = "input[id = 'address_phone']")
	WebElement phoneField;
	
	@FindBy(css = "input[id = 'address_interest_dance']")
	WebElement commonInterestsDancingCheckBox;
	
	@FindBy(css = "textarea[id = 'address_note']")
	WebElement noteField;
	
	@FindBy(css = "input[class = 'btn btn-primary']")
	WebElement createAddressButton;
	
	@FindBy(css = "//a[@data-test = 'list']")
	WebElement clickListButton;
	
	@FindBy(xpath = "//td[text() = 'John']")
	WebElement firstNameData;
	
	public AddressesPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickNewAddress() {
		click(newAddressButton);
	}
	
	public void enterfirstName(String firstName) {
		enter(firstNameField, firstName);
	}
	
	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
	
	}
	
	public void enterAddressOne(String addressOne) {
		enter(addressOneField, addressOne);
		
	}
	
	public void enterAddressTwo(String addressTwo) {
		enter(addressTwoField, addressTwo);
	
	}
	
	public void enterCityField(String city) {
		enter(cityField, city);
		
	}
	
	
	public void chooseFromStateDropDown(String methodName, String indexTextValue) {
		selectFromDropdown(stateDropDown, methodName, indexTextValue);
	}
	
	public void enterZipCode(String zipCode) {
		enter(zipCodeField, zipCode);
		
	}
	
	public void clickCountryRadio() {
		click(countryUnitedStatesRadio);
		
	}
	
	public void enterAge(String age) {
		enter(ageField, age);
		
	}
	
	public void enterWebsite(String website) {
		enter(websiteField, website);
		
	}
	
	public void enterPhone(String phone) {
		enter(phoneField, phone);
		
	}
	
	public void clickDancing() {
		click(commonInterestsDancingCheckBox);
		
	}
	
	public void enterNote(String note) {
		enter(noteField, note);
		
	}
	
	public void clickCreateAddress() {
		click(createAddressButton);
	
	}
	
	public void clickOnListButton() {
		click(clickListButton);
	}
	public String enterFirstName() {
		return getText(firstNameData);
	}
}
