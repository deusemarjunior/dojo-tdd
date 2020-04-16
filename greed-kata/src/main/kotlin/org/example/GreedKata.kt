package org.example

class GreedKata {

    fun calculaScore(valor: Array<Int>): String {
        var contadorUm = 0
        var contadorDois = 0
        var contadorTres = 0

        valor.forEach {
            if(it == 1) {
                contadorUm++
            }
            if(it == 2){
                contadorDois++
            }
            if(it == 3){
                contadorTres++
            }
        }
        if(contadorUm == 3){
            return "1000 Points"
        } else  if(contadorDois == 3){
            return "200 Points"
        } else if(contadorTres == 3){
            return "300 Points"
        }

        if (valor.contains(1)) {
            return "100 Points"
        } else if(valor.contains(5)){
            return "50 Points"
        }

        return ""
    }
}