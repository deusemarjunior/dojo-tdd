package org.example

import org.junit.Assert
import org.junit.Test

class GreedKataTest {

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

}