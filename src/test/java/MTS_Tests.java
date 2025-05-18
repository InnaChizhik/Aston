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

public class MTS_Tests {
    public static WebDriver driver;
    private WebElement visa = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
    private WebElement masterCard = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
    private WebElement belCart = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));
    private WebElement link = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/a"));


    @BeforeAll
    static void setup() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.mts.by/");
        driver.findElement(By.xpath("//button[contains(text(), 'Принять')]")).click();
    }

    @Test
    public void testTitle() {
        WebElement block = driver.findElement(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2"));
        assertEquals("Онлайн пополнение без комиссии", "Онлайн пополнение без комиссии");
    }


    @Test
    public void testLogo() {
        Assertions.assertTrue(visa.isDisplayed());
        Assertions.assertTrue(masterCard.isDisplayed());
        Assertions.assertTrue(belCart.isDisplayed());
    }

    @Test
    public void testLink() {
        link.click();
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testButton() {
        WebElement phone = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        phone.sendKeys("297777777");
        WebElement sum = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        sum.sendKeys("30");
        WebElement email = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        email.sendKeys("prover@mail.ru");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        button.click();

    }

    @AfterAll
    public static void finish() {
        driver.close();
    }


}
