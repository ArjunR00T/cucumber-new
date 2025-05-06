package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{

    @FindBy(xpath = "//span[@class='title'][contains(text(),'Checkout')]")
    WebElement checkoutPageTitle;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(id = "postal-code")
    WebElement zipCodeInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    public boolean isCheckoutPageDisplayed() {
        return checkoutPageTitle.isDisplayed();
    }

    public void fillShippingInfo() {
        firstNameInput.sendKeys(ConfigReader.getProperty("shipping.firstname"));
        lastNameInput.sendKeys(ConfigReader.getProperty("shipping.lastname"));
        zipCodeInput.sendKeys(ConfigReader.getProperty("shipping.zipcode"));
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }
}
