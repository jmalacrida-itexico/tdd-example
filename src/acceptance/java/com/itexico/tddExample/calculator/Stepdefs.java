package com.itexico.tddExample.calculator;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

public class Stepdefs {

    StringCalculator calculator;

    @Given("^that there exists a calculator$")
    public void thatThereExistsACalculator() throws Throwable {
        calculator = new StringCalculator();
    }
}
