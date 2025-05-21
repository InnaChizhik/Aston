import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MTS_Tests {
    public static WebDriver driver;
    private static MTSPage mtsPage;

    @BeforeAll
    static void setup() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[contains(text(), 'Принять')]")).click();
        mtsPage = new MTSPage(driver);
    }

    @Test
    public void testTitle() {
        assertTrue(mtsPage.titleDisplayed(), "Заголовка нет");
        assertEquals("Онлайн пополнение без комиссии", mtsPage.titleText().replaceAll("\\s+", " "), "Заголовок неверный");
    }


    @Test
    public void testLogo() {
        assertTrue(mtsPage.visaDisplayed(), "нет visa");
        assertTrue(mtsPage.visaVefrDisplayed(), "нет visaVefr");
        assertTrue(mtsPage.masterCardDisplayed(), "нет masterCard");
        assertTrue(mtsPage.masterCardSecureDisplayed(), "нет masterCardSecure");
        assertTrue(mtsPage.belCartDisplayed(), "нет belCart");
    }

    @Test
    public void testLink() {
        mtsPage.clickLink();
        assertTrue(mtsPage.getUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testButton() {


    }

    @AfterAll
    public static void finish() {
        driver.close();
    }


}
