package pages;

import com.codeborne.selenide.SelenideElement;
import core.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    @FindBy(how = How.ID, using = "user-name")
    private SelenideElement username;

    private final static String endpoint = "/";

  //  private final static By usernameSelector = By.id("user-name");
    private final static By passwordSelector = By.id("password");
    private final static By loginBtnSelector = By.id("login-button");
    private final static By errorMessageSelector = By.cssSelector(".error-message-container.error h3");


 /*   public SelenideElement getUsernameField() {
        return $(usernameSelector);
    }*/

    public SelenideElement getPasswordField() {
        return $(By.id("password"));
    }

    public SelenideElement getLoginButton() {
        return $(loginBtnSelector);
    }

    public SelenideElement getErrorMessage() {
        return $(errorMessageSelector);
    }

    // Атомарные методы
    public LoginPage setUsername(String username) {
        this.username.sendKeys(username);

        return this;
    }

    public LoginPage setPassword(String password) {
        getPasswordField().sendKeys(password);
        return this;
    }

    public LoginPage loginBtnClick() {
        getLoginButton().click();
        return this;
    }

    public ProductsPage successLoginBtn() {
        getLoginButton().click();
        return new ProductsPage();
    }
}


