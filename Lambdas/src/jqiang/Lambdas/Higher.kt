package jqiang.Lambdas
fun main(args: Array<String>) {
    val a= arrayOf(1,2,3,4,5)
    val b=a.map { "第${it}个" }
    for (s in b) {
//        println(s)
    }

//    filter 对集合进行赛选
    var c=0
//    var d = a.filter { it % 2 == 0 }.forEach {
//        c += it
//        println(c)
//    }
    var d = a.forEach {
        c += it
    }
    println(c)


//    for (i in d) {
//        println(i)
//    }



}