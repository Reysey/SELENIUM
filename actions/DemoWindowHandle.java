/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.introduction.actions;

import com.selenium.introduction.RunChromeDriver;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author hp
 */
public class DemoWindowHandle {
    public static void demoWindowHandle(String url){
    
        WebDriver WD = RunChromeDriver.REYBOT_start(url);
        
        // FIND ELEMENT AND CLICK ON IT
        WD.findElement(By.xpath("/html/body/div[1]/div[1]/footer/ul/li[1]/a")).click();
        
        // PRINT ACTIVE WEB PAGE TITLE
        System.out.println(WD.getTitle());
        
        Set<String> tabsIds = WD.getWindowHandles();
        
        // SELECT THE SECOND ELEMENT IN THE SET tabsids
            // CREATE AN ITERATOR TO LOOP THROUGH THE SET tabsIds
            Iterator<String> vIterator = tabsIds.iterator();
            
            //NOTE THE ITERATOR START FROM AN OFFSET POSITION
            
            // SELECT PARENT ID
            String parentId = vIterator.next();
            
            // SELECT CHILD  ID
            String childId = vIterator.next();
            
            WD.switchTo().window(childId);
            
        // PRINT ACTIVE WEB PAGE TITLE
        System.out.println(WD.getTitle());
            
            // SWITCH BACK TO THE PARENT TAB
            WD.switchTo().window(parentId);
            System.out.println(WD.getTitle());
    }   
    
}













