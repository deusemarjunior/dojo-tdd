package org.example

class PasswordKata (var senha: String){

    fun temMaisDeOito() : Boolean{
        return senha.length>8
    }

    fun temLetraMaiuscula() : Boolean {
        var isUpcase = false
        for (letra in senha) {
            if (letra.isUpperCase()) {
                isUpcase = true
                break
            }
        }
        return isUpcase
    }

    fun temLetraMinuscula(): Boolean {
        var isLowerCase = false
        for (letra in senha) {
            if (letra.isLowerCase()) {
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
        return senha.contains("_")
    }

    fun haveEspecialCharacter(): Boolean {
        var isEspecial = false
       // (@, #, $, %, &, * and +)
        var caracteres =  listOf<Char>('@','#','$','%','&','*','+')
        for (letra in senha){
            if (caracteres.contains(letra)){
                isEspecial = true
                break
            }
        }
        return  isEspecial
    }

}
