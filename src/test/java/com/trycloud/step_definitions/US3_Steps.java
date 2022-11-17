package com.trycloud.step_definitions;

import com.trycloud.pages.DashboardCommon;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US3_Steps {
    LoginPage loginPage = new LoginPage();
    DashboardCommon dashboardCommon = new DashboardCommon();

    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
       loginPage.loginConfigCreds();
        BrowserUtils.verifyElementDisplayed(dashboardCommon.WeatherLocationButton);
    }

    @Then("Verify the user see the following modules")
    public void verify_the_user_see_the_following_modules(List<String> dataTable) {
        Assert.assertEquals(dataTable, dashboardCommon.getActualModules());


    }
}
