import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoblazeregister {
    @Test


public  static void demob(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");

        //signup button
        WebElement signUpButton = driver.findElement(By.xpath("//a[@id='signin2']"));
        signUpButton.click();

        // username
        WebElement username = driver.findElement(By.id("sign-username"));
        username.sendKeys("pe60");

        //pass
        WebElement pass = driver.findElement(By.id("sign-password"));
        pass.sendKeys("123456");

        // sign up button
        WebElement signUp = driver.findElement(By.xpath("//button[normalize-space()=" +
                "'Sign up']"));
        signUp.click();


    }
}
