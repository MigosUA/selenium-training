package com.migos.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyActions {
    public static void click(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(MyConditions.myClickable(element));

        if (element==null) new RuntimeException("No element found");
        else
            element.click();
    }
}