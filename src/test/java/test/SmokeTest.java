package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SmokeTest {
    @Test
    public void test1() throws InterruptedException {

        // системная переменная
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        // WebDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://13gp.by/informatsiya/meditsinskie-kalkulyatory/994-raschet-indeksa-massy-tela");

        System.out.println();
        System.out.println(driver.getTitle());
        System.out.println();
        System.out.println(driver.getCurrentUrl());

// WebElement formElement = driver.findElement(By.id("form"));
        WebElement heighItput = driver.findElement(By.name("ht"));
        heighItput.sendKeys("183");
        WebElement massItput = driver.findElement(By.name("mass"));
        massItput.sendKeys("58");
        WebElement callcbutton = driver.findElement(By.xpath("//input[@type='button']"));
        callcbutton.click();
        WebElement resultValue = driver.findElement(By.name("result"));
        String resultStr = resultValue.getText();
        // if (!resultStr.equals("17.32")) {
         //   String resultStr = resultValue.getAttribute("value");
        //    System.out.println(resultStr);
            //     }

            Thread.sleep(1000);
            driver.quit();

        }
    }



