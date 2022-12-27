package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class Main {
@Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/ds0522/Documents/BOOTCAMP/AutomationBootcamp/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //SR-12111 Go to categories
    driver.findElement(By.linkText("Nokia lumia 1520")).click();
    //SR-12120 Add to cart
    driver.findElement(By.linkText("Add to cart")).click();
    Thread.sleep(2000);
    Alert simpleAlert = driver.switchTo().alert();
    System.out.println(simpleAlert.getText());
    Thread.sleep(2000);
    simpleAlert.accept();
    Thread.sleep(2000);
    //SR-2121 Clicking the cart link
    driver.findElement(By.id("cartur")).click();
    //SR-12130 Placing order
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();
    Thread.sleep(7000);
    driver.quit();

    }
}