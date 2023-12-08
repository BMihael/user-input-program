package com.soft.app.inputprocessor.impl;

import com.soft.app.exception.LimitedInputException;
import com.soft.app.inputprocessor.InputProcessor;

import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Level;

import static com.soft.app.task.impl.symboloccurrence.SymbolOccurrenceMessages.LIMITED_INPUT;

/**
 * Class is a concrete implementation of the {@link InputProcessor} class,
 * specializing in processing user input related to symbols. It defines methods to obtain user input, validate the input,
 * and handle cases where the input length exceeds a specified limit.
 *
 * <p>
 * The class expects the user to enter a string representing symbols and validates whether the length of the entered
 * string is within the specified limit (100 characters).
 */
public class SymbolInputProcessor extends InputProcessor<String> {

    @Override
    public Optional<String> getUserInput() {
        String result;
        try {
            result = scanner.next();
            validateResult(result);
            return Optional.of(result);
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
        }
        return Optional.empty();
    }

    public void validateResult(String value) {
        if (value.length() > 100) {
            throw new LimitedInputException(String.format(LIMITED_INPUT, 100));
        }
    }

}
