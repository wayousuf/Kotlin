/**
 * Created by waqas on 2/25/2018.
 */
// Normal class
class myClass    {
    private var name: String = "Learning KTutorials"

    fun printMe(){
        println("You are at the best Learning website Named- $name")
    }
}

// nested class , it works are static
class OuterForNested {
    class Nested {
        fun foo() = "Welcome to The TutorialsPoint.com"
    }
}

// inner class, if inner class should be work as instance
class OuterForInner {
    private val welcomeMessage: String = "Welcome to the TutorialsPoint.com"
    inner class Nested {
        fun foo() = welcomeMessage
    }
}

interface Human {
    fun think()
}

fun main(args: Array<String>){
    var obj = myClass()
    obj.printMe()

    // Nested
    val demoForNested = OuterForNested.Nested().foo()
    println(demoForNested)

    // inner nested
    val demoForInner = OuterForInner().Nested().foo()
    println(demoForInner)

    // Anonymous Inner Class
    val programmer: Human = object:Human
    {
        override fun think() {
            println("I am an example of Anonymous Inner Class")
        }
    }
    programmer.think()
}

