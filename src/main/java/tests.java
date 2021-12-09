/*Uzd.1
1.) Atvrt BTA majas lapu - https://www.bta.lv/lv;
2.) Nospiest "Atļaut" uz popUp loga
3.) Uzklikskinat uz apdrosinasanas pakalpojomu: "KASKO un OCTA";
4.) Ievadit Auto registracijas nr.: KZ1392;
5.) Registracijas apliecibas nr.: AF2422572;
6.) Iekekst checkbox "Esmu iepazinies un piekritu" - Nesanāk
7.) Nospiest uz "Sanemt piedavajumu"

How to run:
        1.) Palaist IntelliIJ IDEA;
        2.) Sakonfigurt POM failu, lai būtu iespja lietot Selenide;
        3.) Selenide testus sarakstīju 3-os fajlos:
        - SelBTA - browser konfigurācija
        - tests - paši "Selenide" testi, kuri tiks palaisti pc kārtas;
        - testu skripti
            Atvrt class "tests";
        4.) Nospiest uz zaļo podziņu: "Run 'tests'".
 */

import org.junit.jupiter.api.Test;

public class tests extends SelBTA {

    private final static String BASE_URL = "https://www.bta.lv";
    private final static String SEARCH_STRING = "Atļaut";
    private final static String SEARCH_OFFER = "OCTA un KASKO";

    @Test
    public void checkHref() {
        MainPage mainPage = new MainPage(BASE_URL);
        mainPage.clickOnApprove();
        mainPage.buttonOctaUnKasko();
        mainPage.setInputAutoRegNr();
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainPage.setInputRegAplNr();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
