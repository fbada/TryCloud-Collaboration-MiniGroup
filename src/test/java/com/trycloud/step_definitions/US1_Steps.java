package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US1_Steps {
    LoginPage cloudDriver= new LoginPage();
    @Given("user on the login page")
    public void user_on_the_login() {

        cloudDriver.navigateTo();
    }
    @When("user types username {string} and password {string}")
    public void user_use_username_and_passcode(String username,String password) {

        cloudDriver.trycloud_login(username,password);


    }
    @When("user click the login button")
    public void user_click_the_login_button() {


        cloudDriver.user_click_loginBtn();

        BrowserUtils.waitUntilVisible(cloudDriver.customizeBtn,20);


    }
    @Then("verify the user should be at the dashboard")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        String title = "Dashboard - Trycloud";
        BrowserUtils.verifyTitleEquals(title);
    }
}
