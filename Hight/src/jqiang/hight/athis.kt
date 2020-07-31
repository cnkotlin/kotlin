package jqiang.hight
class athis(){
    private var a:String="this is a"
    fun showclass(){
        println(this.javaClass)
    }
    fun seta(a:String): String {
        this.a=a
        return a
    }
    fun geta(): String {
        return this.a
    }
}
fun main(args:Array<String>){
    var athis=athis()
    athis.seta("this is test")
    print(athis.geta())
}
