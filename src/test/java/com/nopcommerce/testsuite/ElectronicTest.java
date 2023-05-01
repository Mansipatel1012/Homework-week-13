package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    ShoppingCartPage shoppingCartPage =new ShoppingCartPage();
    WelcomeSignInPage welcomePleaseSignInPage = new WelcomeSignInPage();
    RegisterPage registerPage = new RegisterPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ThankYouMessagePage thankYouMessagePage = new ThankYouMessagePage();
    WelcomeToStorePage welcomeToOurStorePage = new WelcomeToStorePage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        homePage.mouseHoverOnElectronics();
        homePage.clickIOnCellPhones();
        // Verify the text “Cell phones”
        verifyText(driver, By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"), "Cell phones");
    }
    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronics();
        homePage.clickIOnCellPhones();
        //Verify the text “Cell phones”
        verifyText(driver, By.xpath("//h1[contains(text(),'Cell phones')]"), "Cell phones");

        cellPhonePage.clickOnList();
        cellPhonePage.clickOnNokiaLumia();
        // Verify the text “Nokia Lumia 1020”
        verifyText(driver, By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"), "Nokia Lumia 1020");
        // Verify the price “$349.00”
        verifyText(driver, By.xpath("//span[@id='price-value-20']"), "$349.00");
        cellPhonePage.setChangeQty();
        cellPhonePage.clickOnAddToCart();
        // Verify the Message "The product has been added to your shopping cart" on Top green Bar
        verifyText(driver, By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"), "The product has been added to your shopping cart");
        cellPhonePage.setCloseBar();
        cellPhonePage.mouseHoverAndClickOnShoppingCart();
        // Verify the message "Shopping cart"
        verifyText(driver, By.xpath("//span[contains(text(),'Shopping cart')]"), "Shopping cart");
        // Verify the quantity is 2
       // verifyText(driver, By.xpath("//h1[contains(text(),'Shopping cart')]"), "2");
        // Verify the Total $698.00
        verifyText(driver, By.xpath("//tbody/tr[1]/td[6]/span[1]"), "$698.00");
        shoppingCartPage.setCheckbox();
        shoppingCartPage.setCheckoutButton();
        //Verify the Text “Welcome, Please Sign In!”
        verifyText(driver, By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"), "Welcome, Please Sign In!");
        // Verify the text “Register”
        verifyText(driver, By.xpath("//button[normalize-space()='Register']"), "Register");
        welcomePleaseSignInPage.clickOnRegisterButton();
        registerPage.fillingTheDetails("Prime","Testing","10","May","1995",
                "prime1423@gmail.com","prime@123","prime@123");
        registerPage.clickOnRegister();
        registerPage.clickOnContinue1();
        //  2.24 Verify the text “Shopping cart”
        verifyText(driver, By.xpath("//h1[contains(text(),'Shopping cart')]"), "Shopping cart");
        clickOnElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
        shoppingCartPage.setCheckbox();
        shoppingCartPage.setCheckoutButton();
        checkoutPage.fillingCardDetails1("United Kingdom","Harrow","100","Ha9 0SE","0158955785");
        checkoutPage.clickOnContinueButton4();
        checkoutPage.clickOnNextDayAirButton();
        checkoutPage.clickOnContinueButton1();
        checkoutPage.clickOnCreditCardPaymentMethod();
        checkoutPage.clickOnContinueButton2();
        checkoutPage.selectCreditCardType("Master card");
        checkoutPage.fillingCardDetails("Prime Testing","5521573041475125", "10","2027","245");
        checkoutPage.clickOnContinueButton3();
        checkoutPage.clickOnConfirm();
        // verify the Thank you Message
        String expectedMsg3 = "Thank you";
        String actualMsg3 = getTextFromElement(thankYouMessagePage.thankYouMessageElement());

        Assert.assertEquals(expectedMsg3, actualMsg3);

        // Verify the order msg. - Your order has been successfully processed!
        String exporderMsg = "Your order has been successfully processed!";
        String actordMsg = getTextFromElement(thankYouMessagePage.yourOrderMessageElement());
        Assert.assertEquals(actordMsg, exporderMsg);

        thankYouMessagePage.clickOnContinueButton();


        String actFinalmsg = "Welcome to our store";
        String expFinalmsg = getTextFromElement(welcomeToOurStorePage.welcomeToOurStoreElement());
        Assert.assertEquals(actFinalmsg,expFinalmsg);
    }
}
