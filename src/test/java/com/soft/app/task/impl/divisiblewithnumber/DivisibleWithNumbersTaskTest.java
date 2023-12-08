package com.soft.app.task.impl.divisiblewithnumber;


import com.soft.app.inputprocessor.impl.DivisibleWithNumberInputProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class DivisibleWithNumbersTaskTest {

    @Test
    public void test1() {
        DivisibleWithNumberInputProcessor inputProcessor = mock(DivisibleWithNumberInputProcessor.class);
        when(inputProcessor.processUserInput()).thenReturn(15);

        DivisibleWithNumbersTask divisibleWithNumbers = new DivisibleWithNumbersTask(inputProcessor);
        assertNull(divisibleWithNumbers.executeTaskLogic());
        verify(inputProcessor, times(2)).processUserInput();
    }

}