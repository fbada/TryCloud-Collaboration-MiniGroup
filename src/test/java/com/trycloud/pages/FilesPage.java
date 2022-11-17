package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='icon icon-add']/..")
    public WebElement addButton;

    @FindBy(xpath = "td[@class='selection']/label")
    public List<WebElement> allFiles;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAll;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadStart;

    @FindBy(xpath = "//div[@id='uploadprogressbar']")
    public WebElement progressBar;

    @FindBy (xpath = "//div[@class='toastify on dialogs error toastify-right toastify-top']/span")
    public WebElement notEnoughSpaceBtn;

    @FindBy(xpath = "//span[.='Delete file']/..")
    public WebElement deleteDropdown;

    @FindBy(xpath = "//aside//a[@class='action more icon icon-more has-tooltip']")
    public WebElement moreAsideAction;

    @FindBy(xpath = "//aside//span[@class='icon icon-delete']")
    public  WebElement deleteCommentIcon;

    @FindBy(xpath = "//a[@class='menuitem action action-details permanent']")
    public WebElement detailsOption;

    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settingsButton;

    @FindBy(xpath = "//aside//div[@data-placeholder='New comment …']")
    public WebElement commentField;

    @FindBy(xpath = "//aside//span[@class='app-sidebar-tabs__tab-icon icon-comment']/..")
    public WebElement commentIcon;

    @FindBy(xpath = "//a[@class='nav-icon-trashbin svg']")
    public WebElement detetedFiles;

    @FindBy(xpath = "//div[@id='app-settings-content']//label[contains(.,'Show')]")
    public List<WebElement> settingsCheckboxes;

    @FindBy(xpath = "//a/p")
    public WebElement storageAmount;

    @FindBy(xpath = "(//tbody//span[@class='icon icon-more'])")
    public List<WebElement> listActions;

    @FindBy(xpath = "(//td//span[@class='innernametext'])")
    public List<WebElement> files;

    public WebElement getfileUploadedAction(String name) {
        return Driver.getDriver().findElement(By.xpath("//span[.='" + name + "' " +
                "and @class='innernametext']/../..//a[@class='action action-menu permanent']"));
    }

    public void deleteUploadedFile(String fileName) {
        Actions action = new Actions(Driver.getDriver());
        BrowserUtils.scrollToElement(getfileUploadedAction(fileName));
        BrowserUtils.waitFor(1);
        BrowserUtils.highlight(getfileUploadedAction(fileName));
        BrowserUtils.clickWithJS(getfileUploadedAction(fileName));
        BrowserUtils.waitFor(1);
        BrowserUtils.highlight(deleteDropdown);
        BrowserUtils.clickWithJS(deleteDropdown);
        BrowserUtils.waitFor(1);
    }

}
