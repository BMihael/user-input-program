package com.soft.app.inputprocessor;

import com.soft.app.exception.InvalidNumberException;
import com.soft.app.inputprocessor.impl.ClockAngleInputProcessor;
import com.soft.app.task.impl.clockangle.ClockConst;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClockAngleInputProcessorTest {

    private static final String text_invalid = "symbols";
    private static final String text_valid = "11:21";

    private static final String number_valid = "10";
    private static final String number_toHigh = "99";
    private static final String not_number = "NotNumber";

    @Test
    public void validateText_Invalid() {
        assertThrows(InvalidNumberException.class, () -> new ClockAngleInputProcessor().validateText(text_invalid));
    }

    @Test
    public void validateText_Valid() {
        assertDoesNotThrow(() -> new ClockAngleInputProcessor().validateText(text_valid));
    }

    @Test
    void validateNumber_valid_number() {
        assertDoesNotThrow(() -> new ClockAngleInputProcessor().validateNumber(number_valid, ClockConst.HOURS));
    }

    @Test
    void validateNumber_Invalid_number() {
        assertThrows(InvalidNumberException.class, () -> new ClockAngleInputProcessor().validateNumber(number_toHigh, ClockConst.HOURS));
    }

    @Test
    void validateNumber_not_number() {
        assertThrows(InvalidNumberException.class, () -> new ClockAngleInputProcessor().validateNumber(not_number, ClockConst.HOURS));
    }
}