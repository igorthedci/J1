import io.qameta.allure.Step;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Config {

    public static Properties loadProperties(String properyFiles) {
        Properties config = new Properties();
        InputStream input;
        try {
            input = Config.class.getClassLoader().getResourceAsStream(properyFiles);
            config.load(input);
        } catch (Exception e) {
            System.out.println("File not found: " + properyFiles);
        }
        return config;
    }
}



public class BaseTest {

    public WebDriver driver;
    @Parameterized.Parameters("browser")
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser) {

    }
    // private final Properties config = Config.loadProperties("config.properties");
    driver.get(config.getProperty("baseurl"));
    driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);

    @Step
    public void attachFile() {

    }

    @Step
    public void pressSubmitButton() {

    }
}



