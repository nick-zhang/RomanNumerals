import java.util.HashMap;

public class RomanNumerals {
    private final static HashMap<Integer, String> R_NUMERALS = new HashMap<Integer, String>();

    static {
        R_NUMERALS.put(1, "I");
        R_NUMERALS.put(2, "II");
        R_NUMERALS.put(3, "III");
        R_NUMERALS.put(4, "IV");
        R_NUMERALS.put(5, "V");
        R_NUMERALS.put(9, "IX");
        R_NUMERALS.put(10, "X");

    }

    public String roman(int numeral) {
        if (numeral > 10) {
            return R_NUMERALS.get(10) + R_NUMERALS.get(numeral - 10);
        }

        if (numeral > 5 && numeral < 9)
            return R_NUMERALS.get(5) + R_NUMERALS.get(numeral - 5);

        return R_NUMERALS.get(numeral);
    }
}
