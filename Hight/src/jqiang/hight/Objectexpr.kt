package jqiang.hight
open class A(x:Int){
    public  open  val y:Int=x
}
fun main(args: Array<String>) {
//    var ab:A=object :A(10){
//        override val y=15
//    }
    val ab=object{
        val x:Int=10
        val y:Int=15
    }
    println(ab.x+ab.y)
}
