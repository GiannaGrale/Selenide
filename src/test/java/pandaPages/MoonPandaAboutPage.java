package pandaPages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MoonPandaAboutPage {

    private final SelenideElement startTrackingMoodBtn = $(".btn-outline-light");

    public SelenideElement getStartTrackMoodBtnText() {
        return $(startTrackingMoodBtn);
    }

}
