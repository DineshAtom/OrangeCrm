package Logic;

import Pages.HomePages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.SecureRandom;
import java.sql.Driver;
import java.time.Duration;

import static Logic.LaunchBrowser.*;



public class OrangeHomeLogic {
    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    static SecureRandom rGen = new SecureRandom();
@Test
/**
 * Method to login into application
 */
    public static void login(){
        driver.findElement(HomePages.objUsernameIPF).sendKeys("Admin");
        driver.findElement(HomePages.objPasswordIPF).sendKeys("admin123");
        driver.findElement(HomePages.objLoginCTA).click();
    }

    /**
     * Method to select recruitment role
     */
    public static void selectRecruitment(){
    driver.findElement(HomePages.objRecruitmentTab).click();
    driver.findElement(HomePages.objSoftwareEngineerCheckbox).click();
    driver.findElement(HomePages.objAddCTA).click();
    }

    /**
     * Method to fill recruitment form, save and verify details successfully saved by verifying  success alert popup
     * @throws InterruptedException
     */
    public static void fillRecruitmentForm() throws InterruptedException {
    // click recruitement tab
        wait.until(ExpectedConditions.presenceOfElementLocated(HomePages.objAddCanditateForm));
        //Fill Details into form
        driver.findElement(HomePages.objFirstNameIPF).sendKeys("Fname");
        driver.findElement(HomePages.objLastNameIPF).sendKeys("Lname");
        driver.findElement(HomePages.objEmailIPF).sendKeys("fname"+rGen.nextInt(10) + "@domain.com");
        //Select drop down
        driver.findElement(HomePages.objJVDropDownValue).click();
        driver.findElement(HomePages.objJVDropDownValue).click();
        // Upload file
        WebElement upload = driver.findElement(HomePages.objResumeChooseFile);
        upload.sendKeys("D:/Dine/Learn/Source/Learned Projects/Orange/Dummy file.txt");
        //Enter Comment
        driver.findElement(HomePages.objCommentIPF).sendKeys("Just a useless comment");
        //Enter date
        WebElement date = driver.findElement(HomePages.objDateIPF);
        date.clear();
        date.sendKeys("2022-05-26");
        date.submit();
        driver.findElement(HomePages.objSaveCTA).click();
        System.out.println("Submitted");
        // Verify alert message
        wait.until(ExpectedConditions.presenceOfElementLocated(HomePages.objFadableSuccessMessage));
        WebElement ele = driver.findElement(HomePages.objFadableSuccessMessage);
       String alertMessage = ele.getText();
        Assert.assertEquals(alertMessage,"Successfully Saved","Alert Message not displayed");
        System.out.println("Alert Messager is: "+ alertMessage);

        // Navigate to dashboard tab
        driver.findElement(HomePages.objDashboardTab).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(HomePages.objDashboardPage));
        System.out.println("==================== DONE ==============================");

    }

}
