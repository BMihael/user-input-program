package com.soft.app.model;

/**
 * Utility class for storing constant messages.
 */
public class Messages {
    private Messages() {
    }

    /**
     * Message indicating that task started.
     */
    public static final String TASK_STARTED = "Task %s started.";

    /**
     * Message indicating that task ended.
     */
    public static final String TASK_ENDED = "Task %s ended.";

    /**
     * Message indicating that unexpected action has occurred.
     */
    public static final String UNEXPECTED_EXCEPTION_MESSAGE = "Unexpected action occurred.";
}
