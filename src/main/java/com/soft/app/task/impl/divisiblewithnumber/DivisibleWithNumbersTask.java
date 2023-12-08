package com.soft.app.task.impl.divisiblewithnumber;

import com.soft.app.inputprocessor.InputProcessor;
import com.soft.app.inputprocessor.impl.DivisibleWithNumberInputProcessor;
import com.soft.app.task.impl.BaseTask;

import static com.soft.app.task.impl.divisiblewithnumber.DivisibleWithNumbersMessages.*;

/**
 * This class contains methods for processing user input, validating input values, and executing logic
 * to check if entered numbers are divisible by selected values from the {@link TargetNumber} class.
 */
public class DivisibleWithNumbersTask extends BaseTask<String> {

    private final InputProcessor<Integer> inputProcessor;

    public DivisibleWithNumbersTask() {
        this.inputProcessor = new DivisibleWithNumberInputProcessor();
    }

    public DivisibleWithNumbersTask(DivisibleWithNumberInputProcessor inputProcessor) {
        this.inputProcessor = inputProcessor;
    }

    @Override
    protected String executeTaskLogic() {
        System.out.println(ENTER_TWO_NUMBERS);

        System.out.println(ENTER_FIRST_NUMBER);
        Integer number1 = inputProcessor.processUserInput();
        calculateAreNumbersDivisible(number1);

        System.out.println(ENTER_SECOND_NUMBER);
        Integer number2 = inputProcessor.processUserInput();
        calculateAreNumbersDivisible(number2);

        return null;
    }

    void calculateAreNumbersDivisible(Integer number) {
        boolean first = isDivisibleWith(number, TargetNumber.FIRST_NUMBER.getNumber());
        boolean second = isDivisibleWith(number, TargetNumber.SECOND_NUMBER.getNumber());

        if (first && second) {
            System.out.printf((NUMBER_IS_DIVISIBLE_WITH_BOTH) + "%n", number, TargetNumber.FIRST_NUMBER.getNumber(), TargetNumber.SECOND_NUMBER.getNumber());
        } else if (first) {
            System.out.printf((NUMBER_IS_DIVISIBLE_ONLY_WITH) + "%n", number, TargetNumber.FIRST_NUMBER.getNumber());
        } else if (second) {
            System.out.printf((NUMBER_IS_DIVISIBLE_ONLY_WITH) + "%n", number, TargetNumber.SECOND_NUMBER.getNumber());
        } else {
            System.out.printf((NUMBER_IS_NOT_DIVISIBLE_WITH) + "%n", number, TargetNumber.FIRST_NUMBER.getNumber(), TargetNumber.SECOND_NUMBER.getNumber());
        }
    }

    private boolean isDivisibleWith(Integer num, Integer target) {
        return num % target == 0;
    }
}
