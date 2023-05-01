package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    //By qty = By.xpath("#itemquantity11222");
    //By total = By.xpath("//td[@class='subtotal']");
    By checkbox = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.xpath("//button[@id='checkout']");

/*
//2.16
public void changeOrderQty() {
    clearTextFromField(qty);
    sendTextToElement(qty, "2");
*/

/*
//2.16 Change the Qty to "2" and Click on "Update shopping cart"
    public void sendTextToQty (By by){
        clearTextFromField(qty);
        sendTextToElement(qty, "2");
        clickOnElement(By.xpath("//button[@id='updatecart']"));
    }
//2.17 Verify the Total"$2,950.00"
    public void setTotal () {
        clickOnElement(total);
    }*/

    //2.18 click on checkbox “I agree with the terms of service”
    public void setCheckbox () {
        clickOnElement(checkbox);
    }
    //2.19 Click on “CHECKOUT”
    public void setCheckoutButton () {
        clickOnElement(checkoutButton);
    }


}



