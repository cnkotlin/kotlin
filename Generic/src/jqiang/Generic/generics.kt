package jqiang.entrust

//自定义泛型函数
fun <T>  show(para:T){
    println(para)
}
//泛型约束   int类型和double数据类型进行求和
fun <T:Number> allSum(vararg numbers:T):Double{
    return numbers.sumByDouble { it.toDouble() }
}
//多重约束
fun <T>  big  ( list: Array<T>, threhold: T): List<T>
    where T:Number,T:Comparable<T>
{
    return list.filter { it >= threhold }.sorted()

}

fun main(args: Array<String>) {

    println(1)
    println("this is String")

    show(2)
    show("this is fun String")

    var sum= arrayOf(1,2,3,4,5,6,7,9,10).sum()
    println(sum)

   println(allSum(1,2,3,4,5,10.5))
    var a= arrayOf(1,2,3,45,6,7,9,10)
    println(big(a,3))

}