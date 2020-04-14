package entities;

import org.openqa.selenium.WebElement;
import pages.TestPageAuthForm;

public class PagesProvider {
//    private static TestPageAuthForm pageAuthForm;

    public static WebElement getElementOnPage (String nameOfPage, String nameOfElement, TestPageAuthForm pageAuthForm) {
        WebElement webElement = null;
        switch (nameOfPage){
            case "Страница_авторизации":
                webElement = pageAuthForm.get(nameOfElement);
                break;
            default: webElement=null;
        }
        return webElement;
    }
}
