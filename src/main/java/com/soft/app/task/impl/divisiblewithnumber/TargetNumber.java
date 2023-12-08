package com.soft.app.task.impl.divisiblewithnumber;

enum TargetNumber {
    FIRST_NUMBER(3), SECOND_NUMBER(5);

    private final int number;

    TargetNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}
