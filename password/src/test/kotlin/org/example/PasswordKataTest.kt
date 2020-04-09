package org.example

import org.junit.Before
import org.junit.Test
import kotlin.test.assertTrue

class PasswordKataTest {

    lateinit var pwd: String

    @Before
    fun beforeTest(){
        pwd = "ad@_fadsfa1A"
    }

    @Test
    fun moreThan8haracters(){
        var passwd = PasswordKata(pwd)
        assertTrue(passwd.temMaisDeOito())
    }

    @Test
    fun haveCapitalLetter() {
        var passwd = PasswordKata(pwd)
        assertTrue(passwd.temLetraMaiuscula())
    }

    @Test
    fun haveLowerLetter() {
        var passwd = PasswordKata(pwd)
        assertTrue(passwd.temLetraMinuscula())
    }

    @Test
    fun contemUmNumero(){
        var passwd = PasswordKata(pwd)
        assertTrue(passwd.temUmNumero())
    }

    @Test
    fun containUnderscore() {
        var passwd = PasswordKata(pwd)
        assertTrue(passwd.containUnderscore())
    }

    @Test
    fun especialCharacter() {
        var passwd = PasswordKata(pwd)
        assertTrue(passwd.haveEspecialCharacter())
    }

}