/**
 * Created by waqas on 2/25/2018.
 */
// constructors, two types, primary and secondary
open class ABC{
    open fun think() {
        print("Hey!! I am thinking")
    }
}

class BCD : ABC() {
    override fun think(){
        print("I am from child")
    }
}

fun main(args: Array<String>) {
    var a = BCD()
    a.think()
}