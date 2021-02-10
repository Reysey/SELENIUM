/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.introduction;

import java.time.Duration;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/**
 *
 * @author hp
 */
public class FluentWaitTest {
    
    public static void FluentWaitTest(){
        
        System.setProperty("webdriver.chrome.driver", "E:\\Home School\\SELENIUM\\introduction\\Intro\\src\\com\\selenium\\introduction\\rsc\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.cssSelector("[id='start'] button")).click();
        
        Wait <WebDriver> wait = new FluentWait <WebDriver> (driver)
                                    .withTimeout(Duration.ofSeconds(30))
                                    .pollingEvery(Duration.ofSeconds(3))
                                    .ignoring(NoSuchElementException.class);
        
        WebElement foo = wait.until(new Function <WebDriver, WebElement> (){
            @Override
            public WebElement apply(WebDriver t) {
                if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()){
                    return driver.findElement(By.cssSelector("[id='finish'] h4"));
                }else return null;
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
    }
    
}
