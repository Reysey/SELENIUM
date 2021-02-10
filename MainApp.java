/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selenium.introduction;
import com.selenium.introduction.actions.DemoAction;
import com.selenium.introduction.actions.DemoFrames;
import com.selenium.introduction.actions.DemoWindowHandle;
import com.selenium.introduction.grid3.IntroToGrid3;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import org.testng.Assert;

/**
 *
 * @author hp
 */
public class MainApp {
    
    
    public static void main(String[] args){
        
        // DEMO WITH CHROME
        //DemoChrome.demoWithChrome();
        
        // DEMO WITH FIREFOX
        // DemoFireFox.demoWithFireFox();
        
        // DEMO WITH OPERA
        
        
        // DEMO WITH EXPLORER
        
        // DEMO FLUENT WAIT
        // FluentWaitTest.FluentWaitTest();
        
        // FACEBOOK MAIL CHECKER
            // String fb_url_identify         = "https://www.facebook.com/login/identify/";
            // String fb_url_initiate         = "https://www.facebook.com/recover/initiate/";
            // FacebookMailChecker.fbbmc_run(fb_url_identify, fb_url_initiate);
        
        // DEMO ACTION
            //String url = "https://www.amazon.com/";
            //DemoAction.demoAction(url);
            
            // String url ="https://accounts.google.com/signup";
            // DemoWindowHandle.demoWindowHandle(url);
            
        // DEMO FRAMES
            // String url = "https://jqueryui.com/droppable/";
            // DemoFrames.demoFrames(url);
        
            
        // DEMO GRID
            String url = "http://google.com";
        try {
            IntroToGrid3.introToGrid3(url);
        } catch (MalformedURLException ex) {
            Logger.getLogger(MainApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        /*
            
            try{
            Assert.assertFalse(false);
            Assert.assertEquals("TEXT", "TXT");
            }catch(AssertionError er){
            System.out.println("Error: "+er.getMessage());
            }
            
            */
    }
    
    
    // Methodes
    
    /**
     * 
     *      FIND ELEMENTS BY CSS SELECTORS
     * 
     * @ WebDriver.findElement(By.cssSelector("CSS-SELECTOR"))[.Functions]
     *  
     *      IMPLICIT WAIT TIME BEFORE EXITING...
     *  
     * @ WebDriver.manage().timeouts().implicitlyWait( INT NUMBER, TIMEUNIT TimeUnit.SECONDS);
     *  @ WebDriverWait wait = new WebDriverWait(driver, 5);
     *  > wait.until(ExpectedConditions.[condition])
     *  
     *      Fluent Wait
     *  @ Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
     *                               .withTimeout(Duration.ofSeconds(30))
     *                               .pollingEver(Duration.ofSeconds(3))
     *                               .ignoring(EXCEPTION.CLASS);
     *  > WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
     *      public WebElement apply(WebDriver driver){
     *          return driver.findElement(By.id("foo"));
     *      });
     *  }
     * 
     * 
     * 
     **/
    
}
