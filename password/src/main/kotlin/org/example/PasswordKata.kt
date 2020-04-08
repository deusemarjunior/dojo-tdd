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

}
