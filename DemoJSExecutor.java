/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.introduction;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author hp
 */
public class DemoJSExecutor {
    
    public static void demoJSExecutor(String url){
        
        WebDriver WD = RunChromeDriver.REYBOT_start(url);
        
        // JAVASCRIPT EXECUTOR
        JavascriptExecutor js = (JavascriptExecutor)WD;
        
        // DEFINE THE SCRIPT
        String myAlert = "alert(\"JAVASCRIPT EXECUTED\");";
        
        // EXECUTE THE SCRIPT
        js.executeScript(myAlert);
        
        
        
    }
}
