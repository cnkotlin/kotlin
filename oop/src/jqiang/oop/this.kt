package jqiang.oop

class athis(){
    init {

    }

    fun showClass() {
        println(this.javaClass)
    }

}

fun main(args: Array<String>) {
    var athis=athis()
    athis.showClass()
}