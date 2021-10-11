package com.vytrack.pages;

import com.github.javafaker.Faker;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class VehiclesPage {

    @FindBy(xpath = "//span[@class='title title-level-1' and normalize-space(text())='Fleet']")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicles;

    @FindBy(xpath = "//a[normalize-space(.)='Create Car']")
    public WebElement createCar;

    @FindBy(xpath = "//div/button/input[@type='checkbox']")
    public WebElement checkBoxAll;

    @FindBy(xpath = "//div[@class='other-scroll-container']//input" )
    public List<WebElement> checkBoxes;

    // create car webelements
    @FindBy(name="custom_entity_type[Driver]")
    private WebElement driverName;

    @FindBy(name = "custom_entity_type[Location]")
    private WebElement location;

    @FindBy(name = "custom_entity_type[ModelYear]")
    private WebElement modelYear;

    @FindBy(xpath = "(//button[normalize-space(.)='Save and Close'])[1]")
    public static WebElement saveAndClose;

    public void managerGoToVehicles(){
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(fleetModule).pause(2000).moveToElement(vehicles).pause(1000).click().perform();
       WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
       wait.until(ExpectedConditions.titleContains("All"));
    }
    public void driverGoToVehicles(){
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(fleetModule).pause(2000).moveToElement(vehicles).pause(1000).click().perform();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.titleContains("Car"));
    }

    public void createCar(){
        managerGoToVehicles();
        createCar.click();
        BrowserUtils.waitFor(2);
        Faker faker = new Faker();
        driverName.sendKeys(faker.name().fullName());
        location.sendKeys(faker.address().cityName());
        modelYear.sendKeys(""+faker.number().numberBetween(1990,2021));
        saveAndClose.click();
    }
    public void clickCheckbox(int index){
        checkBoxes.get(index).click();
    }
    public boolean areAllCheckboxesSelected(){
        boolean result=true;
        for (WebElement eachCheckbox : checkBoxes) {
            if (!eachCheckbox.isSelected()){
                result = false;
                System.out.println("checkbox is not selected");
            }
            break;
        }
        return result;

    }
    public VehiclesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
