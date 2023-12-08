package com.soft.app.task.impl.clockangle;

/**
 * Class representing messages associated with {@link ClockAngleCalculatorTask} class.
 */
public class ClockAngleCalculatorMessages {
    private ClockAngleCalculatorMessages() {
    }

    /**
     * This message indicates that two numbers should be entered.
     */
    public static final String ENTER_CLOCK_TIME = "Enter the clock time in the format of HH:mm.";

    /**
     * Invalid input: "Please type specified format: \"HH:mm\"."
     */
    public static final String INPUT_INVALID = "Please type specified format: \"HH:mm\".";

    /**
     * Message indicates the calculated angle between two values..
     */
    public static final String CALCULATED_ANGLE = "Calculated angle between %.2f and %.2f is: %.2f.";

    /**
     * Indicates that the clock value is invalid.
     */
    public static final String INVALID_CLOCK_TIME = "Clock value %d is not valid for %s.";
}
