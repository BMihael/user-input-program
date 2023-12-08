package com.soft.app.task.impl;

import com.soft.app.task.Task;

import static com.soft.app.model.Messages.TASK_ENDED;
import static com.soft.app.model.Messages.TASK_STARTED;

/**
 * An abstract class designed as the parent for managing and processing task action.
 */
public abstract class BaseTask<T> implements Task {

    protected abstract T executeTaskLogic();

    @Override
    public void startTask() {
        System.out.printf((TASK_STARTED) + "%n", this);
        executeTaskLogic();
    }

    @Override
    public void endTask() {
        System.out.printf((TASK_ENDED) + "%n", this);
    }


    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
