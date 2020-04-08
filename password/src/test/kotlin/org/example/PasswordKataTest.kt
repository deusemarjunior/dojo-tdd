package org.example

import org.junit.Test
import kotlin.test.assertTrue

class PasswordKataTest {

    @Test
    fun moreThan8haracters(){
        val pwd = "123456789"
        var passwd = PasswordKata()
        assertTrue(passwd.temMaisDeOito())
    }
}