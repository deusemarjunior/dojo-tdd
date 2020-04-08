package org.example

import org.junit.Test
import kotlin.test.assertTrue

class PasswordKataTest {

    @Test
    fun moreThan8haracters(){
        var passwd = PasswordKata()
        assertTrue(passwd.temMaisDe8())

    }
}