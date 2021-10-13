package com.vytrack.tests.userStory7_CreateVehicleCosts;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehicleCostsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AC1_CreateVehicleCosts extends TestBase {
    String expectedResult="Entity saved";

    @Test
    public void storeM1CreateVehicleCosts() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleCostsPage vehicleContractPage = new VehicleCostsPage();
        vehicleContractPage.goToVehicleCosts();
        vehicleContractPage.createVehicleCosts();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());
    }
    @Test
    public void storeM2CreateVehicleCosts() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleCostsPage vehicleContractPage = new VehicleCostsPage();
        vehicleContractPage.goToVehicleCosts();
        vehicleContractPage.createVehicleCosts();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());
    }
    @Test
    public void storeM3CreateVehicleCosts() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleCostsPage vehicleContractPage = new VehicleCostsPage();
        vehicleContractPage.goToVehicleCosts();
        vehicleContractPage.createVehicleCosts();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());
    }
    @Test
    public void salesM1CreateVehicleCosts() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleCostsPage vehicleContractPage = new VehicleCostsPage();
        vehicleContractPage.goToVehicleCosts();
        vehicleContractPage.createVehicleCosts();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());
    }
    @Test
    public void salesM2CreateVehicleCosts() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleCostsPage vehicleContractPage = new VehicleCostsPage();
        vehicleContractPage.goToVehicleCosts();
        vehicleContractPage.createVehicleCosts();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());
    }
    @Test
    public void salesM3CreateVehicleCosts() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleCostsPage vehicleContractPage = new VehicleCostsPage();
        vehicleContractPage.goToVehicleCosts();
        vehicleContractPage.createVehicleCosts();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());
    }
    @Test
    public void tD1CreateVehicleCosts() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleCostsPage vehicleContractPage = new VehicleCostsPage();
        vehicleContractPage.goToVehicleCosts();
        vehicleContractPage.createVehicleCosts();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());
    }
    @Test
    public void tD2CreateVehicleCosts() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleCostsPage vehicleContractPage = new VehicleCostsPage();
        vehicleContractPage.goToVehicleCosts();
        vehicleContractPage.createVehicleCosts();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());
    }
    @Test
    public void tD3CreateVehicleCosts() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleCostsPage vehicleContractPage = new VehicleCostsPage();
        vehicleContractPage.goToVehicleCosts();
        vehicleContractPage.createVehicleCosts();
        WebElement actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertEquals(expectedResult, actualResult.getText().substring(1).trim());
    }

}
