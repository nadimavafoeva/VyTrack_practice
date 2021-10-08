package com.vytrack.tests.userStory3_VehicleCheckbox;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AC1_CheckAll extends TestBase {
    @Test
    public void storeManager1CheckboxAll(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(1);
        vehiclesPage.checkBoxAll.click();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(vehiclesPage.areAllCheckboxesSelected());
    }
    @Test
    public void storeManager2CheckboxAll(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(1);
        vehiclesPage.checkBoxAll.click();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(vehiclesPage.areAllCheckboxesSelected());
    }
    @Test
    public void storeManager3CheckboxAll(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(1);
        vehiclesPage.checkBoxAll.click();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(vehiclesPage.areAllCheckboxesSelected());
    }
    @Test
    public void salesManager1CheckboxAll(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(1);
        vehiclesPage.checkBoxAll.click();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(vehiclesPage.areAllCheckboxesSelected());
    }
    @Test
    public void salesManager2CheckboxAll(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(1);
        vehiclesPage.checkBoxAll.click();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(vehiclesPage.areAllCheckboxesSelected());
    }
    @Test
    public void salesManager3CheckboxAll(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.managerGoToVehicles();
        BrowserUtils.waitFor(1);
        vehiclesPage.checkBoxAll.click();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(vehiclesPage.areAllCheckboxesSelected());
    }
    @Test
    public void truckDriver1CheckboxAll(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driverGoToVehicles();
        BrowserUtils.waitFor(1);
       Assertions.assertTrue(BrowserUtils.checkVisibilityOfElement(By.xpath("//div/button/input[@type='checkbox']"),2));
    }
    @Test
    public void truckDriver2CheckboxAll(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driverGoToVehicles();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(BrowserUtils.checkVisibilityOfElement(By.xpath("//div/button/input[@type='checkbox']"),2));
    }
    @Test
    public void truckDriver3CheckboxAll(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.driverGoToVehicles();
        BrowserUtils.waitFor(1);
        Assertions.assertTrue(BrowserUtils.checkVisibilityOfElement(By.xpath("//div/button/input[@type='checkbox']"),2));
    }


}
