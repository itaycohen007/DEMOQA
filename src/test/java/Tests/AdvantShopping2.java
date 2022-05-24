package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.PrintStream;
import java.util.List;

public class AdvantShopping2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("test start");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\src\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://advantageonlineshopping.com/#/category/Speakers/4");
        List<WebElement> prices = driver.findElements(By.className("imgProduct"));
        WebElement price = (WebElement) prices.get(1);
        String value = price.getText();
        price.click();

        for (WebElement webElement : prices) {
            PrintStream var10000 = System.out;
            var10000.println("the price is:" + ((WebElement) webElement).getText());
        }

        driver.close();
        System.out.println("test end");
    }

}
