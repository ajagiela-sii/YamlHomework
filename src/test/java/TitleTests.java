import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TitleTests extends TestBase {

    @Test
    @Tag("regresja")
    @DisplayName("Checking title for web")
    void checkTitleForWeb() {
        String actualTitle = driver.getTitle();
        assertThat(actualTitle).isEqualTo(System.getProperty("title"));
    }
}
