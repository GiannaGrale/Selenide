package baseEntities;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import core.ReadProperties;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class BaseTest {

    @BeforeTest
    public static void setUpAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );

    }

    @BeforeSuite
    public void openBrowser() {
        Configuration.baseUrl = ReadProperties.getInstance().getPandaURL();
        Configuration.browser = ReadProperties.getInstance().getBrowserName();
        Configuration.startMaximized = true;
        Configuration.headless = true;
        Configuration.fastSetValue = true;
        //   Configuration.assertionMode = AssertionMode.SOFT;

    }
}
