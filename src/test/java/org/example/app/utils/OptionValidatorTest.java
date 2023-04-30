package org.example.app.utils;

import org.junit.jupiter.api.*;

public class OptionValidatorTest {

    private final int[] options = {0, 10, 20};

    @Test
    @DisplayName("Test Contains() with expected True")
    void test_Contains_Expected_True() {
        Assertions.assertTrue(OptionValidator.contains(options, 0));
        Assertions.assertTrue(OptionValidator.contains(options, 10));
        Assertions.assertTrue(OptionValidator.contains(options, 20));
    }

    @Test
    @DisplayName("Test Contains() with expected False")
    void test_Contains_Expected_False() {
        Assertions.assertFalse(OptionValidator.contains(options, -5));
        Assertions.assertFalse(OptionValidator.contains(options, 5));
        Assertions.assertFalse(OptionValidator.contains(options, 30));
    }

}
