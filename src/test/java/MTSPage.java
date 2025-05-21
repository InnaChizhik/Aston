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

    //место для кнопки и всего того что с ней связано господи

    @FindBy(xpath = "//*[@id=\"connection-phone\"]")
    private WebElement phoneText;

    public String getphonePlaceholder() {
        return phoneText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"connection-sum\"]")
    private WebElement sumText;

    public String getsumPlaceholder() {
        return sumText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"connection-email\"]")
    private WebElement emailText;

    public String getemailPlaceholder() {
        return emailText.getAttribute("placeholder");
    }

    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button")
    private WebElement select_btn;
    @FindBy(xpath = "//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]/p")
    private WebElement btnDomInternet;

    public void selectDomInternet() {
        select_btn.click();
        btnDomInternet.click();
    }

}
