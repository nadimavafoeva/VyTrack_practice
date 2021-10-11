package com.vytrack.tests.userStory5_AccountCheckboxes;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.AccountsPage;
import com.vytrack.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AC1_VerifyAllCheckboxes extends TestBase {
    @Test
    public void storeM1verifyCheckboxes(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        BrowserUtils.waitFor(2);
        accountsPage.checkAllCheckboxes.click();
        Assertions.assertTrue(accountsPage.verifyCheckboxes());
    }
    @Test
    public void storeM2verifyCheckboxes(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        accountsPage.checkAllCheckboxes.click();
        Assertions.assertTrue(accountsPage.verifyCheckboxes());
    }
    @Test
    public void storeM3verifyCheckboxes(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        accountsPage.checkAllCheckboxes.click();
        Assertions.assertTrue(accountsPage.verifyCheckboxes());
    }
    @Test
    public void salesM1verifyCheckboxes(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        accountsPage.checkAllCheckboxes.click();
        Assertions.assertTrue(accountsPage.verifyCheckboxes());
    }
    @Test
    public void salesM2verifyCheckboxes(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        accountsPage.checkAllCheckboxes.click();
        Assertions.assertTrue(accountsPage.verifyCheckboxes());
    }
    @Test
    public void salesM3verifyCheckboxes(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        BrowserUtils.waitFor(2);
        accountsPage.checkAllCheckboxes.click();
        Assertions.assertTrue(accountsPage.verifyCheckboxes());
    }
    @Test
    public void TD1verifyCheckboxes(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        accountsPage.checkAllCheckboxes.click();
        Assertions.assertTrue(accountsPage.verifyCheckboxes());
    }
    @Test
    public void TD2verifyCheckboxes(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        accountsPage.checkAllCheckboxes.click();
        Assertions.assertTrue(accountsPage.verifyCheckboxes());
    }
    @Test
    public void TD3verifyCheckboxes(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        accountsPage.checkAllCheckboxes.click();
        Assertions.assertTrue(accountsPage.verifyCheckboxes());
    }
}
