/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.introduction;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author hp
 */
public class FacebookMailChecker {
    
    public static void fbbmc_run(String fb_url_identify, String fb_url_initiate){
        WebDriver WB = RunChromeDriver.REYBOT_start(fb_url_identify);
        
        /**
         * document.getElementById('identify_email').value = "m1r7@outlook.fr";
         * 
         * document.querySelectorAll('[name = "did_submit"]')[0].click();
         **/
    }
}
