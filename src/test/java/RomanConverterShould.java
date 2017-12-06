import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RomanConverterShould {

    @Test
    @Parameters({
            "1, I",
            "2, II",
            "3, III",
            "4, IV"})
    public void convertNumberToRoman(int number, String expected) {
        RomanConverter romanNumeral = new RomanConverter();
        assertThat(romanNumeral.convert(number), is(expected));
    }

    public class RomanConverter {

        //private String[] results = new String[]{"I","II","III"}; //Adding IV to array introduce a duplication of I

        private HashMap<Integer, String> results = new HashMap<Integer, String>()
        {
            {
                put(1, "I");
                put(2, "II");
                put(3, "III");
                put(4, "IV");
            }
        };

        public String convert(int number) {
            return results.get(number);
        }
    }
}
