package com.automation

import spock.lang.Specification
import spock.lang.Unroll


/**
 *  Created by kaiser.alam on Sep, 2018
 */
class AppTest extends Specification {

    def "Greeting test"() {

        given: "Object Initialization"
        def hello = new App()

        when: "getGreeting is called"
        def actualResult = hello.getGreeting()

        then: "valid response should display"
        actualResult == "Hello"

    }

    def "test list API"() {
        given: ""
        def a = []

        when: ""
        a << 'hello'

        then: ""
        a.contains 'hello'
    }

    def "test some math"() {
        expect: ""
        a * a == 4

        where: ""
        a = 2
        b = 4
    }

    @Unroll
    def "test some more math"() {
        expect: ""
        a * a == b

        where: ""
        a  | b
        2  | 4
        3  | 9
        4  | 16
        10 | 100
    }

    @Unroll
    def "test fizz buzz test"() {
        given: ""
        def fizzBuzz = new App()

        when: ""
        def result = fizzBuzz.getFizzBuzz(a)

        then: ""
        result == b

        where: ""
        a  | b
        3  | "fizz"
        5  | "buzz"
        15 | "fizz buzz"
        4  | "unknown"

    }

    @Unroll
    def "test factorial"() {

        when: "call factorial for a value"
        def f = new App()
        def result = f.getFacto(a).intValue()

        then: "result match with data table"
        result == b

        where: "data table"
        a | b
        2 | 2
        3 | 6

    }
}