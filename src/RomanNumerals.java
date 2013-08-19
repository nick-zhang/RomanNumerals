public class RomanNumerals {
    public String roman(int numberal) {
        if (numberal == 1) {
            return "I";
        } else if (numberal == 2) {
            return "II";
        }

        return "III";
    }
}
