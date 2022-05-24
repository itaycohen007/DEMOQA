package Tests;

import okhttp3.Address;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Test start");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\src\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        WebElement FullName = driver.findElement(By.id("userName"));
        FullName.click();
        FullName.clear();
        FullName.sendKeys("ITAY COHEN");

        WebElement Email = driver.findElement(By.id("userEmail"));
        Email.click();
        Email.clear();
        Email.sendKeys("itay371@walla.com");

        WebElement address = driver.findElement(By.id("currentAddress"));
        address.click();
        address.clear();
        address.sendKeys("eilat");

        WebElement address2 = driver.findElement(By.id("permanentAddress"));
        address2.sendKeys("ISRAEL");

        WebElement submit = driver.findElement(By.id("submit"));
        submit.submit();

        Thread.sleep(5000);
        driver.close();
        System.out.println("Test end");


    }

}
