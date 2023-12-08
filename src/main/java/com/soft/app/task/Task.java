package com.soft.app.task;

/**
 * The interface defines the basic structure for tasks to be executed.
 * Implementations of this interface should provide logic for starting and ending tasks.
 */
public interface Task {
    void startTask();

    void endTask();
}
