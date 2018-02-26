/**
 * Created by waqas on 2/25/2018.
 */
fun main(args: Array<String>) {
    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }
    print("Maximum of a or b is " +max)

    // As expression
    // val max = if (a > b) a else b

    val x:Int = 5
    when (x) {
        1 -> print("x = = 1")
        2 -> print("x = = 2")

        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
    when (x) {
        1,2 -> print(" Value of X either 1,2")

        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }

    var items = listOf(1, 2, 3, 4)
    for (i in items) println("values of the array"+i)

    items = listOf(1, 22, 83, 4)
    for ((index, value) in items.withIndex()) {
        println("the element at $index is $value")
    }

    // while, do while
    var i:Int = 0
    println("Example of while loop--")

    while (i <= 10) {
        print(i)
        i++
    }

    var r:Int = 10
    println("The value of X is--- " + doubleMe(r))

    println("Example of Break and Continue")
    myLabel@ for (index in 1..10) {
        if (index == 5) {
            println("I am inside if block with value$index\n--- hence it will close the operation")
            break@myLabel
        } else {
            println("I am inside else block with value $index")
            continue@myLabel
        }
    }
}
fun doubleMe(x: Int): Int {
    return x*2
}