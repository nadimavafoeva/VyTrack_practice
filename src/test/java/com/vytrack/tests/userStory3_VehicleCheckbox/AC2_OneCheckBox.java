package com.vytrack.tests.userStory3_VehicleCheckbox;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AC2_OneCheckBox extends TestBase {
    @Test
    public void storeManager1Checkbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(2);
        vehiclesPage.clickCheckbox(3);
        Assertions.assertTrue(vehiclesPage.checkBoxes.get(3).isSelected());
    }
    @Test
    public void storeManager2Checkbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(3);
        vehiclesPage.clickCheckbox(3);
        Assertions.assertTrue(vehiclesPage.checkBoxes.get(3).isSelected());
    }
    @Test
    public void storeManager3Checkbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(3);
        vehiclesPage.clickCheckbox(3);
        Assertions.assertTrue(vehiclesPage.checkBoxes.get(3).isSelected());
    }
    @Test
    public void salesManager1Checkbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(2);
        vehiclesPage.clickCheckbox(3);
        Assertions.assertTrue(vehiclesPage.checkBoxes.get(3).isSelected());
    }
    @Test
    public void salesManager2Checkbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(3);
        vehiclesPage.clickCheckbox(3);
        Assertions.assertTrue(vehiclesPage.checkBoxes.get(3).isSelected());
    }
    @Test
    public void salesManager3Checkbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(3);
        vehiclesPage.clickCheckbox(3);
        Assertions.assertTrue(vehiclesPage.checkBoxes.get(3).isSelected());
    }
    @Test
    public void truckDriver1Checkbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driverGoToVehicles();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(BrowserUtils.checkVisibilityOfElement(By.xpath("//div/button/input[@type='checkbox']"),2));
    }
    @Test
    public void truckDriver2Checkbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driverGoToVehicles();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(BrowserUtils.checkVisibilityOfElement(By.xpath("//div/button/input[@type='checkbox']"),2));
    }
    @Test
    public void truckDriver3Checkbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driverGoToVehicles();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(BrowserUtils.checkVisibilityOfElement(By.xpath("//div/button/input[@type='checkbox']"),2));
    }

}
