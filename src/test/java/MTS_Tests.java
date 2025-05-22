import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    @Test
    public void testTextUslug() {
        assertEquals("Номер телефона", mtsPage.getConnectionPhonePlaceholder(), "Плейсхолдер для тел.(услуги) неверный");
        assertEquals("Сумма", mtsPage.getConnectionSumPlaceholder(), "Плейсхолдер суммы(услуги) неверно");
        assertEquals("E-mail для отправки чека", mtsPage.getConnectionEmailPlaceholder(), "Плейсхолдер почты(услуги) неверно");
    }

    @Test
    public void testTextInternet() {
        assertEquals("Номер абонента", mtsPage.getInternetPhonePlaceholder(), "Плейсхолдер для тел(интернет) неверный");
        assertEquals("Сумма", mtsPage.getInternetSumPlaceholder(), "Плейсхолдер суммы(интернет) неверно");
        assertEquals("E-mail для отправки чека", mtsPage.getInternetEmailPlaceholder(), "Плейсхолдер почты(интернет) неверно");
    }

    @Test
    public void testTextInstalment() {
        assertEquals("Номер счета на 44", mtsPage.getInstalmentScorePlaceholder(), "Плейсхолдер для счета неверный");
        assertEquals("Сумма", mtsPage.getInstalmentSumPlaceholder(), "Плейсхолдер суммы(рассрочка) неверно");
        assertEquals("E-mail для отправки чека", mtsPage.getInstalmentEmailPlaceholder(), "Плейсхолдер почты(рассрочка) неверно");
    }

    @Test
    public void testTextArrears() {
        assertEquals("Номер счета на 2073", mtsPage.getArrearsScorePlaceholder(), "Плейсхолдер для тел.(задолженность) неверный");
        assertEquals("Сумма", mtsPage.getArrearsSumPlaceholder(), "Плейсхолдер суммы(задолженность) неверно");
        assertEquals("E-mail для отправки чека", mtsPage.getArrearsEmailPlaceholder(), "Плейсхолдер почты(задолженность) неверно");
    }

    @Test
    public void testInput() {
        String phone = "297777777";
        String sum = "30.00 BYN";
        String email = "prover@mail.ru";
        mtsPage.fillForma(phone, sum, email);
        mtsPage.clickContinButton();
        driver.switchTo().frame(driver.findElement(By.className("bepaid-iframe")));
        assertEquals(phone, mtsPage.getFormaPhone(), "Номер тел. неверный");
        assertEquals(sum, mtsPage.getFormaSum(), "Сумма неправильная в окне");
        assertEquals(sum, mtsPage.getFormaButtonSum(), "Сумма неправильная на кнопке");
        driver.switchTo().defaultContent();


    }

    @AfterAll
    public static void finish() {
        driver.close();
    }


}
