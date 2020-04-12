package webdriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

/**
 *
 */
public class Properties {

    private static Logger log;

    /**
     *
     */
    public static void setProperties() {
        try{
            System.getProperties().load(ClassLoader.getSystemResourceAsStream("test.properties"));
            log = LogManager.getLogger(Properties.class);
            log.debug("Выполнено чтение настроек из файла .properties");
        } catch (IOException e) {
            System.setProperty("log.filename", "logs/test.log");
            System.setProperty("chrome.driver.path", "src/main/resources/drivers/chromedriver.exe");
            System.setProperty("gecko.driver.path", "src/main/resources/drivers/geckodriver.exe");
            System.setProperty("start-maximized", "false");
            System.setProperty("implicit.wait", "10");
            System.setProperty("explicit.wait", "10");
            System.setProperty("api.key", "special-key");

            log = LogManager.getLogger(Properties.class);
            log.error("Ошибка чтения настроек из файла .properties: {}", e.getMessage());
            log.debug("Установлены настройки по умолчанию");
        }
    }
}
