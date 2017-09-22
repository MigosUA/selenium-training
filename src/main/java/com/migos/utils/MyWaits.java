package com.migos.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MyWaits {
    public static int myRendering(WebDriver driver, List<WebElement> element, int size) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(MyConditions.waitListSize(element, size));
        return size;
    }
}
