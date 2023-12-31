package com.soft.app.inputprocessor.impl;

import com.soft.app.exception.InvalidNumberException;
import com.soft.app.inputprocessor.InputProcessor;

import java.util.Optional;
import java.util.logging.Level;

import static com.soft.app.task.impl.divisiblewithnumber.DivisibleWithNumbersMessages.NUMBER_BETWEEN_RANGE;

/**
 * Class is a concrete implementation of the {@link InputProcessor} class,
 * designed to process user input related to checking divisibility with a specified number. It defines methods to obtain
 * user input, validate the input, and handle numbers within a specific range.
 * <p>
 * The class expects the user to enter an integer and validates whether the entered number is within the specified
 * range (0 to 100, inclusive).
 */
public class DivisibleWithNumberInputProcessor extends InputProcessor<Integer> {

    @Override
    protected Optional<Integer> getUserInput() {
        String num;
        try {
            num = scanner.next();
            Integer result = Integer.parseInt(num);
            validateResult(result);
            return Optional.of(result);
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
            return Optional.empty();
        }
    }

    public void validateResult(Integer value) {
        if (value < 0 || value > 100) {
            throw new InvalidNumberException(String.format(NUMBER_BETWEEN_RANGE, 0, 100));
        }
    }
}
