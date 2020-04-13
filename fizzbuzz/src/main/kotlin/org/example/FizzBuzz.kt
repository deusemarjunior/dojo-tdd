package org.example

import java.lang.Exception

class FizzBuzz {
  fun returnFizzBuzz(number: Int?): String {
    if(number != null) {
      if (number%3 == 0 && number%5 == 0){
        return "FizzBuzz"
      } else if (number%3 == 0) {
        return "Fizz"
      } else if (number%5 == 0) {
        return "Buzz"
      }
    } else {
      throw Exception()
    }

    return number.toString()
  }

}
