package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {
    By processor = By.name("product_attribute_1");
    By ram = By.xpath("//select[@id='product_attribute_2']");
    By radioButtonHDD = By.xpath("//input[@id='product_attribute_3_7']");
    By radioButtonOS = By.cssSelector("#product_attribute_4_9");
    By microsoftOfficeCheckBox = By.cssSelector("#product_attribute_5_10");
    By totalCommanderCheckbox = By.cssSelector("label[for='product_attribute_5_12']");
    By price = By.xpath("//span[@id='price-value-1']");
    By addToCart = By.id("add-to-cart-button-1");
    By orderMessage = By.xpath("//p[@class='content']");
    By closeBar = By.cssSelector("span[title='Close']");
    By shoppingCart = By.xpath("//body/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");


    //2.5 Verify the Text "Build your own computer"
    public void selectByVisibleText() {
        selectByContainsTextFromDropDown(processor, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    public void setRam() {
        selectByContainsTextFromDropDown(ram, "8GB [+$60.00]");
    }

    // 2.7.Select "8GB [+$60.00]" using Select class.
    public void setRadioButtonHDD() {
        clickOnElement(radioButtonHDD);
    }

    // 2.8 Select HDD radio "400 GB [+$100.00]"
    public void setRadioButtonOS() {
        clickOnElement(radioButtonOS);
    }

    // 2.9 Select OS radio "Vista Premium [+$60.00]"
    public void setMicrosoftOfficeCheckBox() {
        clickOnElement(microsoftOfficeCheckBox);
    }

    // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
    //[+$5.00]"
    public void setTotalCommanderCheckbox() {
        clickOnElement(totalCommanderCheckbox);
    }

    // 2.11 Verify the price "$1,475.00"
    public void verifyThePrice() {
        clickOnElement(price);
    }

    // 2.12 Click on "ADD TO CARD" Button.
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    //2.13 Verify the Message "The product has been added to your shopping cart" on Top
//green Bar After that close the bar clicking on the cross button.
    public void verifyOrderMessage() {
        clickOnElement(orderMessage);
    }

    //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void setCloseBar() {
        clickOnElement(closeBar);
    }

    //2.15 Verify the message "Shopping cart"
    public void setShoppingCart() {
        mouseHoverToElementAndClick(shoppingCart);
    }
}
