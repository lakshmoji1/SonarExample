package org.example

class Hello
{
    fun getAge() : Int
    {
        return 10
    }

    /*
    Comments in the master branch for function sayHi
     */
    fun sayHi()
    {
        println("hello everyone hi")
    }

}


fun main() {
    println(Hello().getAge())
    Hello().sayHi()
}

