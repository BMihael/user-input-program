package com.soft.app.task.impl.divisiblewithnumber;

/**
 * Class representing messages associated with {@link DivisibleWithNumbersTask} class.
 */
public class DivisibleWithNumbersMessages {
    private DivisibleWithNumbersMessages() {
    }

    /**
     * This message indicates that two numbers should be entered.
     */
    public static final String ENTER_TWO_NUMBERS = "Enter two numbers:";

    /**
     * This message indicates that a first number should be entered.
     */
    public static final String ENTER_FIRST_NUMBER = "Enter first number:";

    /**
     * This message indicates that a second number should be entered.
     */
    public static final String ENTER_SECOND_NUMBER = "Enter second number:";

    /**
     * Message indicates that the given number must fall within the specified range.
     */
    public static final String NUMBER_BETWEEN_RANGE = "Please enter a number within the range of %d to %d.";

    /**
     * Message indicates that the given number is divisible by both specified numbers.
     */
    public static final String NUMBER_IS_DIVISIBLE_WITH_BOTH = "Number: %d is divisible both with %d and %d.";

    /**
     * Message indicates that the given number is divisible by only one specific number.
     */
    public static final String NUMBER_IS_DIVISIBLE_ONLY_WITH = "Number: %d is divisible only with %d.";

    /**
     * Message indicates that the given number is not divisible by the specified numbers.
     */
    public static final String NUMBER_IS_NOT_DIVISIBLE_WITH = "Number: %d is not divisible either with %d or %d.";
}
