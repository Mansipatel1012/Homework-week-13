package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class ThankYouMessagePage extends Utility {

    By thankYouMessage = By.xpath("//h1[normalize-space()='Thank you']");
    By yourOrder = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButton = By.xpath("//button[normalize-space()='Continue']");

    public By thankYouMessageElement(){
        return thankYouMessage;
    }
    public By yourOrderMessageElement(){
        return yourOrder;
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);

    }
}
