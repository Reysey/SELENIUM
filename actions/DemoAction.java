/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.introduction.actions;

import com.selenium.introduction.RunChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author hp
 */
public class DemoAction {
    
    public static void demoAction(String url){
        WebDriver WB = RunChromeDriver.REYBOT_start(url);
        
        Actions vActions = new Actions(WB);
        
        // DEFINE ELEMENT
        WebElement nav = WB.findElement(By.cssSelector("a[id='nav-link-accountList']"));
        
        
        // Moves To Specific Elements
        // vActions.moveToElement(WB.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
        
        // TYPE IN SEARCH BOX   twotabsearchtextbox
        // vActions.moveToElement(WB.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("HELLO").build().perform();;
        
        // TYPE IN SEARCH BOX AND DOUBLE CLICK
        vActions.moveToElement(WB.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("HELLO").doubleClick().build().perform();;
        
        // BUILD & PERFORM OUR ACTIONS SEQUENCE
        vActions.moveToElement(nav).contextClick().build().perform();
        
    }
    
    
}
