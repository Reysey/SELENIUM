/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.introduction.grid3;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 *
 * @author hp
 */
public class IntroToGrid3 {
    
    public static void introToGrid3(String url) throws MalformedURLException{
        
        
        //
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");
        dc.setPlatform(Platform.WINDOWS);
        
        
        
        
        // SETTING THE CHROME DRIVER
        // System.setProperty("webdriver.chrome.driver", "E:\\Home School\\SELENIUM\\introduction\\Intro\\src\\com\\selenium\\introduction\\rsc\\chromedriver.exe");
        
        
        //
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.3:4444/wd/hub"), dc);
        driver.get(url);
    }
    
}
