package jqiang.datatype

fun main(args: Array<String>) {

    val a=10
    if (a is Int ) {
        println(a)
    }
    if (a !is Int ) {
        println(a)
    }

    val b:String?=a as? String
    println(b)
    val c=a.toDouble()
    println(c)

}