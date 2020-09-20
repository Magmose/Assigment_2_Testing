package converter;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class StringutilityTest {


    @Nested
    @DisplayName("ReverseString")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class ReverseString {
        private Stringutility su;

        @BeforeAll
        public void setUp() {
            su = new Stringutility();
        }

        @Test
        public void mustReverseStringWith2Letters() {
            String excepted = "ab";

            assertEquals(excepted, su.ReverseString("ba"));
        }

        @Test
        public void mustReverseStringWithThreeLetters() {
            String excepted = "cBa";

            assertEquals(excepted, su.ReverseString("aBc"));
        }

        @Test
        public void mustReverseStringWithFourLetters() {
            String excepted = "dCBa";

            assertEquals(excepted, su.ReverseString("aBCd"));
        }

        @Test
        public void mustReveseStringWithFiveLetters() {
            String excepted = "eDCBa";

            assertEquals(excepted, su.ReverseString("aBCDe"));
        }

        @Test
        public void mustReturnCharIfOnlyOneCharInput() {
            String excepted = "a";

            assertEquals(excepted, su.ReverseString("a"));
        }

        @Test
        public void mustReturnIllegalArgumentIfStringIsEmpty() {
            String excepted = "";

            assertEquals("", su.ReverseString(excepted));
        }

        @Test
        public void mustReturnIllegalArgumentIfStringIsNull() {
            assertThrows(NullPointerException.class, () -> {
                su.ReverseString(null);
            });
        }
    }

    @Nested
    @DisplayName("CapitalizeString")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class CapitalizeString {
        private Stringutility su;

        @BeforeAll
        public void setUp() {
            su = new Stringutility();
        }

        @Test
        public void mustCapitalizeOneLetter() {
            String excepted = "A";

            assertEquals(excepted, su.capitalizeString("a"));
        }

        @Test
        public void mustCapitalizeOneLetterWithRandomChars() {
            String excepted = "A_|";

            assertEquals(excepted, su.capitalizeString("a_|"));
        }

        @Test
        public void mustCapaitalizeOneSentence() {
            String excepted = "MUST CAPAITALIZE ONE SENTENCE";

            assertEquals(excepted, su.capitalizeString("Must capaitalize one sentence"));
        }

        @Test
        public void mustThrowNullPointerException() {
            assertThrows(NullPointerException.class, () -> {
                su.capitalizeString(null);
            });
        }

        @Test
        public void mustReturnEmptyStringIfNoStringGiven() {
            String excepted = "";

            assertEquals(excepted, su.capitalizeString(""));
        }


    }

    @Nested
    @DisplayName("LowercaseString")
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    class LowercaseString {
        private Stringutility su;

        @BeforeAll
        public void setUp() {
            su = new Stringutility();
        }

        @Test
        public void mustLowercaseOneLetter() {
            String excepted = "a";

            assertEquals(excepted, su.lowercaseString("A"));
        }

        @Test
        public void mustLowercaseOneLetterWithRandomChars() {
            String excepted = "a_|";

            assertEquals(excepted, su.lowercaseString("A_|"));
        }

        @Test
        public void mustLowercaseOneSentence() {
            String excepted = "must capaitalize one sentence";

            assertEquals(excepted, su.lowercaseString("MUST CAPAITALIZE ONE SENTENCE"));
        }

        @Test
        public void mustThrowNullPointerException() {
            assertThrows(NullPointerException.class, () -> {
                su.lowercaseString(null);
            });
        }

        @Test
        public void mustReturnEmptyStringIfNoStringGiven() {
            String excepted = "";

            assertEquals(excepted, su.lowercaseString(""));
        }

    }
}
