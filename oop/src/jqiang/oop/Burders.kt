package jqiang.oop

class Burders(var a:Boolean){
    init {
        if (this.a==true){
            this.show()
        }else{
            this.say()
        }
    }
    fun show(){
        println("show方法")
    }
    fun say(){
        println("say方法")
    }
}

fun main(args: Array<String>) {
  var b=Burders(false)

}