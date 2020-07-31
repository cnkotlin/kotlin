package jqiang.hight

data class  article(var id:Int,var name:String,var dec:String) {
    fun  equals(): Boolean {
        return true
    }
}

fun main(args: Array<String>) {
    var article=article(1,"Kotlin","全栈编程语言")
//    println(article.toString())//序列化
//    println(article.hashCode())//序列化
//    println(article.equals())//序列化

    var newName=article.copy(id =2 ,name = "JAVA", dec = "面向对象编程语言")
    println(newName.toString())//更改属性
    var (id,name,dec)=article
    println("${id},${name},${dec}")//解构
    println("${article.component1()},${article.component2()},${article.component3()}")//component方法
}