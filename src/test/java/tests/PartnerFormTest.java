package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PartnerFormTest {

    @Test
    @Tag("web")
    public void CanOpenPartnerPageTest(){
        open("https://partner.detmir.market/form");
    }
}
