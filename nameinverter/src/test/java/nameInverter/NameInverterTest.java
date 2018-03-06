package nameInverter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        assertInverted("", null);
    }

    @Test
    public void givenEmptyString_ReturnsEmptyString() throws Exception {
        assertInverted("", "");
    }

    @Test
    public void givenSimpleName_returnSimpleName() throws Exception {
        assertInverted("Name", "Name");
    }

    @Test
    public void givenFirstLast_returnLastFirst() throws Exception {
        assertInverted("Last, First", "First Last" );
    }

    @Test
    public void givenFirstLastWithExtraSpaces_returnLastFirst() throws Exception {
        assertInverted("Last, First", "  First  Last   " );
    }

    @Test
    public void ignoreHonorific() throws Exception {
        assertInverted("Last, First", "Mr. First Last" );
    }

    private String invertName(String name) {
        if (name == null || name.length() <= 0) {
            return "";
        }else{
            List<String> names = new ArrayList<String>(Arrays.asList(name.trim().split("\\s+")));//split the name on more than one white space
            if (names.size() > 1 && names.get(0).equals("Mr.")){
                names.remove(0);
            }
            if(names.size() == 1) {
                return names.get(0);
            }else {
                return String.format("%s, %s", names.get(1), names.get(0));
            }
        }
    }

}
