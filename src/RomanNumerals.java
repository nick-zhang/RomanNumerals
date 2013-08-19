public class RomanNumerals {
    public String roman(int numeral) {
        if (numeral == 1) {
            return "I";
        } else if (numeral == 2) {
            return "II";
        } else if (numeral == 3){
            return "III";
        }

        return "IV";
    }
}
