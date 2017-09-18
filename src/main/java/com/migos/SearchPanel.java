package com.migos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class SearchPanel {
    private final WebDriver driver;

    @FindBy(id = "navbar-suggestionsearch")
    private List<WebElement> elementCount;

    @FindBy(css = (".poster .title"))
    private List<WebElement> posterTitle;

    @FindBy(id = "navbar-query")
    private WebElement searchInput;

    @FindBy(id = "quicksearch")
    private WebElement quickSearch;

    @FindBy(id = "navbar-submit-button")
    private WebElement submitButton;

    @FindBy(css = (".findResult"))
    private List<WebElement> findResult;

    public SearchPanel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SearchPanel(WebDriver driver, List<WebElement> elementCount, List<WebElement> posterTitle) {
        this.driver = driver;
        this.elementCount = elementCount;
        this.posterTitle = posterTitle;
        this.searchInput = searchInput;
        this.submitButton = submitButton;
    }

    public void SetSearch(String search) {
        getSearchInput().sendKeys(search);
    }

    private WebElement getSearchInput() {
        return searchInput;
    }

    public int elementCount() {
        System.out.println("Number of elements - " + posterTitle.size());
        return posterTitle.size();
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
        submitButton.click();
    }

    public int findSectionElements() {
        System.out.println("Number of titles in Search - " + findResult.size());
        return findResult.size();
    }
}