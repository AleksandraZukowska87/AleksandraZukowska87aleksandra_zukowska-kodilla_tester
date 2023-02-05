package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    public GamblingMachine gamblingMachine = new GamblingMachine();



    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", numLinesToSkip = 0)
    void shouldReturnFalseIfNumbersIsCorrectSize(String numbers) throws InvalidNumbersException {
        Set<Integer> set = new HashSet<>();
        for (String number : numbers.split(",")){
            set.add(Integer.parseInt(number));
        }
        boolean result = gamblingMachine.isNotCorrectSize(set);

        assertFalse(result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers2.csv")
    void shouldReturnFalseIfAllNumbersAreWithinScope(String numbers){
        Set<Integer> set = new HashSet<>();
        for (String number : numbers.split(",")){
            set.add(Integer.parseInt(number));
        }
        boolean result = gamblingMachine.isAnyNumberOutOfDeclaredScope(set);

        assertFalse(result);

    }
    //@ParameterizedTest
    //@CsvFileSource(resources = "/randomNumbers1.csv", numLinesToSkip = 1)
    //public void shouldReturnTrueIfNumberIsOutOfScope(Set<Integer> numbers) throws InvalidNumbersException {
    //
    //}
}
