package jqiang.function
fun plus(a: Int , b: Int=0 ): Int {
    return a + b
}
fun main(args: Array<String>) {
    println(plus(5))
    println(plus(5,5))
}

