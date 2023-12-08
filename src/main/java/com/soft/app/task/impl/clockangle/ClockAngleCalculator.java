package com.soft.app.task.impl.clockangle;

/**
 * Class designed to calculate the angle corresponding to a given time on a clock.
 */
public class ClockAngleCalculator {

    private final double hours;
    private final double minutes;

    ClockAngleCalculator(double hours, double minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    double calculate() {
        double hourAngle = 0.5 * (60 * this.hours + this.minutes);
        double minuteAngle = 6 * this.minutes;

        double angle = hourAngle - minuteAngle;

        angle = (angle + 360) % 360;

        if (angle > 180) {
            angle = 360 - angle;
        }
        return angle;
    }
}
