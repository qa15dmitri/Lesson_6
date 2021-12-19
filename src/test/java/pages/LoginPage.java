package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    //описание элементов страницы
    private static By PAGE_OPENED_IDENTIFIER = By.className("logo-loginpage");

    private static By email_Selector = By.id("name");
    private static By password_Selector = By.id("password");
    private static By login_Selector = By.id("button_primary");

    private WebDriver driver;



    //конструктор страницы
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public boolean isPageOpened() {
        return super.isPageOpened(PAGE_OPENED_IDENTIFIER);
    }


    //реализация геттеров страницы
    public WebElement getEmailField() {
        return driver.findElement(email_Selector);}

        public WebElement getPasswordField () {
            return driver.findElement(password_Selector);}

            public WebElement getLoginButton () {
                return driver.findElement(login_Selector);}



            //реализакия базовых методов
        }
