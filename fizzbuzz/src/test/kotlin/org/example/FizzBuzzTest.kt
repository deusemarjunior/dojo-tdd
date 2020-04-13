package org.example

import org.junit.Assert
import org.junit.Test
import kotlin.test.assertTrue

class FizzBuzzTest {


    @Test
    fun inputIntegerOutputString(){
        //given
        var numberPositive = 5
        var stringCheck = "sucess"
        var fizzBuzz =  FizzBuzz()

        ///when
        var resultTest  = fizzBuzz.returnFizzBuzz()

        //then
        Assert.assertEquals(resultTest, stringCheck)

    }

}
