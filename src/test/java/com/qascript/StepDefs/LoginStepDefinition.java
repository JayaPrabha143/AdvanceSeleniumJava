package com.qascript.StepDefs;

import com.qascript.BaseClass;
import com.qascript.PageObjects.LoginPage;
import com.qascript.utils.PropertiesUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class LoginStepDefinition extends BaseClass {

    Properties properties = PropertiesUtils.loadApplicationProperties();

    public LoginStepDefinition() throws IOException {
    }


    @Given("user enters valid username field in email field")
    public void userEntersValidUsernameFieldInEmailField() {
        String username = properties.getProperty("username");
        LoginPage.enterUserName(username);

    }

    @And("user enters valid password in password field")
    public void userEntersValidPasswordInPasswordField() {
        String  password= properties.getProperty("password");
        LoginPage.enterPassword(password);


    }

    @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        LoginPage.clickLoginBtn();
    }

    @Then("user is logged in successfully in to Application")
    public void userIsLoggedInSuccessfullyInToApplication() {

    }

    @Given("user enters invalid username field in email field")
    public void userEntersInvalidUsernameFieldInEmailField() {
    }

    @And("User enters invalid password in password field")
    public void userEntersInvalidPasswordInPasswordField() {
    }

    @Then("user is not logged into the application")
    public void userIsNotLoggedIntoTheApplication() {
    }
}
