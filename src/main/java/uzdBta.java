/*Uzd.2
        1.) Atvrt BTA majas lapu - https://www.bta.lv/lv;
        2.) Nospiest "Atļaut" uz popUp loga
        3.) Uzklikšķinat uz TAB: "Par BTA";
        4.) Uzklikšķinat uz "Aktuālās vakances", kas ir zem "Karjera BTA";
        5.) Atrast aktu'alo pozīciju: "Testu automatizēšanas speciālists/-e".

How to run:
        1.) Palaist IntelliIJ IDEA;
        2.) Sakonfigurt POM failu, lai būtu iespja lietot Selenide;
        3.) Selenide testus sarakstīju 3-os fajlos:
        - SelBTA - browser konfigurācija (tā pati konfigurācija no 1.uzdevuma)
        - uzdBta - paši "Selenide" testi, kuri tiks palaisti pc kārtas;
        - mainPage2 - testu skripti.
        Atvrt class "uzdBta";
        4.) Nospiest uz zaļo podziņu: "Run 'uzdBta'".
*/

import org.junit.jupiter.api.Test;

public class uzdBta extends SelBTA {

    private final static String BASE_URL = "https://www.bta.lv";
    private final static String SEARCH_STRING = "Atļaut";
    private final static String SEARCH_OFFER = "Par BTA";
    private final static String SEARCH_KARJERA = "Aktuālās vakances";
    private final static String SEARCH_POSITION = "Testu automatizēšanas speciālists/-e";

    @Test
    public void checkHref() {
        mainPage2 mainPage = new mainPage2(BASE_URL);
        mainPage.clickOnApprove2();
        mainPage.clickOnParBta();
        mainPage.clickOnJobPositions();
        mainPage.actualPosition();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}