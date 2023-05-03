package com.example.day274.task1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CC1_1 {
	public static void main(String[] ghjk) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	    Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Nantha");
		driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Sudarsan");
		driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("624001");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		
		
		String atit = driver.getTitle();
		Assert.assertEquals(atit,"Swag Labs");
		
		String aurl = driver.getCurrentUrl();
		Assert.assertEquals(aurl,"https://www.saucedemo.com/checkout-step-two.html");
		
		Thread.sleep(2000);
		driver.quit();
	}
}