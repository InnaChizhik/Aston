import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MTSPage {
    public static WebDriver driver;

    public MTSPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class=\"pay__wrapper\"]/h2")
    private WebElement title;

    public boolean titleDisplayed() {
        return title.isDisplayed();
    }

    public String titleText() {
        return title.getText();
    }

    @FindBy(xpath = "//ul/li[1]/img")
    private WebElement visa;
    @FindBy(xpath = "//ul/li[2]/img")
    private WebElement visaVerf;
    @FindBy(xpath = "//ul/li[3]/img")
    private WebElement masterCard;
    @FindBy(xpath = "//ul/li[4]/img")
    private WebElement masterCardSecure;
    @FindBy(xpath = "//ul/li[5]/img")
    private WebElement belCart;

    public boolean visaDisplayed() {
        return visa.isDisplayed();
    }

    public boolean visaVefrDisplayed() {
        return visaVerf.isDisplayed();
    }

    public boolean masterCardDisplayed() {
        return masterCard.isDisplayed();
    }

    public boolean masterCardSecureDisplayed() {
        return masterCardSecure.isDisplayed();
    }

    public boolean belCartDisplayed() {
        return belCart.isDisplayed();
    }

    @FindBy(xpath = "//section/div/a")
    private WebElement link;

    public void clickLink() {
        link.click();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    @FindBy(xpath = "//*[@id=\"connection-phone\"]")
    private WebElement phoneConText;

    public String getConnectionPhonePlaceholder() {
        return phoneConText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"connection-sum\"]")
    private WebElement sumConText;

    public String getConnectionSumPlaceholder() {
        return sumConText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"connection-email\"]")
    private WebElement emailConText;

    public String getConnectionEmailPlaceholder() {
        return emailConText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"internet-phone\"]")
    private WebElement internetPhoneText;

    public String getInternetPhonePlaceholder() {
        return internetPhoneText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"internet-sum\"]")
    private WebElement internerSumText;

    public String getInternetSumPlaceholder() {
        return internerSumText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"internet-email\"]")
    private WebElement internetEmailText;

    public String getInternetEmailPlaceholder() {
        return internetEmailText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"score-instalment\"]")
    private WebElement instalmentScoreText;

    public String getInstalmentScorePlaceholder() {
        return instalmentScoreText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"instalment-sum\"]")
    private WebElement instalmentSumText;

    public String getInstalmentSumPlaceholder() {
        return instalmentSumText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"instalment-email\"]")
    private WebElement instalmentEmailText;

    public String getInstalmentEmailPlaceholder() {
        return instalmentEmailText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"score-arrears\"]")
    private WebElement arrearsScoreText;

    public String getArrearsScorePlaceholder() {
        return arrearsScoreText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"arrears-sum\"]")
    private WebElement arrearsSumText;

    public String getArrearsSumPlaceholder() {
        return arrearsSumText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"arrears-email\"]")
    private WebElement arrearsEmailText;

    public String getArrearsEmailPlaceholder() {
        return arrearsEmailText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"connection-phone\"]")
    private WebElement phoneInput;
    @FindBy(xpath = "//*[@id=\"connection-sum\"]")
    private WebElement sumInput;
    @FindBy(xpath = "//*[@id=\"connection-email\"]")
    private WebElement emailInput;
    @FindBy(xpath = "//*[@id=\"pay-connection\"]/button")
    private WebElement continButton;
    @FindBy(xpath = "//app-payment-container//div[1]/div[1]/span")
    private WebElement formaSum;
    @FindBy(xpath = "//app-payment-container//app-card-page//div[1]/button")
    private WebElement formaButtonSum;
    @FindBy(xpath = "//app-payment-container//div[2]/span")
    private WebElement formaPhone;
    @FindBy(id = "confirmation-widget")
    private WebElement fornaWidget;


    public void fillForma(String phone, String sum, String email) {
        phoneInput.sendKeys(phone);
        sumInput.sendKeys(sum);
        emailInput.sendKeys(email);
    }

    public void clickContinButton() {
        continButton.click();
    }

    public String getFormaSum() {
        return formaSum.getText();

    }

    public String getFormaButtonSum() {
        return formaButtonSum.getText();
    }

    public String getFormaPhone() {
        String text = formaPhone.getText();
        return text.replaceAll("Оплата: Услуги связи Номер:375", "").trim();
    }

    @FindBy(xpath = "//label[contains(text(), 'Номер карты')]")
    private WebElement numberCard;

    public String getNumberCardPlaceholder() {
        return numberCard.getAttribute("placeholder");
    }

    @FindBy(xpath = "//label[contains(text(), 'Срок действия')]")
    WebElement srokCard;

    public String getSrokCardPlaceholder() {
        return srokCard.getAttribute("placeholder");
    }

    @FindBy(xpath = "//label[contains(text(), 'Имя и фамилия на карте')]")
    WebElement nameCard;

    public String getNameCardPlaceholder() {
        return nameCard.getAttribute("placeholder");
    }

    @FindBy(xpath = "//label[contains(text(), 'CVC')]")
    WebElement codeCard;

    public String getCodeCardPlaceholder() {
        return codeCard.getAttribute("placeholder");
    }


}
