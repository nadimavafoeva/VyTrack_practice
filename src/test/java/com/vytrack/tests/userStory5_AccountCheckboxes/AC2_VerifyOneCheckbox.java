package com.vytrack.tests.userStory5_AccountCheckboxes;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.AccountsPage;
import com.vytrack.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AC2_VerifyOneCheckbox extends TestBase {
    @Test
    public void StoreM1verifyCheckbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        Assertions.assertTrue(accountsPage.verify1Checkbox(1));
    }
    @Test
    public void StoreM2verifyCheckbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        Assertions.assertTrue(accountsPage.verify1Checkbox(1));
    }
    @Test
    public void StoreM3verifyCheckbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        Assertions.assertTrue(accountsPage.verify1Checkbox(1));
    }
    @Test
    public void SalesM1verifyCheckbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        Assertions.assertTrue(accountsPage.verify1Checkbox(1));
    }
    @Test
    public void SalesM2verifyCheckbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        Assertions.assertTrue(accountsPage.verify1Checkbox(1));
    }
    @Test
    public void SalesM3verifyCheckbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("salesManager3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        Assertions.assertTrue(accountsPage.verify1Checkbox(1));
    }
    @Test
    public void TD1verifyCheckbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        Assertions.assertTrue(accountsPage.verify1Checkbox(1));
    }
    @Test
    public void TD2verifyCheckbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver2"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        Assertions.assertTrue(accountsPage.verify1Checkbox(1));
    }
    @Test
    public void TD3verifyCheckbox(){
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("truckDriver3"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        AccountsPage accountsPage = new AccountsPage();
        accountsPage.userGoToAccounts();
        Assertions.assertTrue(accountsPage.verify1Checkbox(1));
    }
}
