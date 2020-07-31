package jqiang.Symbol

fun main(args: Array<String>) {

    val a=10
    println("shl:${a.shl(2)},shr:${a.shr(1)},ushr:${a.ushr(1)},and:${a.and(1)},or:${a.or(1)},xor:${a.xor(1)},inv:${a.inv()}")


////    一元操作符
//    var a=3
//    var b=-a
//    var c=a
////    println("原始值:${a} 负数值${b} 正值${c},加加${++a},减减${ --b}")
//
//
//    //运算操作符
//    var d=15
//    var e=10
//
////    println("加：${d + e},减${d - e},乘${d * e},除${d / e},取余${ d % e},加加${++d},减减${ --e}")
//
////    赋值运算符
//    var m=20
//    val n=15
////    m += n // m = m + n
////    m -= n // m = m - n
////    m *= n  // m = m * n
////    m /= n  // m = m */n
////    m %=n  // m = m % n
////    println("${m}")
//
//
//
////    比较运行算符号,结果返回的是True或flase

//    println("小于${ a<10 },大于${ a>10 } ,大于等于${a >=10 },小于等于${a <= 10},等于${a == 10},不等于${a != 10},恒等${a === 10},非恒等${a !== 10}")

////    逻辑操作符
    var q = false
    var r = true
    println("逻辑或${q || r}, 逻辑或${q or r}, 逻辑与${q && r},逻辑与${q and r},逻辑异或${q xor r},逻辑非${!r}")
}


