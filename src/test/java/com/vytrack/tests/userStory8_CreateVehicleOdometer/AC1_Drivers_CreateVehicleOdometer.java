package com.vytrack.tests.userStory8_CreateVehicleOdometer;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehicleOdometerPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AC1_Drivers_CreateVehicleOdometer extends TestBase {
    String expectedResult = "Entity saved";

    @Test
    public void tD1CreateVehicleOdometer(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.userGoToOdometer();
        vehicleOdometerPage.createOdometer.click();
        BrowserUtils.waitFor(2);
        vehicleOdometerPage.fillOutForm();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());

    }
    @Test
    public void tD2CreateVehicleOdometer(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.userGoToOdometer();
        vehicleOdometerPage.createOdometer.click();
        vehicleOdometerPage.fillOutForm();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());

    }
    @Test
    public void tD3CreateVehicleOdometer(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.userGoToOdometer();
        vehicleOdometerPage.createOdometer.click();
        vehicleOdometerPage.fillOutForm();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());

    }
}
