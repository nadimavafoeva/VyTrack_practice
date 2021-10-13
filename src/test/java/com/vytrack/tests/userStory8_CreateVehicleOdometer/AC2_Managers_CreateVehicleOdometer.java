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

public class AC2_Managers_CreateVehicleOdometer extends TestBase {
    String expectedAlert = "You do not have permission to perform this action.";
    @Test
    public void storeM1CreateOdometer() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.userGoToOdometer();
        String actualAlert = Driver.getDriver().findElement(By.xpath("//div[@class='message' and .='You do not have permission to perform this action.']")).getText();
        Assertions.assertEquals(expectedAlert,actualAlert);
    }
    @Test
    public void storeM2CreateOdometer() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.userGoToOdometer();
        String actualAlert = Driver.getDriver().findElement(By.xpath("//div[@class='message' and .='You do not have permission to perform this action.']")).getText();
        Assertions.assertEquals(expectedAlert,actualAlert);
    }
    @Test
    public void storeM3CreateOdometer() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.userGoToOdometer();
        String actualAlert = Driver.getDriver().findElement(By.xpath("//div[@class='message' and .='You do not have permission to perform this action.']")).getText();
        Assertions.assertEquals(expectedAlert,actualAlert);
    }
    @Test
    public void salesM1CreateOdometer() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.userGoToOdometer();
        String actualAlert = Driver.getDriver().findElement(By.xpath("//div[@class='message' and .='You do not have permission to perform this action.']")).getText();
        Assertions.assertEquals(expectedAlert,actualAlert);
    }
    @Test
    public void salesM2CreateOdometer() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.userGoToOdometer();
        String actualAlert = Driver.getDriver().findElement(By.xpath("//div[@class='message' and .='You do not have permission to perform this action.']")).getText();
        Assertions.assertEquals(expectedAlert,actualAlert);
    }
    @Test
    public void salesM3CreateOdometer() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.userGoToOdometer();
        String actualAlert = Driver.getDriver().findElement(By.xpath("//div[@class='message' and .='You do not have permission to perform this action.']")).getText();
        Assertions.assertEquals(expectedAlert,actualAlert);
    }
}
