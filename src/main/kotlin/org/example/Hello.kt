package org.example

class Hello
{
    /*
        Comment for the getAge() in LakshmojiBranch
     */
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

    fun bymaster()
    {
        println("added in master branch")
    }

}
/*
Added a branch named LakshmojiBranch
 */
fun main() {
    println(Hello().getAge())
    Hello().sayHi()
}

