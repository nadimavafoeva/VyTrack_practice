package com.vytrack.tests.userStory6_UserDropdown;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AccountNameOptions extends TestBase {
    private ArrayList<String> expectedOptions = new ArrayList<>(Arrays.asList("My Username", "My Configuration", "My Calendar"));

    @Test
    public void storeM1UserDropdown() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        loginPage.userDropdown.click();
        Assertions.assertEquals(expectedOptions,loginPage.getDropdownOptions());
    }
    @Test
    public void storeM2UserDropdown() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        loginPage.userDropdown.click();
        Assertions.assertEquals(expectedOptions,loginPage.getDropdownOptions());
    }
    @Test
    public void storeM3UserDropdown() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        loginPage.userDropdown.click();
        Assertions.assertEquals(expectedOptions,loginPage.getDropdownOptions());
    }
    @Test
    public void salesM1UserDropdown() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        loginPage.userDropdown.click();
        Assertions.assertEquals(expectedOptions,loginPage.getDropdownOptions());
    }
    @Test
    public void salesM2UserDropdown() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        loginPage.userDropdown.click();
        Assertions.assertEquals(expectedOptions,loginPage.getDropdownOptions());
    }
    @Test
    public void salesM3UserDropdown() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        loginPage.userDropdown.click();
        Assertions.assertEquals(expectedOptions,loginPage.getDropdownOptions());
    }
    @Test
    public void TD1UserDropdown() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        loginPage.userDropdown.click();
        Assertions.assertEquals(expectedOptions,loginPage.getDropdownOptions());
    }
    @Test
    public void TD2UserDropdown() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        loginPage.userDropdown.click();
        Assertions.assertEquals(expectedOptions,loginPage.getDropdownOptions());
    }
    @Test
    public void TD3UserDropdown() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        loginPage.userDropdown.click();
        Assertions.assertEquals(expectedOptions,loginPage.getDropdownOptions());
    }
}
