package org.example.app.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class RounderTest {

    @Test
    @DisplayName("Test value rounder with expected result")
    void test_Rounder_Expected_Result() {
        Assertions.assertEquals("20,48", Rounder.roundValue(20.48483));
    }

    @ParameterizedTest
    @ValueSource(strings = { "20.485", "20.49" })
    @DisplayName("Test value rounder with unexpected result")
    void test_Rounder_Unexpected_Result(String value) {
        Assertions.assertNotEquals(value, Rounder.roundValue(20.48483));
    }

}
