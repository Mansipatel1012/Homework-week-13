package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By firstNameField = By.xpath("//input[@id='FirstName']");
    By lastNameField = By.xpath("//input[@id='LastName']");
    By dayDropDown = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
    By monthDropDown = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
    By yearDropDown = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
    By emailField = By.xpath("//input[@id='Email']");
    By passwordField = By.xpath("//input[@id='Password']");
    By confirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    By register = By.xpath("//button[@id='register-button']");
    By continue1 = By.xpath("//a[contains(text(),'Continue')]");

    public void fillingTheDetails(String firstName,String lastName, String day, String month, String year, String email,String password, String confirmPassword){
        sendTextToElement(firstNameField,firstName);
        sendTextToElement(lastNameField,lastName);
        selectByVisibleTextFromDropDown(dayDropDown,day);
        selectByVisibleTextFromDropDown(monthDropDown,month);
        selectByVisibleTextFromDropDown(yearDropDown,year);
        sendTextToElement(emailField,email);
        sendTextToElement(passwordField,password);
        sendTextToElement(confirmPasswordField,confirmPassword);
    }
    public void clickOnRegister(){
        clickOnElement(register);
    }
    public void clickOnContinue1(){
        clickOnElement(continue1);
    }
}


