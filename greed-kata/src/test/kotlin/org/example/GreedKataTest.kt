package org.example

import org.junit.Assert
import org.junit.Test

class GreedKataTest {

    @Test
    fun valorUmRetorna100() {

        //given
        var greedKata = GreedKata()
        var valor = 1

        //when
        var retorno =  greedKata.calculaScore(valor)

        //than
        Assert.assertEquals("100 points", retorno)

    }

}