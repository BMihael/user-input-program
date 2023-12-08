package com.soft.app.task.impl.clockangle;

public enum ClockConst {
    HOURS(23, "Hours"),
    MINUTES(59, "Minutes");

    private final int number;
    private final String value;

    ClockConst(int number, String value) {
        this.number = number;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public int getNumber() {
        return number;
    }
}
