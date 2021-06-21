package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class PartnerFormTest extends TestBase{

    @Test
    @Tag("web")
    @DisplayName("Проверяем наличие формы \"Информация о поставщике\"")
    public void CanOpenPartnerPageTest(){
        step ("Открываем страницу для партнеров", ()-> {
            open("");
        });

    }
}
