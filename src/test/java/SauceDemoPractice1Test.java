import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.time.Duration;

public class SauceDemoPractice1Test {
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
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.findElement(By.id("item_4_img_link")).isDisplayed(),
                "Элемент 'Рюкзак' не отображается на странице");
        softAssert.assertTrue(driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).isDisplayed(),
                "Элемент 'AddToCart' не отображается на странице");
        softAssert.assertTrue(driver.findElement(By.className("header_container")).isDisplayed(),
                "Элемент 'HeaderContainer' не отображается на странице");
        softAssert.assertTrue(driver.findElement(By.id("item_4_img_link")).isDisplayed(),
                "Элемент 'Рюкзак' не отображается на странице");
        softAssert.assertTrue(driver.findElement(By.tagName("button")).isDisplayed(),
                "Элемент 'AddToCart' не найден на странице!");
        WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
        menu.click();
        softAssert.assertTrue(driver.findElement(By.linkText("All Items")).isDisplayed(),
                "Элемент 'All Items' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.partialLinkText("App State")).isDisplayed(),
                "Элемент 'App State' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.xpath("//a[@data-test='about-sidebar-link']")).isDisplayed(),
                "Элемент 'About' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed(),
                "Элемент 'Logout' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.xpath("//button[contains(@id,'react-burger-cross-')]")).isDisplayed(),
                "Элемент 'CloseMenu' не найден на странице!");
        WebElement buttonCloseMenu = driver.findElement(By.id("react-burger-cross-btn"));
        buttonCloseMenu.click();
        softAssert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection')]")).isDisplayed(),
                "Элемент 'Описание рюкзака' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']//ancestor::div")).isDisplayed(),
                "Элемент 'div' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.xpath("//div[@id='root']//descendant::button")).isDisplayed(),
                "Элемент 'Open Menu' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.xpath("//div[@data-test='inventory-item-name']/following::button")).isDisplayed(),
                "Элемент 'AddToCart' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.xpath("//span[text()='Products']/parent::div")).isDisplayed(),
                "Элемент 'div' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.xpath("//span[@class='select_container']/preceding::div[1]")).isDisplayed(),
                "Элемент 'div' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.xpath("//img[@alt='Sauce Labs Bike Light' and @class='inventory_item_img']")).isDisplayed(),
                "Элемент 'img' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.xpath("//img[@alt='Sauce Labs Bike Light' and @class='inventory_item_img']")).isDisplayed(),
                "Элемент 'img' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector(".inventory_item_img")).isDisplayed(),
                "Элемент 'div' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector(".btn_primary.btn_inventory")).isDisplayed(),
                "Элемент 'Add to cart' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector(".inventory_item .inventory_item_price")).isDisplayed(),
                "Элемент 'div' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector("#item_4_title_link")).isDisplayed(),
                "Элемент 'Sauce Labs Backpack' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector("#item_4_title_link")).isDisplayed(),
                "Элемент 'footer' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector("div.shopping_cart_container")).isDisplayed(),
                "Элемент 'div' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector("div[data-test='inventory-container']")).isDisplayed(),
                "Элемент 'div' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector("button[class~='btn_primary']")).isDisplayed(),
                "Элемент 'Add to cart' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector("div[data-test|='inventory']")).isDisplayed(),
                "Элемент 'div' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector("button[data-test^='add-to-cart']")).isDisplayed(),
                "Элемент 'Add to cart' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector("button[data-test$='sauce-labs-backpack']")).isDisplayed(),
                "Элемент 'img' не найден на странице!");
        softAssert.assertTrue(driver.findElement(By.cssSelector("button[data-test*='to-cart-sauce-labs-bike']")).isDisplayed(),
                "Элемент 'Add to cart' не найден на странице!");
        softAssert.assertAll();
        driver.quit();
    }
}
