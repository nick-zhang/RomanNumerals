import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {
    @Test
    public void shouldReturnIGiven1() {
        RomanNumerals romanNumerals= new RomanNumerals();
        String roman = romanNumerals.roman(1);
        assertThat(roman, is("I"));
    }
}
