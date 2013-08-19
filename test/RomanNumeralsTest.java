import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RomanNumeralsTest {

    private RomanNumerals romanNumerals;

    @Before
    public void setUp() throws Exception {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void shouldReturnIGiven1() {
        String roman = romanNumerals.roman(1);
        assertThat(roman, is("I"));
    }

    @Test
    public void shouldReturnIIGiven2() {
        String roman = romanNumerals.roman(2);
        assertThat(roman, is("II"));
    }

    @Test
    public void shouldReturnIIIGiven3() {
        String roman = romanNumerals.roman(3);
        assertThat(roman, is("III"));
    }

    @Test
    public void shouldReturnIVGiven4() {
        String roman = romanNumerals.roman(4);
        assertThat(roman, is("IV"));
    }

    @Test
    public void shouldReturnVGiven5() {
        String roman = romanNumerals.roman(5);
        assertThat(roman, is("V"));
    }
}
