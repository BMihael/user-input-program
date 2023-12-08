package com.soft.app;

import com.soft.app.manager.TaskManager;
import com.soft.app.task.impl.clockangle.ClockAngleCalculatorTask;
import com.soft.app.task.impl.divisiblewithnumber.DivisibleWithNumbersTask;
import com.soft.app.task.impl.symboloccurrence.SymbolOccurrenceTask;

public class App {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new DivisibleWithNumbersTask());
        taskManager.addTask(new SymbolOccurrenceTask());
        taskManager.addTask(new ClockAngleCalculatorTask());
        taskManager.run();
    }
}


