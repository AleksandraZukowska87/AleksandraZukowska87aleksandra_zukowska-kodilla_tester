package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class DoubleSources {
    static Stream<Arguments> provideDoublesForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.80, 82), "Overweight"),
                Arguments.of(new Person(1.62, 50), "Normal (healthy weight)"),
                Arguments.of(new Person(1.3, 42), "Normal (healthy weight)"),
                Arguments.of(new Person(1.6, 74), "Overweight"),
                Arguments.of(new Person(2, 130), "Obese Class I (Moderately obese)")
        );
    }

}
