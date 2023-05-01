package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class WelcomeSignInPage extends Utility {
    By welcomeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By checkoutGuest = By.xpath("//button[normalize-space()='Checkout as Guest']");
    By register = By.xpath("//button[contains(text(),'Register')]");


    //2.20 Verify the Text “Welcome, Please Sign In!”
    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
    //2.21 Click on “CHECKOUT AS GUEST” Tab
    public void setCheckoutGuest() {
        clickOnElement(checkoutGuest);

    }
    public void clickOnRegisterButton(){
        clickOnElement(register);
    }
}

