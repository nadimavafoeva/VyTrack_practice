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

public class VehicleContractPage {

    @FindBy(xpath = "//span[@class='title title-level-2' and text()='Vehicle Contracts']")
    public WebElement vehicleContracts;

    @FindBy(xpath = "//span[@class='title title-level-1' and normalize-space(.)='Fleet']")
    public WebElement fleet;

    @FindBy(xpath = "//a[@title='Create Vehicle Contract']")
    public WebElement createContract;

    @FindBy(name = "custom_entity_type[Responsible]")
    public WebElement responsibleInput;

    public void goToVehicleContract(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(fleet).pause(1000).moveToElement(vehicleContracts).pause(1000).click().perform();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 2);
        wait.until(ExpectedConditions.titleIs("All - Vehicle Contract - Entities - System - Car - Entities - System"));
    }
    public void fillOutContractsForm(){
        Faker faker=new Faker();
        responsibleInput.sendKeys(faker.name().fullName());
        VehiclesPage.saveAndClose.click();
    }

    public VehicleContractPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
