package nameInverter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by avshaloms on 04/03/2018.
 */
public class NameInverterTest {

    @Test
    public void givenNull_ReturnsEmptyString() throws Exception {
        assertEquals("", invertName(null));
    }

    private String invertName(String name) {
        return "";
    }

}
