package jqiang.hight
open class superfather {
    var a=10
     fun message () { println("this is class superfather fun") }

}
class son:superfather(){
    fun show(){
        super.message()
        println(super<superfather>.a)
        println("this is class son fun")
    }
}
fun main(args: Array<String>) {
    val son =  son()
    son.show();
}