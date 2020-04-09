package org.example

class PasswordKata (var senha: String){

    fun temMaisDeOito() : Boolean{
        return senha.length>8
    }

    fun temLetraMaiuscula() : Boolean {
        var isUpcase = false
        for (num in senha) {
            if (num.isUpperCase()) {
                isUpcase = true
            }
        }
        return isUpcase
    }

    fun temLetraMinuscula(): Boolean {
        var isLowerCase = false
        for (num in senha) {
            if (num.isLowerCase()) {
                isLowerCase = true
            }
        }
        return isLowerCase
    }

}
