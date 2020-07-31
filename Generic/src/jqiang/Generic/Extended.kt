package jqiang.function

/**
 * 扩展函数
 */
fun Int.square():Int{
    return this*this
}

//扩展函数和泛类型结合，求最大值
fun <T> Array<T> .ArrayMax (): T
    where T:Number,T:Comparable<T>
{
    var big=this[0]//假设第一个数最大
    for (i in 1..lastIndex){
        var em=this[i]
        if (em>big){
            big=em
        }
    }
    return big
}


fun main(args: Array<String>) {
    println(10.square())

    var a = arrayOf(1,2,3,4,5,6,7)
//    println(a.max())//系统取最大值

    println(a.ArrayMax())//取最大值


}