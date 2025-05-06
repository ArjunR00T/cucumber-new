package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CartPage extends BasePage {


        @FindBy(id = "checkout")
        WebElement checkOutBtn;

        @FindBy(xpath = "//button[contains(text(),'Remove')]")
        List<WebElement> removeBtn;

        public boolean isCartPageDisplayed() {
            wait.until(ExpectedConditions.visibilityOf(checkOutBtn));
            return checkOutBtn.isDisplayed();
        }

        public void clickOnCheckoutBtn() {
            checkOutBtn.click();
        }

    public void clickOnRemoveBtn() {
        removeBtn.getFirst().click();
    }

    public boolean isCartEmpty() {
            try{
                return removeBtn.getFirst().isDisplayed();
            } catch (Exception e) {
                return false;
            }
    }

    public boolean cartContains(int qty) {
            return qty == removeBtn.size();
    }

    public boolean ContainMultipleItem() {
            return !removeBtn.isEmpty();
    }
}
