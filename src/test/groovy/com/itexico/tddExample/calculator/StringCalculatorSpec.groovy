package com.itexico.tddExample.calculator

import spock.lang.Specification

class StringCalculatorSpec extends Specification {

    def "An empty string returns zero"() {

        given: "a calculator"
        def stringCalculator = new StringCalculator()

        when: "I parse an empty string"
        def rdo = stringCalculator.evaluate("")

        then: "it returns zero"
        rdo == 0
    }

    def "A single number returns the value"() {

        given: "a calculator"
        def stringCalculator = new StringCalculator()

        when: "I evaluate the number 3"
        def rdo = stringCalculator.evaluate(3)

        then: "I get 3"
        rdo == 3
    }

    def "Two numbers, comma delimited, returns the sum"() {

    }

    def "Two numbers, newline delimited, returns the sum"() {

    }

    def "Three numbers, delimited either way, returns the sum"() {

    }

    def "Negative numbers throw an exception"() {

    }

    def "Numbers greater than 1000 are ignored"() {

    }

    def "A single char delimiter can be defined on the first line"() { // e.g. //# for a ‘#’ as the delimiter

    }

    def "A multi char delimiter can be defined on the first line"() { // e.g. //[###] for ‘###’ as the delimiter

    }

    def "Many single or multi-char delimiters can be defined"() { // each wrapped in square brackets

    }
}
