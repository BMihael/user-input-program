package com.soft.app.task.impl.clockangle;

import com.soft.app.inputprocessor.impl.ClockAngleInputProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ClockAngleCalculatorTaskTest {

    @Test
    void executeTaskLogic() {
        ClockAngleInputProcessor inputProcessor = mock(ClockAngleInputProcessor.class);
        when(inputProcessor.processUserInput()).thenReturn("05:05");

        ClockAngleCalculatorTask clockAngleCalculator = new ClockAngleCalculatorTask(inputProcessor);

        String result = clockAngleCalculator.executeTaskLogic();
        assertEquals("122.5", result);
        verify(inputProcessor, times(1)).processUserInput();
    }
}