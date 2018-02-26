/**
 * Created by waqas on 2/25/2018.
 */
// constructors, two types, primary and secondary

class Person(val firstname: String, var age: Int){
    var message: String = "Hey!!!"
    constructor(name: String, age: Int, _message: String):this(name,age) {
        message += _message
    }
}

fun main(args: Array<String>){
    val person1 = Person("Waqas",15,"Welcome to the example of Secondary constructor")
    println("First Name = ${person1.firstname}")
    println("Age = ${person1.age}")
    println("Message = ${person1.message}" )
}

