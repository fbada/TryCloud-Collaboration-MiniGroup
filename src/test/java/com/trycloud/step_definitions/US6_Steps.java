package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.trycloud.step_definitions.US10_Steps.fileName;

public class US6_Steps {
FilesPage filesPage = new FilesPage();


    @Then("verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        BrowserUtils.waitFor(2);
        System.out.println("fileName = " + fileName);
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//span[.='" + fileName + "']")).isDisplayed());

        BrowserUtils.waitFor(3);
        filesPage.deleteUploadedFile(fileName);
    }
}
