package org.example

import junit.framework.TestCase

class HelloTest : TestCase() {

    fun testGetAge() {
        assertEquals(10,Hello().getAge())
    }
}