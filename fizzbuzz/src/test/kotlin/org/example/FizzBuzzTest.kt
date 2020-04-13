package org.example

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertTrue

class FizzBuzzTest {


    @Test
    fun inputIntegerOutputString(){
        //given
        var numberPositive = 4
        var stringCheck = "$numberPositive"
        var fizzBuzz =  FizzBuzz()

        ///when
        var resultTest  = fizzBuzz.returnFizzBuzz(numberPositive)

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
        var resultTest  = fizzBuzz.returnFizzBuzz(numberPositive)

        //then
        Assert.assertEquals(stringCheck, resultTest)

    }

    @Test
    fun multipleOfFive(){
        //given
        var numberPositive = 10
        var stringCheck = "Buzz"
        var fizzBuzz =  FizzBuzz()

        ///when
        var resultTest  = fizzBuzz.returnFizzBuzz(numberPositive)

        //then
        Assert.assertEquals(stringCheck, resultTest)

    }

}
