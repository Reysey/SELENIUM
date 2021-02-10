/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @NAME MEHDISIGN
 * 
 * @author EL MEHDI ER-REYSEY
 * @e-mail MEHDIREYSEY@GMAIL.COM
 */
public class RunChromeDriver {
    
    public static WebDriver REYBOT_start(String url){
        
        System.out.println("Demo With Chrome");
        
        // SETTING THE CHROME DRIVER
        System.setProperty("webdriver.chrome.driver", "E:\\Home School\\SELENIUM\\introduction\\Intro\\src\\com\\selenium\\introduction\\rsc\\chromedriver.exe");

        // CREATE WEBDRIVER (WebDriver is an Interface) OBJECT FOR BROWSER...
        WebDriver var_chromeDriver = new ChromeDriver();
        
        //RUN THE BROWSER AND NAVIGATE TO THE GIVEN WEBSITE
        var_chromeDriver.get(url);
        // GET BROWSER'S TITLE
        // System.out.println("PAGE TITLE: "+var_chromeDriver.getTitle());
       
        return var_chromeDriver;
    }
}
