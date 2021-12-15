package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Home_Work_1_1_less_6 {
    @Test
    public void test1() throws InterruptedException {

        // инициализация chrome driver и запуск приложения
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");
        String WidthIntput = "5";
        String LenghtItput = "10";
        String LossesItput = "500";

        String expectedResultStr1 = "525";
        String expectedResultStr2 = "11";

        // ввод данных в поля ввода
        WebElement elWidthIntput = driver.findElement(By.id("el_f_width"));
        elWidthIntput.sendKeys(WidthIntput);
        WebElement elLenghtItput = driver.findElement(By.id("el_f_lenght"));
        elLenghtItput.sendKeys(LenghtItput);
        WebElement elLossesItput = driver.findElement(By.id("el_f_losses"));
        elLossesItput.sendKeys(LossesItput);

        // ввод dropdown окон
        WebElement roomElement = driver.findElement(By.id("room_type"));
        Select roomDropDown = new Select(roomElement);
        roomDropDown.selectByValue("3");
        WebElement heatingElement = driver.findElement(By.id("heating_type"));
        Select heatingDropDown = new Select(heatingElement);
        heatingDropDown.selectByValue("2");

        // кнопка расчет
        WebElement callcButton = driver.findElement(By.name("button"));
        callcButton.click();

        // получение данных и обработка
        WebElement resultFloorCablePowerValue = driver.findElement(By.id("floor_cable_power"));
        String resultStr1 = resultFloorCablePowerValue.getAttribute("value");
        WebElement resultSpecFloorCablePowerValue = driver.findElement(By.id("spec_floor_cable_power"));
        String resultStr2 = resultSpecFloorCablePowerValue.getAttribute("value");

        Assert.assertEquals(resultStr1, expectedResultStr1, "Мощность нагревательного кабеля или мата - различные");
        Assert.assertEquals(resultStr2, expectedResultStr2, "Удельная мощность нагревательного кабеля или мата - различные");

        driver.quit();
    }
}
