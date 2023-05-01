package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {
    By listViewTab = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia1020 = By.xpath("//h2//a[@href='/nokia-lumia-1020']");
    By changeQyt = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCart = By.xpath("//button[@id='add-to-cart-button-20']");
    By closeBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By shoppingCart = By.xpath("//span[@class='cart-label']");
    public void clickOnList(){
        clickOnElement(listViewTab);
    }
    public void clickOnNokiaLumia(){
        waitAndClick(nokiaLumia1020);
    }
    public void setChangeQty(){
        sendTextToElement(changeQyt,"2");
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void setCloseBar(){
        clickOnElement(closeBar);
    }
    public void mouseHoverAndClickOnShoppingCart(){
        mouseHoverToElementAndClick(shoppingCart);
    }

}

