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

    @Test
    public void shouldReturnVIGiven6() {
        String roman = romanNumerals.roman(6);
        assertThat(roman, is("VI"));
    }

    @Test
    public void shouldReturnVIIGiven7() {
        String roman = romanNumerals.roman(7);
        assertThat(roman, is("VII"));
    }

    @Test
    public void shouldReturnVIIIGiven8() {
        String roman = romanNumerals.roman(8);
        assertThat(roman, is("VIII"));
    }

    @Test
    public void shouldReturnIXGiven9() {
        String roman = romanNumerals.roman(9);
        assertThat(roman, is("IX"));
    }

    @Test
    public void shouldReturnXGiven10() {
        String roman = romanNumerals.roman(10);
        assertThat(roman, is("X"));
    }

    @Test
    public void shouldReturnXIIIGiven13() {
        String roman = romanNumerals.roman(13);
        assertThat(roman, is("XIII"));
    }
}
