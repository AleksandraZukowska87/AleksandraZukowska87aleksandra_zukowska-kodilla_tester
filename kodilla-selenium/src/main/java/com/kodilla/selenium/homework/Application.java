package com.kodilla.selenium.homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("NoteBook",
                "School",
                "Brand",
                "Business",
                "Gaming",
                "Powerful");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ElDzi\\Desktop\\kodilla\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        SearchFinder searchFinder = new SearchFinder(driver);

        words.forEach(tags -> {
            int size = searchFinder.finder(tags);
            System.out.println(tags + " ma " + size + " elementow!");
        });
    }
}
