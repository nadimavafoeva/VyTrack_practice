package com.vytrack.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class LoginPage {

    @FindBy (id = "prependedInput")
    private WebElement usernameBox;

    @FindBy (id ="prependedInput2")
    private WebElement passwordBox;

    @FindBy (id ="_submit")
    private WebElement loginBtn;

    @FindBy(xpath = "//i[@class='fa-caret-down']")
    public WebElement userDropdown;

    @FindBy(xpath = "//ul[@role='menu']/li[(contains (.,'My'))]" )
    public List<WebElement> userDropdownOptions;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void goTo(){
        Driver.getDriver().get(ConfigurationReader.read("url"));
    }

    public void login(String username, String password){
        this.usernameBox.sendKeys(username);
        this.passwordBox.sendKeys(password);
        this.loginBtn.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Dashboard"));
    }

   public ArrayList getDropdownOptions(){
        ArrayList<String> options = new ArrayList<>();
       for (WebElement eachOption : userDropdownOptions) {
           options.add(eachOption.getText());
       }
       return options;
   }

}
