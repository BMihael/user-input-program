package com.soft.app.manager;

import com.soft.app.task.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * The class represents a simple task management system.
 * Tasks can be added and processed within a basic interaction loop.
 * The tasks are instances of the{@link com.soft.app.task.Task} class, which
 * must implement the necessary methods for starting and ending a task.
 */
public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public void run() {
        for (Task task : tasks) {
            task.startTask();
            task.endTask();
        }
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }
}
