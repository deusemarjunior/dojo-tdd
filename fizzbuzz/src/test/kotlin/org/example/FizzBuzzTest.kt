package org.example

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertTrue

class FizzBuzzTest {


    @Test
    fun inputIntegerOutputString(){
        //given
        var numberPositive = 5
        var stringCheck = "success"
        var fizzBuzz =  FizzBuzz()

        ///when
        var resultTest  = fizzBuzz.returnFizzBuzz()

        //then
        Assert.assertEquals(stringCheck, resultTest)

    }

    @Test
    fun multipleOfThree(){
        //given
        var numberPositive = 6
        var stringCheck = "Fizz"
        var fizzBuzz =  FizzBuzz()

        ///when
        var resultTest  = fizzBuzz.returnFizzBuzz()

        //then
        Assert.assertEquals(stringCheck, resultTest)

    }
}
