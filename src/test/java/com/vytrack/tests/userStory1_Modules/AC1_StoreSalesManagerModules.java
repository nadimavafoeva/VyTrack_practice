package com.vytrack.tests.userStory1_Modules;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AC1_StoreSalesManagerModules extends TestBase {
    @Test
    public void storeManager1Modules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"),ConfigurationReader.read("password"));
        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        Assertions.assertTrue(modules.size()==8);
        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));
        ArrayList<String> actualModules = new ArrayList<>();
        for (WebElement module : modules) {
            actualModules.add(module.getText());
        }
        Assertions.assertIterableEquals(expectedModules,actualModules);
    }

    @Test
    public void storeManager2Modules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"),ConfigurationReader.read("password"));
        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        Assertions.assertTrue(modules.size()==8);
        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));
        ArrayList<String> actualModules = new ArrayList<>();
        for (WebElement module : modules) {
            actualModules.add(module.getText());
        }
        Assertions.assertIterableEquals(expectedModules,actualModules);
    }
    @Test
    public void storeManager3Modules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"),ConfigurationReader.read("password"));
        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        Assertions.assertTrue(modules.size()==8);
        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));
        ArrayList<String> actualModules = new ArrayList<>();
        for (WebElement module : modules) {
            actualModules.add(module.getText());
        }
        Assertions.assertIterableEquals(expectedModules,actualModules);
    }
    @Test
    public void salesManager1Modules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"),ConfigurationReader.read("password"));
        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        Assertions.assertTrue(modules.size()==8);
        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));
        ArrayList<String> actualModules = new ArrayList<>();
        for (WebElement module : modules) {
            actualModules.add(module.getText());
        }
        Assertions.assertIterableEquals(expectedModules,actualModules);
    }
    @Test
    public void salesManager2Modules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"),ConfigurationReader.read("password"));
        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        Assertions.assertTrue(modules.size()==8);
        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));
        ArrayList<String> actualModules = new ArrayList<>();
        for (WebElement module : modules) {
            actualModules.add(module.getText());
        }
        Assertions.assertIterableEquals(expectedModules,actualModules);
    }
    @Test
    public void salesManager3Modules(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"),ConfigurationReader.read("password"));
        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//span[@class='title title-level-1']"));
        Assertions.assertTrue(modules.size()==8);
        ArrayList<String> expectedModules = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales", "Activities", "Marketing", "Reports & Segments", "System"));
        ArrayList<String> actualModules = new ArrayList<>();
        for (WebElement module : modules) {
            actualModules.add(module.getText());
        }
        Assertions.assertIterableEquals(expectedModules,actualModules);
    }

}
