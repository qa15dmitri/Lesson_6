package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Home_Work_1_2_less_6 {
    @Test
    public void test1() throws InterruptedException {
        // инициализация chrome driver и запуск приложения
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://masterskayapola.ru/kalkulyator/laminata.html");

        // входные данные
        String roomWidth="10";
        String roomHeight="3";
        String lamWidth="1500";
        String lamHeight="150";
        String inpack="15";
        String price="500";
        String bias="300";
        String walldist="10";
        String direct="tow";
    //  String direct="toh";

        // ожидаемые результаты
        String expectedResultSLam = "29.74 м2.";
        String expectedResultLCount = "136 шт.";
        String expectedResultLPacks = "10 шт.";
        String expectedResultLPrice ="16875 руб.";
        String expectedResultLOver = "14 шт.";
        String expectedResultLTrash = "4 шт.";



        // ввод данных в поля ввода
        WebElement roomWidthIntput = driver.findElement(By.name("calc_roomwidth"));
        roomWidthIntput.sendKeys(Keys.DELETE);
        roomWidthIntput.sendKeys(Keys.DELETE);
        roomWidthIntput.sendKeys(roomWidth);

        WebElement roomHeightIntput = driver.findElement(By.name("calc_roomheight"));
        roomHeightIntput.sendKeys(Keys.DELETE);
        roomHeightIntput.sendKeys(Keys.DELETE);
        roomHeightIntput.sendKeys(roomHeight);

        WebElement lamWidthIntput = driver.findElement(By.name("calc_lamwidth"));
        lamWidthIntput.sendKeys(Keys.DELETE);
        lamWidthIntput.sendKeys(Keys.DELETE);
        lamWidthIntput.sendKeys(Keys.DELETE);
        lamWidthIntput.sendKeys(Keys.DELETE);
        lamWidthIntput.sendKeys(Keys.DELETE);
        lamWidthIntput.sendKeys(lamWidth);

        WebElement lamHeightIntput = driver.findElement(By.name("calc_lamheight"));
        lamHeightIntput.sendKeys(Keys.DELETE);
        lamHeightIntput.sendKeys(Keys.DELETE);
        lamHeightIntput.sendKeys(Keys.DELETE);
        lamHeightIntput.sendKeys(lamHeight);

        WebElement inpackIntput = driver.findElement(By.name("calc_inpack"));
        inpackIntput.sendKeys(Keys.DELETE);
        inpackIntput.sendKeys(Keys.DELETE);
        inpackIntput.sendKeys(inpack);

        WebElement priceIntput = driver.findElement(By.name("calc_price"));
        priceIntput.sendKeys(Keys.DELETE);
        priceIntput.sendKeys(Keys.DELETE);
        priceIntput.sendKeys(Keys.DELETE);
        priceIntput.sendKeys(Keys.DELETE);
        priceIntput.sendKeys(price);

        WebElement biasIntput = driver.findElement(By.name("calc_bias"));
        biasIntput.sendKeys(Keys.DELETE);
        biasIntput.sendKeys(Keys.DELETE);
        biasIntput.sendKeys(Keys.DELETE);
        biasIntput.sendKeys(Keys.DELETE);
        biasIntput.sendKeys(bias);

        WebElement walldistIntput = driver.findElement(By.name("calc_walldist"));
        walldistIntput.sendKeys(Keys.DELETE);
        walldistIntput.sendKeys(Keys.DELETE);
        walldistIntput.sendKeys(Keys.DELETE);
        walldistIntput.sendKeys(walldist);

        // ввод всплывающих окон
        WebElement directInput = driver.findElement(By.name("calc_direct"));
        Select directInputDropDown = new Select(directInput);
        directInputDropDown.selectByValue(direct);

// получение данных и обработка
        String resultSLam = driver.findElement(By.id("s_lam")).getText();
        String resultLCount = driver.findElement(By.id("l_count")).getText();
        String resultLPacks = driver.findElement(By.id("l_packs")).getText();
        String resultLPrice = driver.findElement(By.id("l_price")).getText();
        String resultLOver = driver.findElement(By.id("l_over")).getText();
        String resultLTrash = driver.findElement(By.id("l_trash")).getText();


        // анадиз результатов
        Assert.assertEquals(resultSLam, expectedResultSLam, "Площадь укладки - различные");
        Assert.assertEquals(resultLCount, expectedResultLCount, "Кол-во панелей - различные");
        Assert.assertEquals(resultLPacks, expectedResultLPacks, "Кол-во упаковок - различные");
        Assert.assertEquals(resultLPrice, expectedResultLPrice, "Стоимость - различные");
        Assert.assertEquals(resultLOver, expectedResultLOver, "Остатки - различные");
        Assert.assertEquals(resultLTrash, expectedResultLTrash, "Отрезки - различные");


        // печать
        System.out.println(resultSLam);
        System.out.println(expectedResultSLam);
        System.out.println(resultLCount);
        System.out.println(expectedResultLCount);
        System.out.println(resultLPacks);
        System.out.println(expectedResultLPacks);
        System.out.println(resultLPrice);
        System.out.println(expectedResultLPrice);
        System.out.println(resultLOver);
        System.out.println(expectedResultLOver);
        System.out.println(resultLTrash);
        System.out.println(expectedResultLTrash);

        Thread.sleep(10000);
        driver.quit();
    }
}
