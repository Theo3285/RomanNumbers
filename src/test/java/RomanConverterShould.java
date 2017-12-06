import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RomanConverterShould {

    @Test
    @Parameters(
            {
                    "1, I",
                    "2, II",
                    "3, III",
                    "4, IV",
                    "5, V",
                    "6, VI",
                    "7, VII",
                    "8, VIII",
                    "9, IX",
                    "10, X",
                    "40, XL",
                    "44, XLIV"
            })
    public void convertNumberToRoman(int number, String expected) {
        RomanConverter romanNumeral = new RomanConverter();
        assertThat(romanNumeral.convert(number), is(expected));
    }

    public class RomanConverter {

        private Map<Integer, String> results = new HashMap<Integer, String>() {
            {
                put(40, "XL");
                put(10, "X");
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
                put(1, "I");
            }
        };

        public String convert(int number) {

            if (results.containsKey(number)) {
                return results.get(number);
            }
            while (number >= 40) {
                String result = "XL";
                return result + convert(number - 40);
            }
            while (number >= 10) {
                String result = "X";
                return result + convert(number - 10);
            }
            while (number >= 5) {
                String result = "V";
                return result + convert(number -5);
            }
            return results.get(1) + convert(number - 1);
        }
    }
}
