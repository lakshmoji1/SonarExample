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

    fun byRamoji()
    {
        println("function created by ramoji")
    }

}
/*
Added a branch named LakshmojiBranch
 */
fun main() {
    println(Hello().getAge())
    Hello().sayHi()
}

