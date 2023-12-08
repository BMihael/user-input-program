package com.soft.app.inputprocessor;

import com.soft.app.exception.UnexpectedException;
import com.soft.app.task.Task;

import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.soft.app.model.Messages.UNEXPECTED_EXCEPTION_MESSAGE;

/**
 * Class is an abstract base class for processing user input in a generic manner.
 * It provides methods for obtaining user input, validating the result, and processing the overall user input.
 * Concrete subclasses must implement the methods to customize the behavior for specific input types.
 */
public abstract class InputProcessor<T> {

    protected final static Logger logger = Logger.getLogger(Task.class.getName());

    private Scanner scanner;

    public InputProcessor() {
        this.scanner = new Scanner(System.in);
    }

    protected abstract Optional<T> getUserInput(Scanner scanner);

    protected abstract void validateResult(T value);

    public T processUserInput() {
        Scanner scanner = new Scanner(System.in);
        boolean endProcessOfEntering = false;
        Optional<T> result;
        try {
            while (!endProcessOfEntering) {
                result = getUserInput(scanner);
                if (result.isPresent()) {
                    return result.get();
                }

            }
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
        }

        throw new UnexpectedException(UNEXPECTED_EXCEPTION_MESSAGE);
    }
}