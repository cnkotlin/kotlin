package jqiang.hight

class Person{
    private var Name ="Kotlin"
    class Language{
        var list= arrayListOf("中文","英语","日语")
        var str=list.joinToString ()
    }
    inner class Names{
        fun changeName(newName:String){
            Name=newName
            println("您可以看到新的名字是${Name}")
        }
    }
}

fun main(args: Array<String>) {
    println(Person.Language().str)
    Person().Names().changeName("jqiang")
}