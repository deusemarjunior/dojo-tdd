package org.example

class GreedKata {

    fun calculateScore(value: Array<Int>): String {
        if(value.size != 5) {
            return "Invalid Payload Size"
        }

        var total = 0
        var numberOne = 0
        var numberTwo = 0
        var numberThree = 0
        var numberFour = 0
        var numberFive = 0
        var numberSix = 0

        value.forEach {
            if (it == 1)
                numberOne++
            if (it == 5)
                total += 50
        }

        if (numberOne > 0) {
            if (numberOne == 1)
                total += 100
            if (numberOne == 2)
                total += 200
            if (numberOne == 3)
                total += 1000
            if (numberOne == 4)
                total == 1100
            if (numberOne == 5)
                total = 1200
        }
        return "$total Points"
    }

}