package com.soft.app.task.impl.clockangle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ClockAngleCalculatorTest {

    private static Stream<Arguments> listOfArguments() {
        return Stream.of(
                Arguments.of(5.0, 5.0, 122.50),
                Arguments.of(12.0, 12.0, 66),
                Arguments.of(6.0, 59.0, 144.50),
                Arguments.of(17.0, 50.0, 125),
                Arguments.of(23.0, 11.0, 90.5),
                Arguments.of(13.0, 45.0, 142.5),
                Arguments.of(19.0, 45.0, 37.5),
                Arguments.of(20.0, 22.0, 119.0),
                Arguments.of(16.0, 56.0, 172.0),
                Arguments.of(17.0, 0.0, 150));
    }

    @ParameterizedTest
    @MethodSource("listOfArguments")
    void test(double hours, double minutes, double result) {
        assertEquals(result, new ClockAngleCalculator(hours, minutes).calculate());
    }

}