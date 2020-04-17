package org.example

class GreedKata {

    fun calculateScore(value: Array<Int>): String {
        if(value.size != 5) {
            return "Invalid Payload Size"
        }

        var total = 0
        var numberOne = value.count{ it == 1 }
        var numberTwo = value.count{ it == 2 }
        var numberThree = 0
        var numberFour = 0
        var numberFive = value.count { it == 5 }
        var numberSix = 0

        if(numberFive > 0 ){
            total += 50*numberFive;
        }

        total += countPointsNumberOne(numberOne);
        total += countPointsNumberFive(numberFive)
        total += countPointsNumberTwo(numberTwo)

        return "$total Points"
    }

    fun countPointsNumberOne(value: Int): Int {
        var sum = 0
        if (value > 0) {
            if (value < 3){
                sum += 100*value
            }
            if (value >= 3){
                sum += 1000
                sum += 100 * (value % 3)
            }
        }

        return sum
    }

    fun countPointsNumberFive(value: Int): Int {
        var sum = 0
        if (value > 0) {
            if (value < 3){
                sum += 50 * value
            }
            if (value >= 3){
                sum += 1000
                sum += 50 * (value % 3)
            }
        }

        return sum
    }

    fun countPointsNumberTwo(value: Int): Int {

        var sum = 0

        if(value > 0) {
            if (value >= 3) {
                sum += 200
            }
        }

        return sum
    }
}