package Pages;

import org.openqa.selenium.By;

public class HomePages {
    // IPF = Input Field
    public static By objUsernameIPF = By.xpath("//input[@id='txtUsername']");

    public static By objPasswordIPF = By.xpath("//input[@id='txtPassword']");

    public static By objLoginCTA = By.xpath("//input[@id='btnLogin']");

    public static By objSoftwareEngineerCheckbox = By.xpath("//input[@id='ohrmList_chkSelectRecord_19_1']");

    public static By objRecruitmentTab = By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']");

    public static By objAddCTA = By.xpath("//input[@id='btnAdd']");

    public static By objAddCanditateForm = By.xpath("//form[@id='frmAddCandidate']");

    public static By objFirstNameIPF = By.xpath("//input[@id='addCandidate_firstName']");

    public static By objLastNameIPF = By.xpath("//input[@id='addCandidate_lastName']");

    public static By objEmailIPF = By.xpath("//input[@id='addCandidate_email']");

    public static By objJobVacancyDropDown = By.xpath("//select[@id='addCandidate_vacancy']");

    public static By objJVDropDownValue = By.xpath("//option[text()='Software Engineer']");

    public static By objResumeChooseFile = By.xpath("//input[@id='addCandidate_resume']");

    public static By objCommentIPF = By.xpath("//textarea[@id='addCandidate_comment']");

    public static By objDateIPF = By.xpath("//input[@id='addCandidate_appliedDate']");

    public static By objSaveCTA = By.xpath("//input[@id='btnSave']");
    public static By objFadableSuccessMessage = By.xpath("//div[@class='message success fadable']");

    public static By objDashboardTab = By.xpath("//a[@id='menu_dashboard_index']");

    public static By objDashboardPage = By.xpath("//div[@id='group_0']");







}
