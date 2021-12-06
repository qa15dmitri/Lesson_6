package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest2 {
    static String URL="http://13gp.by/informatsiya/meditsinskie-kalkulyatory/995-raschet-skorosti-klubochkovoj-filtratsii-skf";

    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");

        String creatinineValue = "80";
        String ageValue = "38";
        String weightValue = "55";
        String heightValue = "163";

        String expectedMDRD = "MDRD: 74 (мл/мин/1,73кв.м)";
        String expectedMDRD1 = "ХБП: 2 стадия (при наличии почечного повреждения)";
        String expectedCG = "Cockroft-Gault: 70 (мл/мин)";
        String expectedBSA = "Поверхность тела:1.58 (кв.м)";



        // 1. Открыть браузер и перейти на тестируемую страничку
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        //2. Выбрать пол
        WebElement sexElement = driver.findElement(By.id("oSex"));
        Select sexDropDown = new Select(sexElement);
        //sexDropDown.selectByIndex(1);
          sexDropDown.selectByValue("1");
        //sexDropDown.selectByVisibleText("женский");
        WebElement kreatinin = driver.findElement(By.id("oCr"));
        kreatinin.sendKeys(80);
        WebElement Age = driver.findElement(By.id("oAge"));
        Age.sendKeys(38);
        WebElement Weight = driver.findElement(By.id("oWeight"));
        Weight.sendKeys(55);


        //8. Проверка результата

        Assert.assertEquals(actualMDRD, expe);








        Thread.sleep(1000);
        driver.quit();
    }



}
