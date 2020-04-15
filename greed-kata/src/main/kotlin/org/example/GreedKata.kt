package org.example

class GreedKata {

    fun calculaScore(valor: Array<Int>): String {
        var contador = 0

        valor.forEach {
            if(it == 3) {
                contador++
            }
        }

        if (valor.contains(1)) {
            return "100 Points"
        } else if(valor.contains(5)){
            return "50 Points"
        }

        return ""
    }
}