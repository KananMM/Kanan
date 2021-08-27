package com.amwel.automationPractice.step_definitions;

import com.amwel.automationPractice.pages.HomePage;
import com.amwel.automationPractice.utilities.BrowserUtils;
import com.amwel.automationPractice.utilities.ConfigurationReader;
import com.amwel.automationPractice.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefs {

    HomePage homePage= new HomePage();



    @Given("user is logged in")
    public void user_is_logged_in() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        homePage.signIn.click();
        BrowserUtils.waitFor(2);

        String user = ConfigurationReader.get("username");
        String pass = ConfigurationReader.get("password");

        homePage.username.sendKeys(user);
        homePage.password.sendKeys(pass);
        BrowserUtils.waitFor(2);

        homePage.signInGreen.click();
        BrowserUtils.waitFor(2);
    }
    @When("user enters {string} in searchBar")
    public void user_enters_in_search_bar(String itemName) {
        itemName = "blouse";
        homePage.searchBox.sendKeys(itemName);
        BrowserUtils.waitFor(2);


    }
    @When("clicks on {string} button")
    public void clicks_on_button(String string) {
    homePage.searchButton.click();
    BrowserUtils.waitFor(2);

    }
    @And("user selects item")
    public void user_selects_item() {
        homePage.selectItem.click();
        BrowserUtils.waitFor(2);

    }
    @And("user adds item to the cart")
    public void user_adds_item_to_the_cart() {
        homePage.addItem.click();
        BrowserUtils.waitFor(2);
    }
    @Then("{string} pop-up should be displayed")
    public void pop_up_should_be_displayed(String string) {
        homePage.popUp.isDisplayed();
        BrowserUtils.waitFor(2);


    }
    @Then("user clicks on {string} button until {string} is displayed")
    public void user_clicks_on_button_until_is_displayed(String string, String string2) {

        homePage.proceedToCO1.click();
        BrowserUtils.waitFor(2);
        homePage.proceedToCO2.click();
        BrowserUtils.waitFor(2);
        homePage.proceedToCO3.click();
        BrowserUtils.waitFor(2);

    }
    @Then("user click on {string} button")
    public void user_click_on_button(String buttonName) {

        if(buttonName.equals("Agree term")){
homePage.agreeTerms.click();
        BrowserUtils.waitFor(2);
        }else if(buttonName.equals("I confirm my order")){
            BrowserUtils.waitFor(2);
            homePage.confirmOrder.click();
        }
    }
    @Then("user clicks on {string}")
    public void user_clicks_on(String string) {
        homePage.proceedToCO4.click();
        BrowserUtils.waitFor(2);
    }
    @Then("user selects {string} payment type")
    public void user_selects_payment_type(String paymentType) {
        homePage.paymentType.click();
        BrowserUtils.waitFor(2);

    }

    @Then("user should see  text {string} is displayed")
    public void user_should_see_text_is_displayed(String string) {

        homePage.orderConfirmation.isDisplayed();


    }
    @Given("user is on main page")
    public void user_is_on_main_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

    }
    @When("user clicks on black {string} button")
    public void user_clicks_on_black_button(String string) {
        homePage.signIn.click();
        BrowserUtils.waitFor(2);

    }
    @When("user puts in {string} and {string}")
    public void user_puts_in_and(String username, String password) {
        String user = ConfigurationReader.get("username");
        String pass = ConfigurationReader.get("password");

        homePage.username.sendKeys(user);
        homePage.password.sendKeys(pass);
        BrowserUtils.waitFor(2);

    }

    @When("user clicks on green {string} button")
    public void user_clicks_on_green_button(String string) {
        homePage.signInGreen.click();
        BrowserUtils.waitFor(2);

    }

    @Then("user should see own {string} on account landing page")
    public void user_should_see_own_on_account_landing_page(String expectedName) {


        String actualName= homePage.accountHolderName.getText();

        BrowserUtils.waitFor(2);

        Assert.assertEquals(expectedName,actualName);

    }

}
