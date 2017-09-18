package com.migos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TopRatedPage {
    private final WebDriver driver;

    @FindBy(className = "downArrow")
    private WebElement downArrow;

    @FindBy(xpath = "//div[@id='navMenu1']//a[contains(text(), 'Top Rated Movies')]")
    private WebElement topRatedMovies;

    @FindBy(xpath = "//table//tbody[@class='lister-list']//tr")
    private List<WebElement> allTopRatedMovies;

    public TopRatedPage(WebDriver driver) {
        this.driver = driver;
        this.downArrow = downArrow;
        this.topRatedMovies = topRatedMovies;
        PageFactory.initElements(driver, this);
    }

    public void selectMovies() {
        downArrow.click();
    }

    public void setTopRatedMovies() {
        topRatedMovies.click();
    }

    public void printAllTopRatedMovies() {
        WebElement elem1 = allTopRatedMovies.get(0);
        //System.out.println(elem1.findElement(By.xpath(".//td[@class='titleColumn']//a")).getText());
        System.out.println(allTopRatedMovies.get(0).getText());
        System.out.println(allTopRatedMovies.get(1).getText());
        System.out.println(allTopRatedMovies.get(2).getText());
        System.out.println(allTopRatedMovies.get(3).getText());
        System.out.println(allTopRatedMovies.get(4).getText());
    }
}
