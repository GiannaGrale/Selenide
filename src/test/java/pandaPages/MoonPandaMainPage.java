package pandaPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;

import static com.codeborne.selenide.Selenide.$;

public class MoonPandaMainPage {

    private final SelenideElement downRollBtn = $(".fa-angle-down");
    private final SelenideElement pageTitle = $(By.xpath("//div[@class='col-lg-12 wow fadeIn']/h1"));
    private final SelenideElement aboutBtn = $(By.xpath("//ul/li[7]/a"));
    private final SelenideElement startBtn = $(".brand-name-subtext .btn-outline-light");

    public MoonPandaMainPage clickDownRollBtn() {
        downRollBtn.click();
        return this;
    }
    public SelenideElement getPageTitle() {
        return $(pageTitle);
    }

    public MoonPandaAboutPage clickAboutBtn() {
        aboutBtn.click();
        return new MoonPandaAboutPage();
    }

    public MoonPandaLoginPage clickStartBtn (){
        startBtn.click();
        return new MoonPandaLoginPage();
    }
}
