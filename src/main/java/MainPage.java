import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/* Main page of BTA

 */
public class MainPage {
    private final SelenideElement approveButton = $x("//*[@id=\"module-284\"]/div[1]/div[2]/button[2]");
    private final SelenideElement octaUnKasko = $x("//*[@id=\"module-28\"]/div/div/div[3]/a[1]/h4");
    private final SelenideElement inputAutoRegNr = element(By.name("plateNumber"));
    private final SelenideElement inputRegAplNr = element(By.name("vehicleOwnerIdentification"));
    //private final SelenideElement checkBox = element(By.className("checkbox invalid untouched"));


    public MainPage (String url){
        Selenide.open(url);
    }
    public void clickOnApprove(){
        approveButton.click();
    }
    public void buttonOctaUnKasko(){
        octaUnKasko.click();
    }
    public void setInputAutoRegNr(){
        inputAutoRegNr.setValue("KZ1392");
    }
    public void setInputRegAplNr(){
        inputRegAplNr.setValue("AF2422572");
    }

}
