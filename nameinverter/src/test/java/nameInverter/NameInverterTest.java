package nameInverter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by avshaloms on 04/03/2018.
 */
public class NameInverterTest {
    private NameInverter nameInverter;

    @Before
    public void setUp() throws Exception {
        nameInverter = new NameInverter();
    }

    private void assertInverted(String invertedName, String originalName) {
        assertEquals(invertedName, nameInverter.invertName(originalName));
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

    @Test
    public void ignoreHonorificMrs() throws Exception {
        assertInverted("Last, First", "Mrs. First Last" );
    }

    @Test
    public void postNominals_stayAtEnd() throws Exception {
        assertInverted("Last, First Sr.", "First Last Sr." );
        assertInverted("Last, First BS. Phd.", "First Last BS. Phd." ); //same logical assertion
    }

    @Test
    public void integration() throws Exception {
        assertInverted("Martin, Robert III esq.", "   Robert   Martin III esq.   ");
    }

}
