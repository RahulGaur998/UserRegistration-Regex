package com.regex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void checkFirstName() {
        UserRegistration userObject = new UserRegistration();
        assertEquals("valid", userObject.namePatternMatcher("Rahul"));
    }

    @Test
    public void checkLastName() {
        UserRegistration userObject = new UserRegistration();
        assertEquals("valid", userObject.namePatternMatcher("Gaur"));
    }

    @Test
    public void checkEmail() {
        UserRegistration userObject = new UserRegistration();
        assertEquals("valid", userObject.emailPatternMatcher("gaur.rahul996@gmail.com"));
    }

    @Test
    public void checkPhoneNumber() {
        UserRegistration userObject = new UserRegistration();
        assertEquals("valid", userObject.phoneNumberPatternMatcher("91 9689516995"));
    }

    @Test
    public void checkPassword() {
        UserRegistration userObject = new UserRegistration();
        assertEquals("valid", userObject.passwordPatternMatcher("Adsad@sd"));
    }
}
