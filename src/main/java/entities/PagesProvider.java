package entities;

import org.openqa.selenium.WebElement;
import pages.TestPageAuthForm;

public class PagesProvider {

    private static TestPageAuthForm pageAuthForm;

    public static WebElement getElementOnPage (String nameOfPage, String nameOfElement) {

        WebElement webElement = null;

        switch (nameOfPage){
            case "Страница_авторизации":
                webElement = pageAuthForm.get(nameOfElement);
        }
        return webElement;

    }
}
