package com.vytrack.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccountsPage {
    @FindBy(xpath = "//span[@class='title title-level-1' and normalize-space(.)='Customers']")
    public WebElement customersModule;

    @FindBy(xpath = "//span[@class='title title-level-2' and .='Accounts']")
    public WebElement accountsModule;

    @FindBy(xpath = "//button/input[@type='checkbox']")
    public WebElement checkAllCheckboxes;

    @FindBy(xpath = "//td/input[@type='checkbox']")
    public List<WebElement> checkboxes;

    public void userGoToAccounts() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(customersModule).pause(1000).moveToElement(accountsModule)
                .click().perform();
        BrowserUtils.waitFor(2);
    }

    public boolean verifyCheckboxes() {
        boolean result = true;
        for (WebElement each : checkboxes) {
            if (!each.isSelected()) {
                result = false;
                break;
            }
        }
        return result;
    }
    public boolean verify1Checkbox(int a){
        boolean result = true;
        checkboxes.get(a).click();
        if (a<checkboxes.size()) {
            if (!checkboxes.get(a).isSelected()) {
                result = false;
            }
        }else {
            System.out.println("invalid index number");
        }
        return result;
    }
    public AccountsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
