package com.nopcommerce.pages;

import com.nopcommerce.utilities.Utility;
import org.openqa.selenium.By;

public class WelcomeToStorePage extends Utility {
    By welcomeToOurStore =By.xpath("//h2[normalize-space()='Welcome to our store']");

    public By welcomeToOurStoreElement(){
        return welcomeToOurStore;
    }
}

