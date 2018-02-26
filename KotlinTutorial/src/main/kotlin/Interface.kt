/**
 * Created by waqas on 2/25/2018.
 */
interface ExampleInterface {
    var myVar: Int
    fun absMethod(): String
    fun sayHello() = "Hello there"

    fun hello() {
        println("Hello there, Welcome to the Kotlin World")
    }
}

class InterfaceTemp : ExampleInterface {
    override var myVar: Int = 25
    override fun absMethod() = "Happy Learning"
}

interface A {
    fun printMe() {
        println("method of interface A")
    }
}

interface  B {
    fun printMeToo(){
        println("method of interface B")
    }
}

class multipleInterfaceExample: A, B

fun main(args: Array<String>) {
    val obj = InterfaceTemp()
    println("My Variable Value is = ${obj.myVar}")
    print("Calling hello() ")
    obj.hello()

    print("Message from the Website...")
    println(obj.absMethod())

    var mulObj = multipleInterfaceExample()
    mulObj.printMe()
    mulObj.printMeToo()
}

