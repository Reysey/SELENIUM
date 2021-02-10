/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.introduction.actions;

import com.selenium.introduction.RunChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author hp
 */
public class DemoFrames {
 
    public static void demoFrames(String url){
    
        WebDriver WD = RunChromeDriver.REYBOT_start(url);
        
        System.out.println("iframe size: ["+(WD.findElements(By.tagName("iframe")).size())+"]");
        
        // SWITCH / SELECT THE NEEDED FRAME 
        WD.switchTo().frame(0);


        // DECALRE THE ACTIONS VARIABLE
        Actions vAction = new Actions(WD);
        
        // GET THE DRAGGABLE ELEMENT
        WebElement source = WD.findElement(By.id("draggable"));
        
        // GET THE DROPPABLE ELEMENT
        WebElement target = WD.findElement(By.id("droppable"));
        
        
        // RUN THE ACTION OF DRAG AND DROP.
        vAction.dragAndDrop(source, target).build().perform();
        
        // COME BACK TO THE DEFAULT WINDOW
        WD.switchTo().defaultContent();
        
    }
}
