package jqiang.Array
val arrayOfInt: IntArray = intArrayOf(1,2,3,4,5)
val arrayOfChar: CharArray = charArrayOf('H', 'e','l','l','o')
val arrayOfString: Array<String> = arrayOf("我", "爱", "Kotlin")
fun main(args: Array<String>) {
    //循环输出数组value
    for(String in arrayOfString){
        println(String)
    }
    //循环输出数组index
    for(index in arrayOfString.indices){
        println(index)
    }
    //循环输出数组index和value
    for ((index,value) in arrayOfString.withIndex()) {
        println("${index},${value}")
    }
  
}