package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoginTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopsPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ThankYouMessagePage thankYouMessagePage = new ThankYouMessagePage();
    WelcomeSignInPage welcomeSignInPage = new WelcomeSignInPage();
    WelcomeToStorePage welcomeToStorePage = new WelcomeToStorePage();



    @Test
    public void verifyProductArrangeInAlphabaticalOrder() {

        homePage.mouseHoverOnComputer();
        homePage.clickOnDesktop();

        //Select Z to A sorting option from dropdown list & verify
        List<WebElement> beforeFilterNameZtoAList = driver.findElements(By.className("item-grid"));
        List<String> beforeFileNameZtoAList = new ArrayList<>();
        for (WebElement nameZtoA : beforeFilterNameZtoAList) {
            beforeFileNameZtoAList.add(nameZtoA.getText());
        }
        Select select = new Select(driver.findElement(By.id("products-orderby")));
        select.selectByVisibleText("Name: Z to A");
        List<WebElement> afterFilterNameZtoAList = driver.findElements(By.className("item-grid"));
        List<String> afterFileNameZtoAList = new ArrayList<>();
        for (WebElement nameZtoA : afterFilterNameZtoAList) {
            afterFileNameZtoAList.add(nameZtoA.getText());
        }
        Collections.sort(beforeFileNameZtoAList);
        Assert.assertEquals(beforeFilterNameZtoAList, afterFilterNameZtoAList);
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.mouseHoverOnComputer();
        homePage.clickOnDesktop();
        //Select A to Z soeting option from dropdown list
        //  WebElement dropdown = driver.findElement(By.name("products-orderby"));
        //  Select select = new Select(dropdown);
        //   select.selectByVisibleText("Name: A to Z");
        desktopsPage.clickOnAddToCart();
        buildYourOwnComputerPage.selectByVisibleText();
        buildYourOwnComputerPage.setRam();
        buildYourOwnComputerPage.setRadioButtonHDD();
        buildYourOwnComputerPage.setRadioButtonOS();
        buildYourOwnComputerPage.setMicrosoftOfficeCheckBox();
        buildYourOwnComputerPage.setTotalCommanderCheckbox();
        //verify the price $ 1415.00
        String expectedPrice = "$1,470.00";
        String actualPrice = getTextFromElement(By.xpath("//span[@id='price-value-1']"));
        //Assert.assertEquals(expectedPrice,actualPrice);

        buildYourOwnComputerPage.clickOnAddToCart();
        buildYourOwnComputerPage.setCloseBar();
        // Verify the cart msg
        String expectedCartMsg = "Shopping cart";
        String actualCartMsg = getTextFromElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
        Assert.assertEquals(expectedCartMsg, actualCartMsg);

        buildYourOwnComputerPage.setShoppingCart();
        //shoppingCartPage.changeOrderQty();
        // Verify the total $2,950.00
        //  String expectedTotal = "$2,950.00";
        //   String actualTotal = getTextFromElement(By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]"));
        //   Assert.assertEquals(expectedTotal, actualTotal);
        shoppingCartPage.setCheckbox();
        shoppingCartPage.setCheckoutButton();
        Thread.sleep(2000);
        welcomeSignInPage.getWelcomeText();

        welcomeSignInPage.setCheckoutGuest();
        // verify the order msg.
        // String expectedOrdMsg = "The product has been added to your shopping cart";           // shopping cart
        //    String actualOrderMsg = getTextFromElement(By.xpath("//p[@class='content']"));
        //  Assert.assertEquals(actualOrderMsg, expectedOrdMsg);
        checkoutPage.enterFirstName("Prime");
        checkoutPage.enterLastName("Testing");
        checkoutPage.enterEmailId("prime123@gmail.com");

        Thread.sleep(5000);
        checkoutPage.selectFromDropdownCountry("United Kingdom");
        checkoutPage.enterCity("Harrow");
        checkoutPage.enterAddress1("100");
        checkoutPage.enterAddress2("ABC LANE");

        checkoutPage.enterZip("HA2 9SE");
        checkoutPage.enterPhoneNumber("0754741442");
        checkoutPage.enterFaxNumber("0192535448");
        checkoutPage.clickOnContinueButton();
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
        String expFinalmsg = getTextFromElement(welcomeToStorePage.welcomeToOurStoreElement());
        Assert.assertEquals(actFinalmsg,expFinalmsg);
    }

}

