package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @When("user click on add to cart button of the first item")
    public void user_click_on_add_to_cart_button_of_the_first_item() {
        homePage.clickOnAddToCartOfFirstItem();
    }

    @Then("verify cart icon displays quantity one")
    public void verify_cart_icon_displays_quantity_one() {
        Assert.assertEquals(homePage.getCartIconQty(), "1");
    }

    @When("user click on cart icon")
    public void user_click_on_cart_icon() {
        homePage.clickOnShoppingCartLink();
    }

    @When("user open inventory page")
    public void userOpenInventoryPage() {
        homePage.openInventoryPage();
    }

    @When("the user adds multiple items to the cart")
    public void theUserAddsMultipleItemsToTheCart() {
        homePage.addTwoItems();
    }

    @When("user click on hamburger button")
    public void userClickOnHamburgerButton() {
        homePage.clickOnHamburgerMenu();
    }

    @Then("user click on logout button")
    public void userClickOnLogoutButton() {
        homePage.clickOnLogoutLink();
    }

    @Then("user click on reset button")
    public void userClickOnResetButton() {
        homePage.clickOnResetButton();
    }

    @When("the user sorts products by {string}")
    public void theUserSortsProductsBy(String text) {
        homePage.sortByPrice(text);
    }

    @Then("the product list should be sorted in ascending price order")
    public void theProductListShouldBeSortedInAscendingPriceOrder() {
        Assert.assertTrue(homePage.isPriceSorted());
    }

    @Then("the product list should be sorted in descending alphabetical order")
    public void theProductListShouldBeSortedInDescendingAlphabeticalOrder() {
        Assert.assertTrue(homePage.isItemSorted());
    }

    @When("the user clicks on first item")
    public void theUserClicksOnFirstItem() {
        homePage.clickOnFirstItem();
    }

    @Then("the product detail page should be displayed")
    public void theProductDetailPageShouldBeDisplayed() {
        Assert.assertTrue(homePage.isOnProductPage());
    }

    @When("the user clicks the back button")
    public void theUserClicksTheBackButton() {
        homePage.clickOnBackToProduct();
    }
}
