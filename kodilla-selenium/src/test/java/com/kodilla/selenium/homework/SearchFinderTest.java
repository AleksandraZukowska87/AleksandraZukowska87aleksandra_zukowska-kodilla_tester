package com.kodilla.selenium.homework;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class SearchFinderTest {
    public static SearchFinder searchFinder;


    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ElDzi\\Desktop\\kodilla\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        searchFinder = new SearchFinder(driver);
    }

    @Test
    public void findByWordNoteBook() {
        int am =searchFinder.finder("NoteBook");

        assertEquals(2, am);
    }

    @Test
    public void findByWordSchool() {
        int am =searchFinder.finder("School");

        assertEquals(1, am);
    }

    @Test
    public void findByWordBrand() {
        int am =searchFinder.finder("Brand");

        assertEquals(1, am);
    }

    @Test
    public void findByWordBusiness() {
        int am =searchFinder.finder("Business");

        assertEquals(0, am);
    }

    @Test
    public void findByWordGaming() {
        int am =searchFinder.finder("Gaming");

        assertEquals(1, am);
    }

    @Test
    public void findByWordPowerful() {
        int am =searchFinder.finder("Powerful");

        assertEquals(0, am);
    }

    @AfterAll
    public static void testDown() {
        searchFinder.close();
    }
}
