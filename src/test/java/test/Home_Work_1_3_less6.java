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

public class Home_Work_1_3_less6 {

  //  public void cssSelector() {
  //      By isSelector = By.cssSelector(".radio");

   // }

    @Test
    public void test1() throws InterruptedException {
        // инициализация chrome driver и запуск приложения
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://calc.by/building-calculators/laminate.html");

        // входные данные
        String lnRoom = "500";
        String wdRoom = "400";
        String lnLam = "2000";
        String wdLam = "200";
        String nPacking = "8";
        String minLengthSegment = "250";
        String indentWalls = "10";
        String metod = "2";
        String direct = "1";


        // ожидаемые результаты
        String expectedResult1 = "53";
        String expectedResult2 = "7";



        // ввод данных в поля ввода
        WebElement lnRoomIntput = driver.findElement(By.id("ln_room_id"));
        lnRoomIntput.clear();
        lnRoomIntput.sendKeys(lnRoom);

        WebElement wdRoomIntput = driver.findElement(By.id("wd_room_id"));
        wdRoomIntput.clear();
        wdRoomIntput.sendKeys(wdRoom);

        WebElement lnLamIntput = driver.findElement(By.id("ln_lam_id"));
        lnLamIntput.clear();
        lnLamIntput.sendKeys(lnLam);

        WebElement wdLamIntput = driver.findElement(By.id("wd_lam_id"));
        wdLamIntput.clear();
        wdLamIntput.sendKeys(wdLam);

        WebElement nPackingIntput = driver.findElement(By.id("n_packing"));
        nPackingIntput.clear();
        nPackingIntput.sendKeys(nPacking);

        WebElement minLengthSegmentIntput = driver.findElement(By.id("min_length_segment_id"));
        minLengthSegmentIntput.clear();
        minLengthSegmentIntput.sendKeys(minLengthSegment);

        WebElement indentWallsIntput = driver.findElement(By.id("indent_walls_id"));
        indentWallsIntput.clear();
        indentWallsIntput.sendKeys(indentWalls);


        // ввод всплывающих окон
        WebElement layingMethodLaminateInput = driver.findElement(By.id("laying_method_laminate"));
        Select layingMethodLaminateInputInputDropDown = new Select(layingMethodLaminateInput);
        layingMethodLaminateInputInputDropDown.selectByValue(metod);

        // радио
       WebElement radio = driver.findElement(By.id("direction-laminate-id1"));
       radio.click();

        // расчет
       WebElement selectBotton = driver.findElement(By.cssSelector(".calc-btn-div .calc-btn"));
       selectBotton.click();

// получение данных и обработка
 //       String result1 = driver.findElement(By.cssSelector("padding:5px 0;font-size:18px; color:#0E8C19; font-weight:bold;");
//        String result2 = driver.findElement(By.cssSelector("padding:5px 0;font-size:18px; color:#0E8C19; font-weight:bold;")).getText();

        // анадиз результатов
 //           Assert.assertEquals(result1, expectedResult1, "Площадь укладки - различные");
 //           Assert.assertEquals(result2, expectedResult2, "Кол-во панелей - различные");



        // печать
      //  System.out.println(result1);
     //   System.out.println(result2);


        Thread.sleep(10000);
        driver.quit();
    }
}
