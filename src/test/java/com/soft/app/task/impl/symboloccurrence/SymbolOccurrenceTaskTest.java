package com.soft.app.task.impl.symboloccurrence;

import com.soft.app.inputprocessor.impl.SymbolInputProcessor;
import org.junit.jupiter.api.Test;

import static com.soft.app.task.impl.symboloccurrence.SymbolOccurrenceMessages.MOST_OCCURRED_ELEMENT_DOES_NOT_EXIST;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SymbolOccurrenceTaskTest {

    @Test
    void executeTaskLogic1() {
        SymbolInputProcessor inputProcessor = mock(SymbolInputProcessor.class);
        when(inputProcessor.processUserInput()).thenReturn("symbols");

        SymbolOccurrenceTask symbolOccurrenceTask = new SymbolOccurrenceTask(inputProcessor);

        String result = symbolOccurrenceTask.executeTaskLogic();
        assertEquals("s", result);
        verify(inputProcessor, times(1)).processUserInput();
    }

    @Test
    void executeTaskLogic2() {
        SymbolInputProcessor inputProcessor = mock(SymbolInputProcessor.class);
        when(inputProcessor.processUserInput()).thenReturn("mmaabba");

        SymbolOccurrenceTask symbolOccurrenceTask = new SymbolOccurrenceTask(inputProcessor);

        String result = symbolOccurrenceTask.executeTaskLogic();
        assertEquals("a", result);
        verify(inputProcessor, times(1)).processUserInput();
    }

    @Test
    void executeTaskLogic3() {
        SymbolInputProcessor inputProcessor = mock(SymbolInputProcessor.class);
        when(inputProcessor.processUserInput()).thenReturn("ab");

        SymbolOccurrenceTask symbolOccurrenceTask = new SymbolOccurrenceTask(inputProcessor);

        String result = symbolOccurrenceTask.executeTaskLogic();
        assertEquals(MOST_OCCURRED_ELEMENT_DOES_NOT_EXIST, result);
        verify(inputProcessor, times(1)).processUserInput();
    }
}