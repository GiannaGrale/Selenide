package pandaPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MoonPandaLoginPage {

    private final SelenideElement passwordInput = $(By.id("ContentPlaceHolderContent_TextBoxPassword"));
    private final SelenideElement errorMessage = $(By.id("ContentPlaceHolderContent_MessageError"));
    private final SelenideElement loginBtn = $(By.id("ContentPlaceHolderContent_ButtonLogin"));


    public SelenideElement getPasswordInput() {
        return $(passwordInput);
    }
    public SelenideElement getErrorMessage() {
        return $(errorMessage);
    }
    public SelenideElement getLoginBtn() {
        return $(loginBtn);
    }
}
