package jqiang.oop
open class Outer{
    private var a=1 //私有：当前类课件，最小的可见性
    protected  var b=2//保护，仅子类可见
    internal  var c=3//内部，当前模块可见
    open public var d =4//公开，完全可见
}
class subclass:Outer(){
    fun test(){
        println(super.b)
        println(super.c)
        println(super.d)
    }
}
class Unrelated(public val o:Outer){
    fun test(){
        println(o.c)
        println(o.d)
    }
}

fun main(args: Array<String>) {
    var subclass=subclass()
    subclass.test()
    var Unrelated=Unrelated(Outer())
    Unrelated.test()
}