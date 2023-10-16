import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class RomanNumeralTest {
    @Test
    public void singleDigit() {
        Assertions.assertEquals(1, new RomanNumeral().romanToInt("I"));
        Assertions.assertEquals(5, new RomanNumeral().romanToInt("V"));
        Assertions.assertEquals(10, new RomanNumeral().romanToInt("X"));
        Assertions.assertEquals(50, new RomanNumeral().romanToInt("L"));
        Assertions.assertEquals(100, new RomanNumeral().romanToInt("C"));
        Assertions.assertEquals(500, new RomanNumeral().romanToInt("D"));
        Assertions.assertEquals(1000, new RomanNumeral().romanToInt("M"));
    }

    @Test
    public void manyLettersInOrder() {
        Assertions.assertEquals(15, new RomanNumeral().romanToInt("XV"));
        Assertions.assertEquals(150, new RomanNumeral().romanToInt("CL"));
        Assertions.assertEquals(1500, new RomanNumeral().romanToInt("MD"));
    }

    @Test
    public void testSubtractiveNotation() {
        Assertions.assertEquals(9, new RomanNumeral().romanToInt("IX"));
        Assertions.assertEquals(90, new RomanNumeral().romanToInt("XC"));
        Assertions.assertEquals(900, new RomanNumeral().romanToInt("CM"));
    }

    @Test
    public void testWithAndWithoutSN() {
        Assertions.assertEquals(95, new RomanNumeral().romanToInt("XCV"));
    }

    @Test
    public void repetition() {
        Assertions.assertEquals(3, new RomanNumeral().romanToInt("III"));
        Assertions.assertEquals(30, new RomanNumeral().romanToInt("XXX"));
        Assertions.assertEquals(300, new RomanNumeral().romanToInt("CCC"));
    }

     @Test
    public void testFirstNumberI() {
        Assertions.assertEquals(1, new RomanNumeral().romanToInt("I"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidAndValidLetter() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new RomanNumeral().romanToInt("XIZ"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotValid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new RomanNumeral().romanToInt("XIZ"));
    }

    @Test
    public void testNull() {
        Assertions.assertThrows(NullPointerException.class, () -> new RomanNumeral().romanToInt(null));
    }
}