import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

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
        WebElement loginInput = driver.findElement(By.xpath("//input[@data-test='username']"));
        loginInput.click();
        loginInput.sendKeys("standard_user");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@data-test='password']"));
        passwordInput.click();
        passwordInput.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        loginButton.click();
        WebElement buttonAddToCart1 = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        buttonAddToCart1.click();
        String expected1 = driver.findElement(By.xpath("//div[@data-test='inventory-item-name']")).getText();
        String expected2 = driver.findElement(By.xpath("//div[@data-test='inventory-item-price']")).getText();
        WebElement Basket = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        Basket.click();
        String actual1 = driver.findElement(By.xpath("//div[@data-test='inventory-item-name']")).getText();
        assertEquals(expected1, actual1);
        System.out.println("Проверка №1.");
        System.out.println("Ожидаемый результат. Наименование товара 'рюкзак': " + expected1);
        try {
            assertEquals(expected1, actual1);
            System.out.println("Фактический результат. Наименование товара 'рюкзак': " + actual1);
            System.out.println("Статус проверки: Успешно пройдена! Наименования совпадают.");
        } catch (AssertionError error) {
            System.err.println("Фактический результат. !!! Проверка провалена: ожидалось [" + expected1 + "], но получено значение [" + actual1 + "]");
            throw error;
        }
        String actual2 = driver.findElement(By.xpath("//div[@data-test='inventory-item-price']")).getText();
        assertEquals(expected2, actual2);
        System.out.println();
        System.out.println("Проверка №2.");
        System.out.println("Ожидаемый результат. Валюта и стоимость товара 'рюкзак': " + expected2);
        try {
            assertEquals(expected2, actual2);
            System.out.println("Фактический результат. Валюта и стоимость товара 'рюкзак': " + actual2);
            System.out.println("Статус проверки: Успешно пройдена! Валюта и стоимость совпадают.");
        } catch (AssertionError error) {
            System.err.println("Фактический результат. !!! Проверка провалена: ожидалось [" + expected2 + "], но получено значение [" + actual2 + "]");
            throw error;
        }
        driver.quit();
}
}
