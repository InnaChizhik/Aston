import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MTSTests {
    public static WebDriver driver;
    private static MTSPage mtsPage;

    @BeforeAll
    static void setup() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.mts.by/");
        driver.manage().window().maximize();
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

//    @Test
//    public void testLink() {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(mtsPage.getLinkElement()));
//        mtsPage.clickLink();
//        assertTrue(mtsPage.getUrl().contains("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));
//        driver.get("https://www.mts.by/");
//
//    }

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
    public void testInput() throws InterruptedException {
        String phone = "297777777";
        String sum = "30.00 BYN";
        String email = "prover@mail.ru";
        mtsPage.fillForma(phone, sum, email);
        mtsPage.clickContinButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@class='bepaid-iframe']")));
        Thread.sleep(3000);
        assertEquals("Номер карты", mtsPage.getNumberCardPlaceholder(), "Плейсхолдер номер карты неверный");
        assertEquals("Срок действия", mtsPage.getSrokCardPlaceholder(), "Плейсхолдер срок карты неверный");
        assertEquals("Имя и фамилия на карте", mtsPage.getNameCardPlaceholder(), "Плейсхолдер ФІ неверный");
        assertEquals("CVC", mtsPage.getCodeCardPlaceholder(), "Плейсхолдер код карты неверный");
        assertEquals(sum, mtsPage.getFormaSum(), "Сумма неправильная в окне");
        assertEquals(sum, mtsPage.getFormaButtonSum(), "Сумма неправильная на кнопке");
        assertEquals(phone, mtsPage.getFormaPhone(), "Номер тел. неверный");

        driver.switchTo().defaultContent();
    }


    @AfterAll
    public static void finish() {
        driver.close();
    }


}
