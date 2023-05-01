package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {

    // Fill the required details
    By firstNameField = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastNameField = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");

    By countryField = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By stateField = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By cityField = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1Field = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By address2Field = By.xpath("//input[@id='BillingNewAddress_Address2']");
    By zipField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumberField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By faxNumberField = By.xpath("//input[@id='BillingNewAddress_FaxNumber']");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");

    // click on next day air
    By nextDayAir = By.xpath("//label[normalize-space()='Next Day Air ($0.00)']");
    By continueButton1 =By.xpath("//button[@class='button-1 shipping-method-next-step-button']");

    // Select credit card payment method
    By creditCardPaymentMethod = By.xpath("//label[normalize-space()='Credit Card']");
    By continueButton2 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");

    // Select card Type
    By creditCardType = By.xpath("//select[@id='CreditCardType']");

    // Fill card details
    By cardDetails = By.xpath("//input[@id='CardholderName']");
    By cardNumber = By.xpath("//input[@id='CardNumber']");
    By month = By.xpath("//select[@id='ExpireMonth']");
    By year = By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");

    // click on payment continue button
    By continueButton3 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");

    // click on confirm
    By confirm = By.xpath("//button[normalize-space()='Confirm']");
    By continueButton4 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");



    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName);
    }
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField,"prime@gmail.com");
    }

    public void selectFromDropdownCountry(String country){
        selectByVisibleTextFromDropDown(countryField,country);
    }

    public void enterCity(String city){
        sendTextToElement(cityField,"Harrow");
    }
    public void enterAddress1(String address1){
        sendTextToElement(address1Field,"100");
    }
    public void enterAddress2(String address2) {
        sendTextToElement(address2Field, "ABC LANE");
    }
    public void enterZip(String zip){
        sendTextToElement(zipField,"HA2 9SE");
    }
    public void enterPhoneNumber(String phoneNumber){
        sendTextToElement(phoneNumberField, "0754741442");
    }
    public void enterFaxNumber(String faxNumber){
        sendTextToElement(faxNumberField, "0192535448");
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
    public void clickOnNextDayAirButton(){
        clickOnElement(nextDayAir);
    }
    public  void clickOnContinueButton1(){
        clickOnElement(continueButton1);
    }
    public void clickOnCreditCardPaymentMethod(){
        clickOnElement(creditCardPaymentMethod);
    }
    public void clickOnContinueButton2(){
        clickOnElement(continueButton2);
    }
    public void selectCreditCardType(String creditCard){
        selectByVisibleTextFromDropDown(creditCardType,creditCard);
    }
    public void fillingCardDetails(String cardName, String number, String month1, String year1, String code) {

        sendTextToElement(cardDetails, cardName);
        sendTextToElement(cardNumber, number);
        selectByVisibleTextFromDropDown(month, month1);
        selectByVisibleTextFromDropDown(year, year1);
        sendTextToElement(cardCode, code);
    }
    public void fillingCardDetails1(String country,String city,String address1,String zip,String phoneNumber){
        selectByVisibleTextFromDropDown(countryField,country);
        sendTextToElement(cityField,city);
        sendTextToElement(address1Field,address1);
        sendTextToElement(zipField,zip);
        sendTextToElement(phoneNumberField,phoneNumber);
    }
    public void clickOnContinueButton3(){
        clickOnElement(continueButton3);
    }
    public void clickOnConfirm(){
        clickOnElement(confirm);
    }
    public void clickOnContinueButton4(){
        clickOnElement(continueButton4);
    }

}

