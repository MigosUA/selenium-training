package com.migos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelayedButton {
    private final WebDriver driver;

    @FindBy(xpath = "//body//button[@class='hide']")
    private WebElement clickedButton;

    public DelayedButton(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTextOfButton() {
        String text = clickedButton.getText();
        return text;
    }
}