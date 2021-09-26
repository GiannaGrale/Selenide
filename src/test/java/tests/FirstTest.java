package tests;

import baseEntities.BaseTest;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.testng.ScreenShooter;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.*;

//@Listeners({SoftAsserts.class})
@Listeners({ScreenShooter.class})
public class FirstTest extends BaseTest {
    LoginPage loginPage;
    ProductsPage productsPage;

  /*  @Test
    public void selenideTest() {
        org.apache.log4j.BasicConfigurator.configure();
        Logger logger = LoggerFactory.getLogger(FirstTest.class);

        open("/");

        //  open(ReadProperties.getInstance().getURL());
        $(By.id("user-name")).sendKeys("standard_user");
        $(By.id("password")).sendKeys("secret_sauce");
        $(By.id("login-button")).click();
        $(".title").shouldHave(text("PRODUCTS"));

        $(".title")
                .should(exist)
                .shouldBe(visible)
                .shouldHave(exactText("PRODUCTS"));
        $(".product_sort_container")
                .selectOptionByValue("za");


        SelenideElement inventoryList = $(".inventory_list");

        ElementsCollection list = inventoryList.findAll(".inventory_item_name");
        list
                .shouldHave(CollectionCondition.size(6))
                .exclude(exactText("hey"))
                .findBy(text("Sauce Labs Bike Light"))
                .should(exist)
                .click();

*//*
        $$(".inventory_item_name")
                .shouldHave(CollectionCondition.size(6))
                .findBy(text("Sauce Labs Bike Light"))
                .click();
        $(".inventory_details_back_button")
                .shouldBe(visible);*//*


        $(".inventory_details_back_button").shouldBe(visible);
        String text = $(".inventory_details_desc").getText();
        logger.error(text);

        $(".inventory_details_desc").shouldBe(visible).shouldBe(appear);
        $(".inventory_details_desc").shouldBe(hidden).shouldBe(exist);
        $(".inventory_details_desc").shouldBe(readonly);
        $(".inventory_details_desc").shouldHave(name("name"));
        $(".inventory_details_desc").shouldHave(value("2345"));
        $(".inventory_details_desc").shouldHave(type("checkbox"));
        $(".inventory_details_desc").shouldHave(id("checkbox"));
        $(".inventory_details_desc").shouldBe(empty);
        $(".inventory_details_desc").shouldHave(matchText("qwd"));

        $(byText(""));
        $(byXpath(""));
        $(byTitle(""));
        $(byValue(""));

        isChrome();
        url();
        source();
        getWebDriver();


    }
*/
    @Test
    public void secondSelenideTest() {
        loginPage = open("/", LoginPage.class);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
        productsPage = loginPage.successLoginBtn();

        productsPage.getProductsTitle()
                .should(exist)
                .shouldBe(visible)
                .shouldHave(exactText("PRODUCTS"));

    }
}
