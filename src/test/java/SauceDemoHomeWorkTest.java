import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.time.Duration;

public class SauceDemoHomeWorkTest {
    @Test
    public void SauceDemoPractice1() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        options.addArguments("--disable-notfications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        SoftAssert softAssert = new SoftAssert();
        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@data-test='login-button']")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        String expectedName = driver.findElement(By.xpath("//div[@data-test='inventory-item-name']")).getText();
        String expectedPrice = driver.findElement(By.xpath("//div[@data-test='inventory-item-price']")).getText();
        driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']")).click();
        String actualName = driver.findElement(By.xpath("//div[@data-test='inventory-item-name']")).getText();
        String actualPrice = driver.findElement(By.xpath("//div[@data-test='inventory-item-price']")).getText();
        softAssert.assertEquals(actualName, expectedName, "Наименование товара в корзине не совпадает");
        softAssert.assertEquals(actualPrice, expectedPrice, "Валюта или цена товара в корзине не совпадает");
        driver.quit();
        softAssert.assertAll();
    }
}
