package jqiang.oop

open class SportObject(var name: String,var weight:Double ,var sex:String){
    open fun showMe() {
        if (this.weight>185){
           println("${this.name}，符合打篮球标准")
        }else{
            println("${this.name}，不符合打篮球标准")
        }
    }
}

class BeatBasketBall(name: String, weight: Double, public val height:Double, sex: String) : SportObject(name,weight,sex ){
    override fun showMe(){
        if (this.height <85){
            println("${this.name}，符合举重标准")
        }else{
            println("${this.name}，不符合举重标准")
        }
    }
}

fun main(args: Array<String>) {
    var Sport= SportObject("jqiang",100.0,"男")
    Sport.showMe()

    var BeatBasketBall= BeatBasketBall("jqiang",120.0,58.0,"男")
    BeatBasketBall.showMe()
}
