package jqiang.Null

fun main(args: Array<String>) {
    var address:String?="北京"
    if (address!=null){
        println("您填写的地址是:${address},等待进入下一步操作")
    }else{
        println("您没有填写地址,请补充收货地址在进行购买")
    }
}
/*运行结果
您填写的地址是:北京,等待进入下一步操作
*/