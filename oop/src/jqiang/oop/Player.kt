package jqiang.oop

open class Player(var name: String,var from:String) {
   open fun doing(){
       println("${name}在${from}做什么")
   }
}

class Basketballplayer(name:String="迈克尔·乔丹" ,from: String="美国") : Player( name ,from ){
    override fun  doing() {
        println("${name}在${from}打篮球")
    }
}

class footballplayer(name: String="里奥·安德列斯·梅西",from: String="巴西"):Player(name,from){
    override  fun  doing(){
        println("${name}在${from}踢足球")
    }
}



fun main(args: Array<String>) {
    var player=Player("jqiang","中国")
    player.doing()

    var Basketballplayer=Basketballplayer()
    Basketballplayer.doing()

    var footballplayer=footballplayer()
    footballplayer.doing()
}


