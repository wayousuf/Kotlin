/**
 * Created by waqas on 2/25/2018.
 */
private class privateExample{
    private val i = 1
    private fun doSomething() {
    }
}
open class AA {
    protected val i = 1
}
class BB: AA() {
    fun getValue(): Int {
        return i
    }
}

class internalExample {
    internal val i = 1
    internal fun doSomething() {
    }
}

class publicExample {
    val i = 1
    fun doSomething() {
    }
}

