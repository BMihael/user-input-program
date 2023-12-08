package com.soft.app.inputprocessor;

import com.soft.app.exception.LimitedInputException;
import com.soft.app.inputprocessor.impl.SymbolInputProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SymbolInputProcessorTest {

    private static final String text_dont_throw_exception = "less than 100 characters";
    private static final String text_throw_exception = "aftrgfgfgokkofdgokdgfokgdfkopdfgokpdfgokpgdfkmbvmbvmdsfmomsofgdpsmodfosfmdpompsfdompfsdompfdsompfdsmopfsdompdfsfomfsdomsdfomfsdmopfdsompfdsmo";

    @Test
    void validateResult1() {
        assertDoesNotThrow(() -> {
            new SymbolInputProcessor().validateResult(text_dont_throw_exception);
        });
    }

    @Test
    void validateResult2() {
        assertThrows(LimitedInputException.class, () -> {
            new SymbolInputProcessor().validateResult(text_throw_exception);
        });
    }
}