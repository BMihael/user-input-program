package com.soft.app.task.impl.clockangle;

import com.soft.app.inputprocessor.InputProcessor;
import com.soft.app.inputprocessor.impl.ClockAngleInputProcessor;
import com.soft.app.task.impl.BaseTask;

import java.math.BigDecimal;

import static com.soft.app.task.impl.clockangle.ClockAngleCalculatorMessages.*;

/**
 * The class includes methods for executing the logic of task to calculate and display the clock angle.
 * The class utilizes the {@link ClockAngleCalculator} class to perform the actual angle calculation and outputs the result.
 */
public class ClockAngleCalculatorTask extends BaseTask<String> {

    public static final String SEPARATOR = ":";

    private final InputProcessor<String> inputProcessor;

    public ClockAngleCalculatorTask() {
        this.inputProcessor = new ClockAngleInputProcessor();
    }

    public ClockAngleCalculatorTask(ClockAngleInputProcessor inputProcessor) {
        this.inputProcessor = inputProcessor;
    }

    @Override
    protected String executeTaskLogic() {
        System.out.println(ENTER_CLOCK_TIME);
        String clockAngle = inputProcessor.processUserInput();

        String[] clockTime = clockAngle.split(SEPARATOR);
        String hours = clockTime[0];
        String minutes = clockTime[1];

        BigDecimal result = new ClockAngleCalculator(new BigDecimal(hours), new BigDecimal(minutes)).calculate();
        System.out.printf((CALCULATED_ANGLE) + "%n", hours, minutes, result);
        return result.toString();
    }

}
