package jqiang.oop
/**
体重指数=体重（公斤)/身高（米）的平方 kg/m2
 */

 class PlayerObject (var name: String , var weight: Double, var height: Double){
    val BIM:String
    get() {
        var b= this.weight/Math.pow(this.height,2.0)
        if (b<=18.5){
            return "偏瘦"
        }else if(b in 18.5..23.9){
            return "正常"
        }else if(b in 24.0..27.9){
            return "过重"
        }else{
            return "肥胖"
        }
    }


}


//class PlayerObject{
//    var name :String= "zhiqiang"
////     get() = field.toUpperCase()
//        set
//    var weight=0.0
//         set
//    var height=0.0
//        set
//    var BIM: String = ""
//    get() {
//       var b= this.weight/Math.pow(this.height,2.0)
//        if (b<=18.5){
//            return "偏瘦"
//        }else if(b in 18.5..23.9){
//            return "正常"
//        }else if(b in 24.0..27.9){
//            return "过重"
//        }else{
//            return "肥胖"
//        }
//    }
//}

fun main(args: Array<String>) {
//    var Player=PlayerObject()
//    Player.name="jqiang"
//    Player.weight= 48.0//体重kg
//    Player.height= 1.60//身高m
    var Player=PlayerObject("jqiang", 48.0, 1.60 )
    println("您好${Player.name}，您的身高是${Player.height}米，体重是${Player.weight}公斤，您的身体状况为${Player.BIM}")

}

