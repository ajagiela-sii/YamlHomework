import Configuration.AllProperties;
import Configuration.DriverHandle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {
    private static Logger logger = LoggerFactory.getLogger(TestBase.class);

    public WebDriver driver;
    private static DriverHandle driverHandle;
    private static AllProperties allProperties;

    @BeforeAll
    static void setUp() {
        allProperties = AllProperties.getInstance();
        driverHandle = new DriverHandle();
    }

    @BeforeEach
    void beforeEach() {
        driver = driverHandle.getDriver();
        logger.info("**** Driver initialized ****");
        driver.get(System.getProperty("app_url"));
        logger.info("Go to url: " + System.getProperty("app_url"));
    }

    @AfterEach
    void tearDown() {
        try {
            driver.quit();
            logger.info("Web driver closed successfully");
        } catch (Exception e) {
            logger.error("The web driver has not been closed! " + e);
        }
    }

}
