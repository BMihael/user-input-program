package com.soft.app.inputprocessor.impl;

import com.soft.app.exception.InvalidNumberException;
import com.soft.app.inputprocessor.InputProcessor;
import com.soft.app.task.impl.clockangle.ClockConst;

import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Level;

import static com.soft.app.task.impl.clockangle.ClockAngleCalculatorMessages.INPUT_INVALID;
import static com.soft.app.task.impl.clockangle.ClockAngleCalculatorMessages.INVALID_CLOCK_TIME;
import static com.soft.app.task.impl.clockangle.ClockAngleCalculatorTask.SEPARATOR;

/**
 * Class is a concrete implementation of the {@link InputProcessor} class,
 * specialized for processing user input related to clock angles. It defines methods to obtain user input, validate
 * the input, and process clock time entries.
 * <p>
 * The class enforces specific validation rules for clock time input, ensuring that the entered time conforms to the
 * expected format and falls within the valid range of hours and minutes.
 */
public class ClockAngleInputProcessor extends InputProcessor<String> {

    private static final String REGEX = "\\d{2}:\\d{2}$";
    private static final ClockConst HOURS = ClockConst.HOURS;
    private static final ClockConst MINUTES = ClockConst.MINUTES;


    @Override
    protected Optional<String> getUserInput(Scanner scanner) {
        String result;
        try {
            result = scanner.next();
            validateResult(result);
            return Optional.of(result);
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
        } finally {
            scanner.close();
        }
        return Optional.empty();
    }

    @Override
    protected void validateResult(String value) {
        validateText(value);

        String[] clockTime = value.split(SEPARATOR);
        validateNumber(clockTime[0], HOURS);
        validateNumber(clockTime[1], MINUTES);
    }

    public void validateText(String value) {
        if (!value.matches(REGEX)) {
            throw new InvalidNumberException(INPUT_INVALID);
        }
    }

    public void validateNumber(String number, ClockConst clockConst) {
        try {
            int value = Integer.parseInt(number);
            if (value > clockConst.getNumber()) {
                throw new InvalidNumberException(INVALID_CLOCK_TIME, clockConst.getNumber(), clockConst.getValue());
            }
        } catch (NumberFormatException exception) {
            throw new InvalidNumberException(INPUT_INVALID);
        }
    }
}
