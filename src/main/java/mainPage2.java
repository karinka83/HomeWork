import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class mainPage2 {
    private final SelenideElement approveButton2 = $x("//*[@id=\"module-284\"]/div[1]/div[2]/button[2]");
    private final SelenideElement searchParBta = $x("//*[@id=\"module-18\"]/ul/li[3]/button");
    private final SelenideElement aktualasVakances = element(By.linkText("Aktuālās vakances"));
    private final SelenideElement openPosition = element(By.partialLinkText("Testu automatizēšanas"));

    public mainPage2(String url) {
        Selenide.open(url);
    }

    public void clickOnApprove2() {
        approveButton2.click();
    }

    public void clickOnParBta() {
        searchParBta.click();
    }

    public void clickOnJobPositions() {
        aktualasVakances.click();
    }

    public void actualPosition() {
        openPosition.click();
    }
}

