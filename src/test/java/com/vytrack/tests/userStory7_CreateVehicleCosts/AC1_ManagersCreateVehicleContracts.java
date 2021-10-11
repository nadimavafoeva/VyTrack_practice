package com.vytrack.tests.userStory7_CreateVehicleCosts;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.TestBase;
import com.vytrack.pages.LoginPage;
import com.vytrack.pages.VehicleContractPage;
import org.junit.jupiter.api.Test;

public class AC1_ManagersCreateVehicleContracts extends TestBase {
    String expectedResult="Entity saved";
    @Test
    public void storeM1ContactInfo() {
        LoginPage loginPage = new LoginPage();
        loginPage.goTo();
        loginPage.login(ConfigurationReader.read("storeManager1"), ConfigurationReader.read("password"));
        BrowserUtils.waitFor(2);
        VehicleContractPage vehicleContractPage = new VehicleContractPage();
        vehicleContractPage.goToVehicleContract();
        vehicleContractPage.createContract.click();
        vehicleContractPage.fillOutContractsForm();



    }
}
