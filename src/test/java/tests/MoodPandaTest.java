package tests;

import baseEntities.BaseTest;
import core.ReadProperties;
import org.testng.annotations.Test;
import pandaPages.MoonPandaAboutPage;
import pandaPages.MoonPandaLoginPage;
import pandaPages.MoonPandaMainPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MoodPandaTest extends BaseTest {
    MoonPandaMainPage pandaMainPage;
    MoonPandaAboutPage aboutPagePage;
    MoonPandaLoginPage loginPage;

    @Test(description = "Check of a scroll down button on the main page")
    public void pandaTest() {
        pandaMainPage = open("/", MoonPandaMainPage.class);
        pandaMainPage.clickDownRollBtn();
        pandaMainPage.getPageTitle()
                .should(exist)
                .shouldBe(visible)
                .shouldHave(exactText("MOBILE & WEB APP FOR MOOD-TRACKING"));
    }

    @Test(description = "Check of scrolling to a visible text on the page")
    public void panda2Test(){
        pandaMainPage = open("/", MoonPandaMainPage.class);
        aboutPagePage = pandaMainPage.clickAboutBtn();
        aboutPagePage.getStartTrackMoodBtnText().scrollIntoView(true)
                .should(enabled)
                .shouldHave(text("Start tracking my mood"));
    }

    @Test(description = "Error message pop up while invalid try to sign in")
    public void panda3Test() {
        pandaMainPage = open("/", MoonPandaMainPage.class);
        loginPage = pandaMainPage.clickStartBtn();
        loginPage.getLoginBtn();
        loginPage.getPasswordInput().sendKeys(ReadProperties.getInstance().getWrongPswd());
        loginPage.getLoginBtn().click();
        loginPage.getErrorMessage()
                .should(exist)
                .shouldBe(visible)
                .shouldHave(exactText("Error: Could not find account. Forgot Password?"));

    }
}