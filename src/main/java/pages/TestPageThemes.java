package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPageThemes {

    @FindBy(xpath = "//a[href='Темы']")
    public WebElement themePage;

    @FindBy(xpath = "//button[@class=\"btn navbar-btn btn-default btn-sign-in\"]")
    public WebElement themeCreate;

    @FindBy(xpath = "//input[@placeholder=\"Заголовок темы\"]")
    public WebElement themeCreateTitle;

    @FindBy(xpath = "//textarea[@id=\"editor-textarea\"]")
    public WebElement themeCreateDescription;

    @FindBy(xpath = "//button[@type='Отмена']")
    public WebElement themeCreateCancel;

    //всплвающее окно потом решить

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement themeCreateSubmit;


    /**
     * Вкладки
     */
    @FindBy(xpath = "//a[@href='Все']")
    public WebElement tabAll;

    @FindBy(xpath = "//a[@href='/my/']")
    public WebElement tabMy;

    @FindBy(xpath = "//a[@href='/new/']")
    public WebElement tabNew;

    @FindBy(xpath = "//a[@href='/unread/']")
    public WebElement tabUnread;

    @FindBy(xpath = "//a[@href='/subscribed/']")
    public WebElement tabSubscribed;

//   "//a[@href=\"/subscribed/\"]"


    /**
     * Ответить в теме
     */
    @FindBy(xpath = "//button[@class=\"btn btn-primary btn-block btn-outline\"]")
    public WebElement themeAnswerMessage;


    /**
     * Кнопка Активна(подписка, отписка)
     */
    @FindBy(xpath = "//button[@class=\"btn-group btn-group-justified\"]")
    public WebElement themeButtonActiveOrNotActive;

    @FindBy(css = ".open > ul:nth-child(2) > li:nth-child(1) > button:nth-child(1) > span:nth-child(1)")
    public WebElement themeButtonUnsubscribe;

    @FindBy(css = ".open > ul:nth-child(2) > li:nth-child(2) > button:nth-child(1) > span:nth-child(1)")
    public WebElement themeButtonSubscribe;










}
