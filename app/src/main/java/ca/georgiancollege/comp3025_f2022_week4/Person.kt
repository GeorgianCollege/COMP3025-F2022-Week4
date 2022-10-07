package ca.georgiancollege.comp3025_f2022_week4


class Person constructor(private val name: String, private val age: Int)
{
    val Name: String = name
    val Age: Int = age

    constructor() : this("Unknown", 0)

    fun saysHello(): String
    {
        return "$Name says Hello!"
    }
}