package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement shoppingCartLink;

    @FindBy(xpath = "//button[contains(@id,'add-to-cart')]")
    List<WebElement> addToCartBtnList;

    @FindBy(id = "react-burger-menu-btn")
    WebElement hamBurgerMenu;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    @FindBy(id="reset_sidebar_link")
    WebElement resetBtn;

    @FindBy(xpath = "//select")
    WebElement filterBtn;

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    List<WebElement> priceList;

    @FindBy(xpath = "//div[@class='inventory_item_name ']")
    List<WebElement> items;

    @FindBy(xpath = "//button[@id='back-to-products']")
    WebElement backToPro;

    @FindBy(id="react-burger-cross-btn")
    WebElement cross;

    public boolean isHomePageDisplayed() {
        return shoppingCartLink.isDisplayed();
    }

    public void clickOnAddToCartOfFirstItem() {
        addToCartBtnList.get(0).click();
    }

    public void clickOnShoppingCartLink() {
        shoppingCartLink.click();
    }

    public String getCartIconQty() {
        return shoppingCartLink.findElement(By.xpath("./span")).getText();
    }

    public void clickOnHamburgerMenu() {
        hamBurgerMenu.click();
    }

    public void clickOnLogoutLink() {
        logoutLink.click();
    }

    public void openInventoryPage() {
        driver.get(ConfigReader.getProperty("inventory.url"));
    }

    public void addTwoItems() {
        addToCartBtnList.get(0).click();
        addToCartBtnList.get(1).click();
    }

    public void clickOnResetButton() {
        resetBtn.click();
    }

    public void sortByPrice(String text) {
        Select select = new Select(filterBtn);
        select.selectByVisibleText(text);
    }

    public boolean isPriceSorted() {
        List<Double> extractedPrices = new ArrayList<>();

        for (WebElement priceElement : priceList) {
            String priceText = priceElement.getText().replace("$", "").trim(); // remove '$' and whitespace
            extractedPrices.add(Double.parseDouble(priceText));
        }

        List<Double> sortedPrices = new ArrayList<>(extractedPrices);
        Collections.sort(sortedPrices);

        return extractedPrices.equals(sortedPrices);
    }

    public boolean isItemSorted() {
        // Extract item names from the WebElements
        List<String> extractedNames = new ArrayList<>();

        for (WebElement itemElement : items) {
            extractedNames.add(itemElement.getText().trim());
        }

        // Create a copy and sort it in descending order
        List<String> sortedNames = new ArrayList<>(extractedNames);
        sortedNames.sort(Comparator.reverseOrder());

        // Compare the original with the sorted list
        return extractedNames.equals(sortedNames);
    }

    public void clickOnFirstItem() {
        items.getFirst().click();
    }

    public boolean isOnProductPage() {
        return backToPro.isDisplayed();
    }

    public void clickOnBackToProduct() {
        backToPro.click();
    }

    public void closeHamburger() {
        cross.click();
    }
}
