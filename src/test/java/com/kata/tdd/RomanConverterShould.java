package com.kata.tdd;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

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
                    "50, L",
                    "90, XC",
                    "100, C",
                    "400, CD",
                    "500, D",
                    "900, CM",
                    "1000, M",
                    "846, DCCCXLVI",
                    "1999, MCMXCIX",
                    "2008, MMVIII"
            })
    public void convertNumberToRoman(int number, String expected) {
        RomanConverter romanNumeral = new RomanConverter();
        assertThat(romanNumeral.convert(number), is(expected));
    }
}
