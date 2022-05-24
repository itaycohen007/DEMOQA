package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalculatorCss {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Test start");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\src\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/conversion-calculator.html");
        System.out.println("Try to handle table as example");
        WebElement table = driver.findElement(By.name("calForm"));
        List<WebElement>  rows = table.findElements(By.tagName("tr"));

        System.out.println("test end");

    }
}