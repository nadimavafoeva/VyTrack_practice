package com.vytrack.tests.userStory2_CreateVehicles;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehiclesPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AC1_ManagerCreateCar extends TestBase{
    @Test
    public void storeManager1Creates(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
       vehiclesPage.createCar();
        BrowserUtils.waitFor(3);
       WebElement message = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
       // Assertions.assertTrue(message.isDisplayed());
        Assertions.assertTrue(message.getText().substring(1).trim().equals("Entity saved"));

    }
    @Test
    public void storeManager2Creates(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.createCar();
        BrowserUtils.waitFor(3);
        WebElement message = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertTrue(message.isDisplayed());
    }
    @Test
    public void storeManager3Creates(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.createCar();
        BrowserUtils.waitFor(3);
        WebElement message = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertTrue(message.isDisplayed());
    }
    @Test
    public void salesManager1Creates(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.createCar();
        BrowserUtils.waitFor(3);
        WebElement message = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertTrue(message.isDisplayed());
    }
    @Test
    public void salesManager2Creates(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.createCar();
        BrowserUtils.waitFor(3);
        WebElement message = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertTrue(message.isDisplayed());
    }
    @Test
    public void salesManager3Creates(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"),ConfigurationReader.read("password"));
        VehiclesPage vehiclesPage = new VehiclesPage();
        vehiclesPage.createCar();
        BrowserUtils.waitFor(3);
        WebElement message = Driver.getDriver().findElement(By.xpath("//div[@class='flash-messages-holder']"));
        Assertions.assertTrue(message.isDisplayed());
    }
}
