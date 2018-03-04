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

    private String invertName(String name) {
        if (name == null || name.length() <= 0) {
            return "";
        }else{
            String names[] = name.split(" ");
            if(names.length == 2)
                return String.format("%s, %s", names[1], names[0]);
        }
        return name;
    }

}
