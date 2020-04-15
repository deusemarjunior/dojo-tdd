package org.example

class GreedKata {

    fun calculaScore(valor: Int): String {
        if (valor == 1) {
            return "100 Points"
        } else if( valor == 5 ){
            return "50 Points"
        }

        return ""
    }
}