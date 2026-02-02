package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class InsuranceLoginTest {


    WebDriver driver;


    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/insurance/v1/index.php");


    }
    @Test
    public void openInsuranceSite() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.findElement(By.xpath("/html/body/div[3]/a")).click();
        Thread.sleep(2000);
        Select titleDropdown = new Select(driver.findElement(By.name("title")));
        titleDropdown.selectByVisibleText("Mr");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/input")).sendKeys("Jr.NTR");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input")).sendKeys("Dragon");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[2]/input")).sendKeys("0480103624");
        Thread.sleep(2000);

        Select year = new Select(driver.findElement(By.name("year")));
        year.selectByVisibleText("1995");
        Thread.sleep(2000);

        Select month = new Select(driver.findElement(By.name("month")));
        month.selectByVisibleText("December");
        Thread.sleep(2000);

        Select date = new Select(driver.findElement(By.name("date")));
        date.selectByVisibleText("14");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[4]/input[2]")).click();
        Thread.sleep(2000);

        Select years = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[5]/select")));
        years.selectByVisibleText("12");
        Thread.sleep(2000);

        Select occupation = new Select(driver.findElement(By.name("occupation")));
        occupation.selectByVisibleText("Engineer");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[4]/div[1]/input")).sendKeys("Fairview Terrace");
        Thread. sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[4]/div[2]/input")).sendKeys("Adelaide");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[4]/div[3]/input")).sendKeys("Australia");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[4]/div[4]/input")).sendKeys("5085");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[5]/div[1]/input")).sendKeys("NTRdragon@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[5]/div[2]/input")).sendKeys("Dileep");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[5]/div[3]/input")).sendKeys("Dileep");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[5]/input[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[1]/input")).sendKeys("NTRdragon@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/input")).sendKeys("Dileep");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/form/div[3]/input")).click();
        Thread.sleep(2000);

        WebElement homeText = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/h2"));
        Thread.sleep(2000);

        String actualText = homeText.getText();
        System.out.println(actualText);

        String expectedText = "Broker Insurance WebPage";
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
        Thread.sleep(2000);

        Select Athome = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[3]/select")));
        Athome.selectByVisibleText("At home");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[4]/input[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[1]/input")).sendKeys("No incidents");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[2]/input")).sendKeys("S841CZF");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[3]/input")).sendKeys("10000 Kms");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[4]/input")).sendKeys("$38000");
        Thread.sleep(2000);

        Select ParkingLocation = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[5]/select")));
        ParkingLocation.selectByVisibleText("Locked Garage");
        Thread.sleep(2000);

        Select year1 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[6]/select[1]")));
        year1.selectByVisibleText("2025");
        Thread.sleep(2000);

        Select month1 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[6]/select[2]")));
        month1.selectByVisibleText("June");
        Thread.sleep(2000);

        Select date1 = new Select(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[7]/h5[6]/select[3]")));
        date1.selectByVisibleText("28");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[8]/input[1]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/form/div[8]/input[3]")).click();
        Thread.sleep(2000);

        String fullMessage = driver.findElement(By.tagName("body")).getText();

        Assert.assertTrue(fullMessage.contains("You have saved this quotation!"));
        Assert.assertTrue(fullMessage.contains("Your identification number is :"));
        Assert.assertTrue(fullMessage.contains("Please write it down for later retrieve"));
        Thread.sleep(2000);






    }
    @AfterMethod
    public void tearDown(){
        {
            driver.quit();
        }



    }
}
