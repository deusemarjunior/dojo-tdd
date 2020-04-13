package org.example

import org.junit.Test
import kotlin.test.assertTrue

class FizzBuzzTest {


    @Test
    fun inputIntegerOutputString(){

        var fizzBuzz = FizzBuzz()
        assertTrue(fizzBuzz.returnFizzBuzz())

    }

}