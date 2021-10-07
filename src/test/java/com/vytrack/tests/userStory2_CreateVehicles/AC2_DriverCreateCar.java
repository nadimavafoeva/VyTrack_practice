package com.vytrack.tests.userStory2_CreateVehicles;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AC2_DriverCreateCar extends TestBase {
    @Test
    public void driver1Creates(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driverGoToVehicles();
       Assertions.assertFalse(BrowserUtils.checkVisibilityOfElement(By.xpath("//a[normalize-space(.)='Create Car']"),4));

    }
    @Test
    public void driver2Creates(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driverGoToVehicles();
        Assertions.assertFalse(BrowserUtils.checkVisibilityOfElement(By.xpath("//a[normalize-space(.)='Create Car']"),4));

    }
    @Test
    public void driver3Creates(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driverGoToVehicles();
        Assertions.assertFalse(BrowserUtils.checkVisibilityOfElement(By.xpath("//a[normalize-space(.)='Create Car']"),4));

    }
}
