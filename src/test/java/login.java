import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
    @Test

  public static void log(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");

        // login button
        WebElement login =driver.findElement(By.id("login2"));
        login.click();


        WebElement username = driver.findElement(By.id("loginusername"));
        username.sendKeys("pe60");

        WebElement pass = driver.findElement(By.id("loginpassword"));
        pass.sendKeys("123456");

        // login button
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-" +
                "space()='Log in']"));
        loginButton.click();






    }
}
