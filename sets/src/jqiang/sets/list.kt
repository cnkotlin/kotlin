package jqiang.sets

fun main(args: Array<String>) {

    val emptylist= emptyList<String>()//创建空的list
    val list = listOf<Int>(1,2,3)//创建一个普通的list
    val mlist= mutableListOf<Int>(1,2,3)//创建可修改的list




    val device1= listOf("显示器","键盘","鼠标","主机")
    val device2= listOf("联想笔记本","戴尔笔记本","外星人笔记本")
    val devices= listOf(device1,device2)
    println("取出index：${devices.indexOf(device1)}的value值：${devices.get(1)}取出最后一次出现的位置${devices.lastIndexOf(device2)}")
//    循环输出
    devices.forEach(::println)
    for (device in devices) {
        println(device)
    }



}


