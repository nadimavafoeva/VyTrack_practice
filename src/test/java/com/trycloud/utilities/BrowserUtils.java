package com.trycloud.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    // method to wait for certain amount of seconds
    public static void waitFor(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    // method to check if the provided element is found - returns true or false
    public static boolean checkVisibilityOfElement(By locator, int timeToWait){

        boolean result = false;

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),timeToWait);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            result = true;
        }catch(TimeoutException e){
            System.out.println(e.getMessage());
            //  System.out.println("The element is not located");
        }

        return result;
    }
    public static void waitForTitle(String title){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs(title));
    }
    public static void waitForTitleContains(String title){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleContains(title));
    }



}
