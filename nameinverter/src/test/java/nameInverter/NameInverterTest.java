package nameInverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by avshaloms on 04/03/2018.
 */
public class NameInverterTest {

    private void assertInverted(String invertedName, String originalName) {
        assertEquals(invertedName, invertName(originalName));
    }

    @Test
    public void givenNull_ReturnsEmptyString() throws Exception {
        String invertedName = "";
        String originalName = null;
        assertInverted("", null);
    }

    @Test
    public void givenEmptyString_ReturnsEmptyString() throws Exception {
        assertInverted("", "");
    }


    private String invertName(String name) {
        return "";
    }

}
