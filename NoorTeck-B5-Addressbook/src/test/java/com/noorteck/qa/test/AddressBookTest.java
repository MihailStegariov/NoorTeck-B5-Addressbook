package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://a.testaddressbook.com/sign_up";

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		addressBookTestOne();
		addressBookTestTwo();
		CommonUI.quitBrowser();
//		url = "http://a.testaddressbook.com/sign_in"; 
//		CommonUI.openBrowser("chrome");
//		CommonUI.navigate(url);
//		initializeClassObj();
//		addressBookTestTwo();
//		CommonUI.quitBrowser();

	}

	public static void addressBookTestOne() {

		
		signUpObj.enterEmail("john_cena1998@gmail.com");
		signUpObj.enterPassword("John12345678");
		signUpObj.clickSignUp();

//TODO verify if the message is displayed
	}

	public static void addressBookTestTwo() {

		signInObj.enterEmail("john_cena1998@gmail.com");
		signInObj.enterPassword("12345678");
		signInObj.clickSignIn();
		homeObj.clickAddresses();
		addressesObj.enterfirstName("John");
		addressesObj.enterLastName("Cena");
		addressesObj.enterAddressOne("1234 New Ridge Rd");
		addressesObj.enterCityField("Silver Spring");
		addressesObj.chooseFromStateDropDown("value", "MD");
		addressesObj.clickCountryRadio();
		addressesObj.enterAge("22");
		addressesObj.enterPhone("123-2334-3434");
		addressesObj.clickDancing();
		addressesObj.enterNote("Automation is Fun");
		addressesObj.clickCreateAddress();
		addressesObj.clickOnListButton();

	}
}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 * 
 * 
 */
