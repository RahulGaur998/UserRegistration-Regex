package com.regex;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AppParameterizedTest {
    String userInput;
    String expectation;
    UserRegistration userObject;

    @Before
    public void initialize() {
        userObject = new UserRegistration();
    }

    public AppParameterizedTest(String userInput, String expectation) {
        this.userInput = userInput;
        this.expectation = expectation;
    }

    @Parameterized.Parameters
    public static Collection inputs() {
        return Arrays.asList(new Object[][] { { "ram@gmail.com", "valid" }, { "123@gmail.com", "invalid" },
                { "abc-1@gmail.com.omc", "valid" } });
    }

    @Test
    public void checkUserInput() {
        assertEquals(this.expectation, userObject.emailPatternMatcher(this.userInput));
    }
}