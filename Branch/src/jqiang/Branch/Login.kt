package jqiang.Branch
fun main(args: Array<String>) {



    val getuname:String="Kotlin"
    val getpwd:String="password"

    when {
        getuname=="Kotlin" -> println("用户名正确")
        else -> println("用户名不存在")
    }



//    var getstatus:Boolean ?=true
//    var db= arrayListOf("Kotlin","password",1)
//    if (getuname!=db[0]) println("用户名错误")
//    if (getpwd!=db[1]) println("密码错误")
//    if (getuname==db[0] && getpwd==db[1]){
//        when(db[2]){
//            -1->{
//                println("该用户已删除")
//            }
//            0->{
//                println("该用户被禁用")
//            }
//            in 0..10->{
//                var str= if (getstatus!!) 1 else 0
//                if (str==1){
//                    println("登录成功,下次进入自动登录状态")
//                }else{
//                    println("登录成功,下次登录请重新输入账户密码")
//                }
//            }
//        }


//        if (db.get(2) == -1){
//            println("该用户已删除")
//        }else if (db[2]==0){
//            println("该用户被禁用")
//        }else{
//            var str= if (getstatus!!) 1 else 0
//            if (str==1){
//                println("登录成功,下次进入自动登录状态")
//            }else{
//                println("登录成功,下次登录请重新输入账户密码")
//            }
//        }
//    }

}