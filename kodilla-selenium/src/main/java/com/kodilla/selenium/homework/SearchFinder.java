package com.kodilla.selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchFinder {
    @FindBy(name = "search")
    WebElement searchField;

    By result = By.xpath("//div[@id='elements-wrapper']/div");

    WebDriver driver;

    public SearchFinder(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
        driver.navigate().to("https://kodilla.com/pl/test/store");

    }

    public int finder(String find) {
        searchField.clear();
        searchField.sendKeys(find);

        List<WebElement> list = driver.findElements(By.xpath("//div[@id='elements-wrapper']//div[@class='element']"));
        return list.size();
    }


    public void close() {
        driver.close();
    }
}
