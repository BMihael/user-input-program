package com.soft.app.task.impl.clockangle;

import java.math.BigDecimal;

/**
 * Class designed to calculate the angle corresponding to a given time on a clock.
 */
public class ClockAngleCalculator {

    private final BigDecimal hours;
    private final BigDecimal minutes;

    ClockAngleCalculator(BigDecimal hours, BigDecimal minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    BigDecimal calculate() {
        BigDecimal hourAngle = BigDecimal.valueOf(0.5).multiply((BigDecimal.valueOf(60).multiply(this.hours)).add(this.minutes));

        BigDecimal minuteAngle = BigDecimal.valueOf(6).multiply(this.minutes);

        BigDecimal angle = hourAngle.subtract(minuteAngle);

        angle = (angle.add(BigDecimal.valueOf(360))).remainder(BigDecimal.valueOf(360));

        if (angle.compareTo(BigDecimal.valueOf(180)) > 0) {
            angle = BigDecimal.valueOf(360).subtract(angle);
        }
        return angle;
    }
}
