package com.soft.app.task.impl.clockangle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ClockAngleCalculatorTest {

    private static Stream<Arguments> listOfArguments() {
        return Stream.of(
                Arguments.of(new BigDecimal("5.0"), new BigDecimal("5.0"), new BigDecimal("122.50")),
                Arguments.of(new BigDecimal("12.0"), new BigDecimal("12.0"), new BigDecimal("66.00")),
                Arguments.of(new BigDecimal("6.0"), new BigDecimal("59.0"), new BigDecimal("144.50")),
                Arguments.of(new BigDecimal("17.0"), new BigDecimal("50.0"), new BigDecimal("125.00")),
                Arguments.of(new BigDecimal("23.0"), new BigDecimal("11.0"), new BigDecimal("90.50")),
                Arguments.of(new BigDecimal("13.0"), new BigDecimal("45.0"), new BigDecimal("142.50")),
                Arguments.of(new BigDecimal("19.0"), new BigDecimal("45.0"), new BigDecimal("37.50")),
                Arguments.of(new BigDecimal("20.0"), new BigDecimal("22.0"), new BigDecimal("119.00")),
                Arguments.of(new BigDecimal("16.0"), new BigDecimal("56.0"), new BigDecimal("172.00")),
                Arguments.of(new BigDecimal("17.0"), new BigDecimal("0.0"), new BigDecimal("150.00")));
    }

    @ParameterizedTest
    @MethodSource("listOfArguments")
    public void test1(BigDecimal hours, BigDecimal minutes, BigDecimal result) {
        assertEquals(result, new ClockAngleCalculator(hours, minutes).calculate());
    }

}