package com.kata.tdd;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanConverter {

    private Map<Integer, String> arabicToRomansDictionary = new LinkedHashMap<Integer, String>() {
        {
            put(1000, "M");
            put(900, "CM");
            put(500, "D");
            put(400, "CD");
            put(100, "C");
            put(90, "XC");
            put(50, "L");
            put(40, "XL");
            put(10, "X");
            put(9, "IX");
            put(5, "V");
            put(4, "IV");
            put(1, "I");
        }
    };

    public String convert(int number) {

        String result = "";
        Iterator<Map.Entry<Integer, String>> arabicToRomans = arabicToRomansDictionary.entrySet().iterator();

        while (arabicToRomans.hasNext()) {

            Map.Entry<Integer, String> arabicToRoman = arabicToRomans.next();
            int arabicNumeral = arabicToRoman.getKey();
            String romanNumeral = arabicToRoman.getValue();

            while (number >= arabicToRoman.getKey()) {
                result += romanNumeral;
                number -= arabicNumeral;
            }
        }

        return result;
    }
}
