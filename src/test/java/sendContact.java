import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SendContact {
    @Test
    public static void contact() throws InterruptedException {

        String expectedTitle = "STORE";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/index.html");
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        
        //contact form
        WebElement contact = driver.findElement(By.xpath("//a[normalize-space()=" +
                "'Contact']"));
        contact.click();

        // filling contact form
        WebElement contactEmail = driver.findElement(By.id("recipient-email"));
        contactEmail.sendKeys("cdfvd@vfbg.com");

        //filling contact name
        WebElement contactName = driver.findElement(By.id("recipient-name"));
        contactName.sendKeys("go60_go");

        // filling message
        WebElement message = driver.findElement(By.id("message-text"));
        message.sendKeys("This is testing message!");

        // send message button
        WebElement messageButton = driver.findElement(By.xpath("//button[normalize-space()=" +
                "'Send message']"));
        messageButton.click();

        Thread.sleep(2000);

        // close pop up message
        Alert alert = driver.switchTo().alert();
        alert.accept();




    }
}
