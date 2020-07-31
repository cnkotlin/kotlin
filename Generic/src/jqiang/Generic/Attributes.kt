package jqiang.Generic
//属性扩展
val Int.next:Int
    get()=this+1

//泛型和属性扩展： 圆的面积:πr2
val <T:Number>T.area:Double
    get()=3.1415926 * this.toDouble()* this.toDouble()

fun main(args: Array<String>) {
    println(3.next)
    println(4.5.area)
    println('B'.toByte().toDouble().area)
    println('B'.toByte().area)
    println(3.34.toByte().area)
}