package jqiang.function

fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

fun main(args: Array<String>) {
    val a = arrayOf(1, 2, 3)
    val list = asList(-1, 0, *a, 4)
    println(list)
}