package org.example

import org.junit.Assert
import org.junit.Test

class GreedKataTest {

    @Test
    fun validateArraySizeEqualsFive(){

        //given
        var dice = emptyArray<Int>();

        //when
        var score = GreedKata().calculateScore(dice)

        //then
        Assert.assertEquals("Invalid Payload Size", score)
    }

    @Test
    fun validateIfArrayHasSingleOne() {
        //given
        val dice = arrayOf(1, 0, 0, 0, 0)

        //when
        val score = GreedKata().calculateScore(dice)

        //then
        Assert.assertEquals("100 Points", score)
    }
    @Test
    fun validateIfArrayHasSingleFive() {
        //given
        val dice = arrayOf(0, 0, 0, 5, 0)

        //when
        val score = GreedKata().calculateScore(dice)

        //then
        Assert.assertEquals("50 Points", score)
    }

    @Test
    fun validateIfArrayHasTripleOnes() {
        //given
        val dice = arrayOf(1, 1, 1, 0, 0)

        //when
        val score = GreedKata().calculateScore(dice)

        //then
        Assert.assertEquals("1000 Points", score)
    }

    @Test
    fun validateCountPointsOne(){
        //given
        val caseOverThree = 5
        val caseLessThanThree = 2

        //when
        val scoreOverThree = GreedKata().countPointsNumberOne(caseOverThree)
        val  scoreLessThanThree = GreedKata().countPointsNumberOne(caseLessThanThree)

        //then
        Assert.assertEquals(200, scoreLessThanThree)
        Assert.assertEquals(1200, scoreOverThree)
    }

    @Test
    fun validateCountPointsFive() {
        //given
        val caseOverThree = 5
        val caseLessThanThree = 2

        //when
        val scoreOverThree = GreedKata().countPointsNumberOne(caseOverThree)
        val  scoreLessThanThree = GreedKata().countPointsNumberOne(caseLessThanThree)

        //then
        Assert.assertEquals(100, scoreLessThanThree)
        Assert.assertEquals(600, scoreOverThree)
    }

    @Test
    fun validateIfArrayHasTripleTwo() {
        //given
        val dice = arrayOf(2, 2, 2, 0, 0)

        //when
        val score = GreedKata().calculateScore(dice)

        //then
        Assert.assertEquals("200 Points", score)
    }
}