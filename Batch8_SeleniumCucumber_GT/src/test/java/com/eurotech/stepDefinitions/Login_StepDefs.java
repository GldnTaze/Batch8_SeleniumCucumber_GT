package com.eurotech.stepDefinitions;


import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class Login_StepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enters gulden's credentials")
    public void the_user_enters_melih_s_credentials() {
        loginPage.login();
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl = "https://www.krafttechexlab.com/index";
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @When("The user enters mike's credentials")
    public void the_user_enters_mike_s_credentials() {
        loginPage.login("mike@gmail.com", "mike1234");
    }

    @When("The user enters Rosa's credentials")
    public void theUserEntersRosaSCredentials() {
        loginPage.login("rosa@test.com", "Test123456");
    }


    @When("The user enters John's credentials")
    public void the_user_enters_John_s_credentials() {
        loginPage.login("john@gmail.com", "John1234.");

    }

    @When("The user logs in with using credentials {string} and {string}")
    public void the_user_logs_in_with_using_credentials_and(String userEmail, String password) {
        loginPage.login(userEmail, password);
    }

    @When("The user logs in following menu")
    public void theUserLogsInFollowingMenu(Map<String, String> userCredentials) {
        System.out.println("userCredentials = " + userCredentials);
        loginPage.login(
                userCredentials.get("usermail"),
                userCredentials.get("password")
        );

    }

    @Then("Verify that username warning message is {string}")
    public void verify_that_username_warning_message_is(String expectedmessage) {
        BrowserUtils.waitFor(2);
        String actualMessage = loginPage.getWarningMessageText(expectedmessage);
        Assert.assertEquals(expectedmessage, actualMessage);


    }

    @And("The number is {int}")
    public void theNumberIs(int number) {
        System.out.println("number = " + number);
    }

    @And("The number also is {double}")
    public void theNumberAlsoIs(double number) {
        System.out.println("number = " + number);
    }

    @Then("The number can be {double}")
    public void the_number_can_be(Double double1) {
        System.out.println("double1 = " + double1);
    }

    @When("The user logins with following credentials")
    public void theUserLoginsWithFollowingCredentials(List<String> userCredentials) {
        loginPage.login(userCredentials.get(0), userCredentials.get(1));
    }


}

