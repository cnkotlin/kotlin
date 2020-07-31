package jqiang.Throwable
fun main(args: Array<String>) {
    var b:String?=null
    try {
        b?.length?:throw MyExcepttion("空值")
    }catch (e:MyExcepttion){
        println("e:${e.message}")
    }catch (N:NullPointerException){
        println("N:${N.message}")
    }finally {
        println("finally")
    }
}
class MyExcepttion(override val message: String) : Throwable() {}
