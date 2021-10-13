package com.vytrack.pages;

import com.github.javafaker.Faker;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleCostsPage {

    @FindBy(xpath = "//span[@class='title title-level-2' and text()='Vehicle Costs']")
    public WebElement vehicleCosts;

    @FindBy(xpath = "//span[@class='title title-level-1' and normalize-space(.)='Fleet']")
    public WebElement fleet;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createCosts;

    @FindBy(xpath = "//input[@name='custom_entity_type[TotalPrice]']")
    public WebElement totalCosts;


    public void goToVehicleCosts(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleet).pause(1000).moveToElement(vehicleCosts).pause(1000).click().perform();
//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2);
//        wait.until(ExpectedConditions.titleContains("All"));
        BrowserUtils.waitFor(2);
    }

    public void createVehicleCosts(){
        createCosts.click();
        BrowserUtils.waitFor(1);
        Faker faker = new Faker();
        totalCosts.sendKeys(""+faker.number().numberBetween(5000,100000));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.saveAndClose.click();
        BrowserUtils.waitFor(2);
    }



    public VehicleCostsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
