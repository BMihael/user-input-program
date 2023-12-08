package com.soft.app.inputprocessor;

import com.soft.app.exception.InvalidNumberException;
import com.soft.app.inputprocessor.impl.DivisibleWithNumberInputProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleWithNumberInputProcessorTest {

    private static final Integer number_valid = 50;
    private static final Integer number_greater_then_100 = 150;
    private static final Integer number_less_then_zero = -150;

    @Test
    void validateResult1() {
        assertThrows(InvalidNumberException.class, () -> {
            new DivisibleWithNumberInputProcessor().validateResult(number_greater_then_100);
        });
    }

    @Test
    void validateResult2() {
        assertThrows(InvalidNumberException.class, () -> {
            new DivisibleWithNumberInputProcessor().validateResult(number_less_then_zero);
        });
    }

    @Test
    void validateResult3() {
        assertDoesNotThrow(() -> {
            new DivisibleWithNumberInputProcessor().validateResult(number_valid);
        });
    }
}