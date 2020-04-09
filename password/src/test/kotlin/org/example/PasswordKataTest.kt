package org.example

import org.junit.Test
import kotlin.test.assertTrue

class PasswordKataTest {

    @Test
    fun moreThan8haracters(){
        val pwd = "123456789"
        var passwd = PasswordKata(pwd)
        assertTrue(passwd.temMaisDeOito())
    }

    @Test
    fun haveCapitalLetter() {
        val pwd = "aAcaefghijk"
        var passwd = PasswordKata(pwd)
        assertTrue(passwd.temLetraMaiuscula())
    }

    @Test
    fun haveLowerLetter() {
        val pwd = "AsAAAAAAA"
        var passwd = PasswordKata(pwd)
        assertTrue(passwd.temLetraMinuscula())
    }

    @Test
    fun contemUmNumero(){
        val pwd = "a1aaa"
        var passwd = PasswordKata(pwd)
        assertTrue(passwd.temUmNumero())
    }

    @Test
    fun containUnderscore() {
        val pwd = "adfadsfa"
        var passwd = PasswordKata(pwd)
        assertTrue(passwd.containUnderscore())
    }

}