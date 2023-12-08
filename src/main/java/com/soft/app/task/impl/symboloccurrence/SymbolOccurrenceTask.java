package com.soft.app.task.impl.symboloccurrence;

import com.soft.app.inputprocessor.InputProcessor;
import com.soft.app.inputprocessor.impl.SymbolInputProcessor;
import com.soft.app.task.impl.BaseTask;

import java.util.*;

import static com.soft.app.task.impl.symboloccurrence.SymbolOccurrenceMessages.*;


/**
 * This class provides methods for handling user input, validating input values,
 * and executing logic to determine the most frequently occurring symbol in the entered text.
 */
public class SymbolOccurrenceTask extends BaseTask<String> {

    private final InputProcessor<String> inputProcessor;

    public SymbolOccurrenceTask() {
        this.inputProcessor = new SymbolInputProcessor();
    }

    public SymbolOccurrenceTask(SymbolInputProcessor inputProcessor) {
        this.inputProcessor = inputProcessor;
    }

    @Override
    protected String executeTaskLogic() {
        System.out.println(ENTER_SYMBOLS);
        String userInput = inputProcessor.processUserInput();
        Optional<Character> mostOccurredCharacter = extractMostOccurredSign(userInput.toCharArray());

        if (mostOccurredCharacter.isPresent()) {
            System.out.printf((MOST_OCCURRED_ELEMENT) + "%n", mostOccurredCharacter.get());
            return mostOccurredCharacter.get().toString();
        }
        System.out.println(MOST_OCCURRED_ELEMENT_DOES_NOT_EXIST);
        return MOST_OCCURRED_ELEMENT_DOES_NOT_EXIST;
    }

    private Optional<Character> extractMostOccurredSign(char[] charArray) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : charArray) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        Optional<Character> mostOccurringElement = Optional.empty();
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostOccurringElement = Optional.of(entry.getKey());
            } else if (entry.getValue() == maxFrequency) {
                mostOccurringElement = Optional.empty();
            }
        }

        return mostOccurringElement;
    }
}
