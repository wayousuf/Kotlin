fun main(args: Array<String>) {

    // Numbers
    var a : Int = 100000
    var d : Double = 100.00
    var f: Float = 100.00f
    var l: Long = 10000004
    var s : Short = 10
    var b: Byte = 1

    println("Your Int value is " + a)
    println("Your Double value is " + d)
    println("Your Float value is + " + f)
    println("Your Long value is " + l)
    println("Your Sort value is " + s)
    println("Your Byte value is " + b)

    //Characters
    val letterC: Char = 'A'
    println(letterC)

    val letterB: Boolean = true
    println(letterB)

    // String, two types of string
    var rawString: String = "I am raw String!"
    val escapedString: String = "I am escaped String\n"

    println("Hello! " + escapedString)
    println("Hey!! " + rawString)

    //Arrays
    val numbers: IntArray = intArrayOf(1,2,3,4,5)
    println("Hey!! I am array Example " + numbers[2])

    //Collections
    val mnumbers: MutableList<Int> = mutableListOf(1,2,3)
    val readOnlyView: List<Int> = mnumbers
    println("my immutable list-- " + mnumbers)
    mnumbers.add(4)

    println("my immutable list after addition-- " + mnumbers)
    println(readOnlyView)
    //readOnlyView.clear()

    // Filters
    var items = listOf(1,2,3,4,5)
    println("First Element of our list----- + " + items.first())
    println("Last element of our list------ + " + items.last())
    println("Even Numbers of our list------ " + items.filter { it % 2 == 0 })

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])

    val strings = hashSetOf("a", "b", "c", "d", "e")
    println("My Set values are " + strings)

    //Ranges
    val i: Int = 2
    for (j in 1..4)
        print(j)

    if (i in 1..10)
        println("we found your number -- " + i)
}


