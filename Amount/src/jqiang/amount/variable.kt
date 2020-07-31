package jqiang.amount

var var1:String="Kotiln"
//var var2:Int?
var  var3:Int=10
var var4=5
    set(value) {
        if (value <= 5) field = value
    }
fun main(args:Array<String>){
    println("var1不重新赋值情况是"+var1)
    var1=var1+5.3
    println("var1的值是"+var1)
//    println("var3的值是"+var2)
    var3=var3+5
    println("var3的值是"+var3)
    var4=var4+5
    println("var4的值是"+var4)
}
/*运行结果
var1的值是Kotiln5.3
var3的值是15
var4的值是5
*/