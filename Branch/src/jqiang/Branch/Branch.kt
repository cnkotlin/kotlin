package jqiang.Branch

fun main(args: Array<String>) {




//    依次执行每一项
    var nums = arrayOf(1,2,3,4)
    for (num in nums) {
           println(num)
    }

//重复执行
    for (hh in 1..5){
        println("重要的事说5遍")
    }

//    while 适合执行未知次数的场合
//    从1加多少次加到2017
    var nub=1 //起始值
    var times=0 //次数
    var totle=0 //目标值
    while (totle < 2017){
        totle += nub
        nub += 1
        times += 1
    }
    println(times)


//  continue 结束本次循环 ,break 结束本次循环
    var numbs = arrayOf(1,2,3,4)
    for (numb in numbs) {
        if (numb == 3) continue
        println(numb)

    }
//    条件if...else...
    var a=false
    if (a){
        println("存在")
    }else{
        println("不存在")
    }
//      三目运算符
   var str= if (a) "存在" else 0
    println(str)

//    when
when (str){
    !in 0..10->{
        println("不在0到10区间")
    }
    is Int->{
        println("是int类型")
    }
    else->{
        println("超出区间外")
    }
}
//求和
    var limit=20
    var sum =0
    var i=1
    do {
        sum+=i
        i++
    }while (i<=limit)

    println(sum)


}