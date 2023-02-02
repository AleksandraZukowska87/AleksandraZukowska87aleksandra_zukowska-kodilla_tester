package com.kodilla.parametrized_tests.homework;

import com.kodilla.parametrized_tests.StringValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    public  UserValidator userValidator = new UserValidator();
    public  StringValidator stringValidator = new StringValidator();


    @ParameterizedTest
    @ValueSource(strings = {"jeff","mark12x0-","randomusername"})
    public void shouldReturnTrueIfUsernameIsValid(String username){
        assertTrue(userValidator.validateUsername(username));
    }
    @ParameterizedTest
    @ValueSource(strings = {"Mark,=zuckerberg","';[][;]", "","    ", "@@."})
    public void shouldReturnFalseIfUsernameHasInvalidCharacters(String username){
        assertFalse(userValidator.validateUsername(username));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfUsernameNull(String username){
        assertTrue(stringValidator.isBlank(username));
    }


    @ParameterizedTest
    @ValueSource(strings = {"jeff@gmail.com", "11mk@gmail.com", "mail@123.com"})
    public void shouldReturnTrueIfEmailIsValid(String email){
        assertTrue(userValidator.validateEmail(email));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfEmailIsNull(String email){
        assertTrue(stringValidator.isBlank(email));
    }
    @ParameterizedTest
    @ValueSource(strings = {"1@.@.com"})
    public void shouldReturnFalseIfEmailIsNotValid(String email){
        assertFalse(userValidator.validateEmail(email));
    }


}
