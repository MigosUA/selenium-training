package com.migos;

import com.migos.utils.MyActions;
import com.migos.utils.MyWaits;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class SearchPanel {
    private final WebDriver driver;

    @FindBy(css = (".poster .title"))
    public List<WebElement> posterTitle;

    @FindBy(id = "navbar-query")
    private WebElement searchInput;

    @FindBy(id = "quicksearch")
    private WebElement quickSearch;

    @FindBy(id = "navbar-submit-button")
    private WebElement submitButton;

    @FindBy(css = (".findResult"))
    public List<WebElement> findResult;

    public SearchPanel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SearchPanel(WebDriver driver, List<WebElement> posterTitle) {
        this.driver = driver;
        this.posterTitle = posterTitle;
    }

    public void SetSearch(String search) {
        getSearchInput().sendKeys(search);
    }

    private WebElement getSearchInput() {
        return searchInput;
    }

    public List<String> getText() {
        List<String> text = posterTitle.stream().map(WebElement::getText).collect(Collectors.toList());
        text.forEach(System.out::println);
        return text;
    }

    public void selectSearchType(String searchType) {
        Select select = new Select(quickSearch);
        select.selectByVisibleText(searchType);
    }

    public void setSubmitButton() {
        MyActions.click(driver, submitButton);
    }

}