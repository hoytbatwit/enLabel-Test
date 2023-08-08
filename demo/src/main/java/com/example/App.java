package com.example;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class App {
    /**
     * An automated test to ensure that all pages listed in the menu 
     * of https://www.enlabel.com/ load properly
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //instantiate objects
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //get enLabel website
        driver.get("https://www.enlabel.com/");

        //Get About Us Drop down Menu
        WebElement menuItem1 = driver.findElement(By.linkText("About Us"));
        //Careers Drop Down
        actions.moveToElement(menuItem1).perform();
        WebElement careers = driver.findElement(By.linkText("Careers"));
        careers.click();
        //allow 3 seconds to ensure site loads succesfully before moving on
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        //Student Employment Drop Down
        menuItem1 = driver.findElement(By.linkText("About Us"));
        actions.moveToElement(menuItem1).perform();
        WebElement stuEmploy = driver.findElement(By.linkText("Student Employment"));
        stuEmploy.click(); 
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        //Quality Policy Drop Down
        menuItem1 = driver.findElement(By.linkText("About Us"));
        actions.moveToElement(menuItem1).perform();
        WebElement qualPol = driver.findElement(By.linkText("Quality Policy"));
        qualPol.click();
        //allow 3 seconds to ensure site loads succesfully before moving on
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        //Privacy Policy Drop Down
        menuItem1 = driver.findElement(By.linkText("About Us"));
        actions.moveToElement(menuItem1).perform();
        WebElement priPol = driver.findElement(By.linkText("Privacy Policy"));
        priPol.click();
        //allow 3 seconds to ensure site loads succesfully before moving on
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Test Media/Events
        WebElement menuItem2 = driver.findElement(By.linkText("Media/Events"));
        menuItem2.click();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Test Platform
        WebElement menuItem3 = driver.findElement(By.linkText("Platform"));
        actions.moveToElement(menuItem3).perform();
        WebElement ipm = driver.findElement(By.linkText("Integrated Packaging Management - IPM"));
        ipm.click();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        
        //no size did not work
        menuItem3 = driver.findElement(By.linkText("Platform"));
        actions.moveToElement(menuItem3);
        WebElement elabel = driver.findElement(By.cssSelector("a[title='e-Labeling / eIFU']"));
        try{
            elabel.click();
        }catch(Exception e){
            System.out.println(e);
        }

        //no size could not click
        menuItem3 = driver.findElement(By.linkText("Platform"));
        actions.moveToElement(menuItem3);
        WebElement cloud = driver.findElement(By.cssSelector("a[title='enLabel Cloud/Software as a Service']"));
        System.out.println(cloud.getSize());
        try{
            cloud.click();
        }catch(Exception e){
            System.out.println(e);
        }
        

        //Test Services
        WebElement menuItem4 = driver.findElement(By.linkText("Services"));
        actions.moveToElement(menuItem4).perform();
        WebElement sdlc = driver.findElement(By.linkText("Software Development Life Cycle"));
        sdlc.click();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        menuItem4 = driver.findElement(By.linkText("Services"));
        actions.moveToElement(menuItem4).perform();
        WebElement bp = driver.findElement(By.linkText("Best Practices"));
        bp.click();
        try{
             Thread.sleep(3000);
        }catch (Exception e){
             e.printStackTrace();
        }

        menuItem4 = driver.findElement(By.linkText("Services"));
        actions.moveToElement(menuItem4);
        WebElement cm = driver.findElement(By.linkText("Consolidation & Migration"));
        System.out.println(cm.getSize());
        cm.click();
        try{
             Thread.sleep(3000);
        }catch (Exception e){
             e.printStackTrace();
        }

        menuItem4 = driver.findElement(By.linkText("Services"));
        actions.moveToElement(menuItem4);
        WebElement train = driver.findElement(By.linkText("Training"));
        train.click();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        WebElement imp = driver.findElement(By.linkText("Implementation"));
        imp.click();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        WebElement vv = driver.findElement(By.linkText("Verification and Validation"));
        vv.click();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        WebElement supp = driver.findElement(By.linkText("24/7 Support"));
        supp.click();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Compliance
        WebElement menuItem5 = driver.findElement(By.linkText("Compliance"));
        actions.moveToElement(menuItem5);
        WebElement udi = driver.findElement(By.cssSelector("a[title='Unique Device Identification Information']"));
        try{
            wait.until(ExpectedConditions.elementToBeClickable(udi));
            udi.click();
        }catch (Exception e){
            e.printStackTrace();
        }

        menuItem5 = driver.findElement(By.linkText("Compliance"));
        actions.moveToElement(menuItem5);
        WebElement comp = driver.findElement(By.cssSelector("a[title='Part 11 Information']"));
        try{
            wait.until(ExpectedConditions.elementToBeClickable(comp));
            comp.click();
        }catch (Exception e){
            e.printStackTrace();
        }

        menuItem5 = driver.findElement(By.linkText("Compliance"));
        actions.moveToElement(menuItem5);
        WebElement ghs = driver.findElement(By.cssSelector("a[title='Globally Harmonized System Information']"));
        try{
            wait.until(ExpectedConditions.elementToBeClickable(ghs));
            ghs.click();
        }catch (Exception e){
            e.printStackTrace();
        }

        menuItem5 = driver.findElement(By.linkText("Compliance"));
        actions.moveToElement(menuItem5);
        WebElement it = driver.findElement(By.cssSelector("a[title='Industry Trends']"));
        try{
            wait.until(ExpectedConditions.elementToBeClickable(it));
            it.click();
        }catch (Exception e){
            e.printStackTrace();
        }

        menuItem5 = driver.findElement(By.linkText("Compliance"));
        actions.moveToElement(menuItem5);
        WebElement local = driver.findElement(By.cssSelector("li[class='last leaf menu-mlid-4011']"));
        try{
            wait.until(ExpectedConditions.elementToBeClickable(local));
            local.click();
        }catch (Exception e){
            e.printStackTrace();
        }

        //Partners
        WebElement menuItem6 = driver.findElement(By.linkText("Partners"));
        actions.moveToElement(menuItem6);
        menuItem6.click();
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        //Resources
        WebElement menuItem7 = driver.findElement(By.linkText("Resources"));
        actions.moveToElement(menuItem7);
        WebElement wp = driver.findElement(By.cssSelector("li[class='first leaf menu-mlid-14919']"));
        try{
            wait.until(ExpectedConditions.elementToBeClickable(wp));
            wp.click();
        }catch (Exception e){
            e.printStackTrace();
        }

        actions.moveToElement(menuItem7);
        WebElement cs = driver.findElement(By.cssSelector("a[title='Contact Form']"));
        try{
            wait.until(ExpectedConditions.elementToBeClickable(cs));
            cs.click();
        }catch (Exception e){
            e.printStackTrace();
        }
        
        driver.close();
    }
}
