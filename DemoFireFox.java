/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

/**
 *
 * @author hp
 */
public class DemoFireFox {
    
    
    public static void demoWithFireFox(){
        
        System.out.println("Demo With FireFox");
        
        // SETTING THE CHROME DRIVER
        System.setProperty("webdriver.gecko.driver", "E:\\Home School\\SELENIUM\\introduction\\Intro\\src\\com\\selenium\\introduction\\rsc\\geckodriver.exe");
        
        FirefoxProfile profile = new FirefoxProfile();
        String user_agent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:81.0) Gecko/20100101 Firefox/81.0";
        profile.setPreference("general.useragent.override", user_agent);
        
        FirefoxOptions options = new FirefoxOptions().setProfile(profile);

        // CREATE WEBDRIVER (WebDriver is an Interface) OBJECT FOR BROWSER...
        WebDriver var_firefoxDriver = new FirefoxDriver(options);
        
        //RUN THE BROWSER AND NAVIGATE TO THE GIVEN WEBSITE
        var_firefoxDriver.get("http://google.com");
        
        // GET BROWSER'S TITLE
        System.out.println("PAGE TITLE: "+var_firefoxDriver.getTitle());
       
    }
}
