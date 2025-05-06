package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("verify user is on cart page")
    public void verify_user_is_on_cart_page() {
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }

    @When("user click on checkout button")
    public void user_click_on_checkout_button() {
        cartPage.clickOnCheckoutBtn();
    }

    @When("user click on remove item")
    public void userClickOnRemoveItem() {
        cartPage.clickOnRemoveBtn();
    }

    @Then("verify cart is empty")
    public void verifyCartIsEmpty() {
        Assert.assertFalse(cartPage.isCartEmpty());
    }

    @Then("the cart should contain {int} items")
    public void theCartShouldContainItems(int qty) {
        Assert.assertTrue(cartPage.cartContains(qty));
    }

    @Then("verify cart contain multiple item")
    public void verifyCartContainMultipleItem() {
        Assert.assertTrue(cartPage.ContainMultipleItem());
    }

}
