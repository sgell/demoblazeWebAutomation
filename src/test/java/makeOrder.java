import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class makeOrder {
    @Test
    public static void order() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html#");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //category laptops
        WebElement categoryLaptops = driver.findElement(By.xpath("//a[3]"));
        categoryLaptops.click();

        Thread.sleep(2000);

        // scroll down the page

        Actions act = new Actions(driver);
        act.scrollByAmount(0,500).perform();

        Thread.sleep(5000);
        act.scrollByAmount(0,500).perform();

        // mark laptop
        WebElement laptop = driver.findElement(By.xpath("//a[normalize-space()='Dell i7 8gb']"));
        laptop.click();

        Thread.sleep(2000);

        // add to cart button
        WebElement addToCartButton = driver.findElement(By.xpath("//*[@class='btn btn-success btn-lg']\n"));
        addToCartButton.click();

        Thread.sleep(2000);
        
        // close popup
        Alert alert = driver.switchTo().alert();
        alert.accept();

        // click on cart
        WebElement cart = driver.findElement(By.id("cartur"));
        cart.click();

        // place order button
        WebElement placeOrder = driver.findElement(By.xpath("//button[normalize-space()='Place Order']"));
        placeOrder.click();

        // place order form
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("go60");

        WebElement country = driver.findElement(By.id("country"));
        country.sendKeys("Nminia");

        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Windhoek");

        WebElement creditCart = driver.findElement(By.id("card"));
        creditCart.sendKeys("5256624625822");

        WebElement month = driver.findElement(By.id("month"));
        month.sendKeys("February");

        WebElement year = driver.findElement(By.id("year"));
        year.sendKeys("2024");

        WebElement purchaseButton = driver.findElement(By.xpath("//button[normalize-space()='Purchase']"));
        purchaseButton.click();

        Thread.sleep(3000);

        //close order confirmation dialog
        WebElement closeDialog = driver.findElement(By.xpath("//button[normalize-space()='OK']"));
        closeDialog.click();









    }
}
