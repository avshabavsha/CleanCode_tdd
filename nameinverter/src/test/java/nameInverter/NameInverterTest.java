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

    private String invertName(String name) {
        if (name == null || name.length() <= 0)
            return "";
        else
            return formatName(removeHonorifics(splitNames(name)));
    }

    private String formatName(List<String> names) {
        if(names.size() == 1) {
            return names.get(0);
        }else {
            return formatMuliElementName(names);
        }
    }

    private String formatMuliElementName(List<String> names) {
        String postNominal  ="";
        if(names.size() > 2)
            postNominal = getPostNominals(names);
        return String.format("%s, %s %s", names.get(1), names.get(0), postNominal).trim();
    }

    private List<String> removeHonorifics(List<String> names) {
        if (names.size() > 1 && isHonorific(names.get(0)))
            names.remove(0);
        return names;
    }

    private String getPostNominals(List<String> names) {
        List<String> postNominals;
        postNominals = names.subList(2, names.size());
        String postNominal = "";
        for (String pn :postNominals) {
            postNominal += pn + " ";
        }
        return postNominal;
    }

    private boolean isHonorific(String word) {
        return word.matches("Mr\\.|Mrs\\.");
    }

    private ArrayList<String> splitNames(String name) {
        return new ArrayList<String>(Arrays.asList(name.trim().split("\\s+")));
    }

}
