package jqiang.oop

class CaculatorNum(protected var num1:Int,private var num2:Int){
    public var operator:Char='+'//+-*/%
    fun getnum1() {
       println("${num1}")
    }
   internal fun getnum2(){
        println("${num2}")
    }
    fun caculatNum(){
        when(this.operator){
            '+'->{
                println("两个数相加：${this.num1+this.num2}")
            }
            '-'->{
                println("两个数相减：${this.num1-this.num2}")
            }
            '*'->{
                println("两个数相乘：${this.num1*this.num2}")
            }
            '/'->{
                println("两个数相除：${this.num1/this.num2}")
            }
        }
    }
}

fun main(args: Array<String>) {
    var CaculatorNum=CaculatorNum(100,20)
    CaculatorNum.operator='-'
//    CaculatorNum.num1;//error:受保护的变量无法直接访问和赋值
//    CaculatorNum.num2;//error：私有的变量无法直接访问和赋值
    CaculatorNum.getnum1();
    CaculatorNum.getnum2();
    CaculatorNum.caculatNum()
}