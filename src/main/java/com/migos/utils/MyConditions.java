package com.migos.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class MyConditions {

    public static ExpectedCondition<WebElement> myClickable(final By locator) {

        return new ExpectedCondition<WebElement>() {

            public WebElement apply(WebDriver driver) {

                WebElement element = driver.findElement(locator);
                if (element.isDisplayed()) {
                    return element;
                }
                return null;
            }

            @Override
            public String toString() {
                return "element to be clickable " + locator;
            }
        };
    }

    public static ExpectedCondition<WebElement> myClickable(final WebElement element) {

        return new ExpectedCondition<WebElement>() {

            public WebElement apply(WebDriver driver) {

                if (element.isDisplayed()) {
                    return element;
                }
                return null;
            }

            @Override
            public String toString() {
                return "element to be clickable " + element;
            }
        };

    }
}