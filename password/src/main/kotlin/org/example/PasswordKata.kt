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
                break
            }
        }
        return isUpcase
    }

    fun temLetraMinuscula(): Boolean {
        var isLowerCase = false
        for (num in senha) {
            if (num.isLowerCase()) {
                isLowerCase = true
                break
            }
        }
        return isLowerCase
    }

    fun temUmNumero(): Boolean {
        var temUmNumero = false
        for (num in senha){
            if (num.isDigit()){
                temUmNumero = true
                break
            }
        }
        return temUmNumero
    }

    fun containUnderscore(): Boolean {
        var temSublinhado = false
        if(senha.contains("_")) {
            temSublinhado = true
        }
        return temSublinhado
    }

}
