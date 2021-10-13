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

public class VehicleOdometerPage {
    @FindBy(xpath = "//span[@class='title title-level-1' and normalize-space(.)='Fleet']")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[@class='title title-level-2' and text()='Vehicle Odometer']")
    public WebElement odometer;

    @FindBy(xpath ="//a[@title='Create Vehicle Odometer']" )
    public WebElement createOdometer;

    @FindBy(xpath = "//input[@name='custom_entity_type[Driver]']")
    public WebElement driverName;


    public void userGoToOdometer(){
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(fleetModule).pause(2000).moveToElement(odometer).pause(1000).click().perform();
        BrowserUtils.waitFor(3);
    }

    public void fillOutForm(){
        Faker faker = new Faker();
        driverName.sendKeys(faker.name().fullName());
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.saveAndClose.click();
        BrowserUtils.waitFor(2);
    }
    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
