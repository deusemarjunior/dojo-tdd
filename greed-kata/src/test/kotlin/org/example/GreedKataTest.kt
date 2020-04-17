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
        val dice = arrayOf(1, 1, 1, 5, 1)

        //when
        val score = GreedKata().calculateScore(dice)

        //then
        Assert.assertEquals("1150 Points", score)
    }

    /*
    @Test
    fun valorUmRetorna100() {

        //given
        var greedKata = GreedKata()
        var valor = arrayOf(1)

        //when
        var retorno =  greedKata.calculaScore(valor)

        //than
        Assert.assertEquals("100 Points", retorno)

    }

    @Test
    fun valorCincoRetorna50() {

        //given
        var valor = arrayOf(5)

        //when
        var retorno = GreedKata().calculaScore(valor)

        //than
        Assert.assertEquals("50 Points", retorno);

    }

    @Test
    fun valorTresUnsRetorna1000(){

       //given
        var valor = arrayOf(1,1,1)

        //when
        var retorno = GreedKata().calculaScore(valor)

        //then
        Assert.assertEquals("1000 Points", retorno)
    }

    @Test
    fun valorTresDoisRetorna200(){

        //given
        var valor = arrayOf(2,2,2)

        //when
        var retorno = GreedKata().calculaScore(valor)

        //then
        Assert.assertEquals("200 Points", retorno)
    }

    @Test
    fun valorTresDoisRetorna300(){
        //given
        var valor = arrayOf(3,3,3)

        //when
        var retorno = GreedKata().calculaScore(valor)

        //then
        Assert.assertEquals("300 Points", retorno)
    }
    */
}