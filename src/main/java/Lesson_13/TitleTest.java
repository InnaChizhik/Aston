package Lesson_13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitleTest {
    public WebDriver driver;

    @BeforeEach
    public void testStart() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testTitle() {
        driver.get("https://www.mts.by/");
        WebElement block = driver.findElement(By.xpath("//*[contains(text(), 'Онлайн пополнение без комиссии'"));
        assertEquals("Онлайн пополнение без комиссии", block.getText());
    }

    @AfterEach
    public void testFinish() {
        driver.quit();
    }

}
