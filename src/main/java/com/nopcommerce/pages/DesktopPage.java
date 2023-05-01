package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By dropdown = By.name("products-orderby");
    By addToCart = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }
}


