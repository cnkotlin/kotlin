package jqiang.sets

fun main(args: Array<String>) {



    val list1= listOf(1,2,3,4,5,6,7,8,9,10)
    println(list1.contains(14))
    println(list1.elementAt(4))
    println(list1.elementAtOrElse(14,{it+3}))
    println(list1.elementAtOrNull(14))
    println(list1.first())
    println(list1.first { it % 3 ==0 })
    println(list1.firstOrNull{it > 14})
    println(list1.indexOf(5))
    println(list1.indexOfFirst { it==14 })

    println(list1.lastOrNull { it==8 })
    println(list1.single { it==8 })
    println(list1.singleOrNull { it==8 })

////    生产操作符
//    println(list1.zip(list2))
//    println(list1.zip(list2){it1,it2->it1+it2})
//    println(list1.partition { it > 3 })
//    println(list1.plus(list2))
//    println(listOf(Pair(1,2),Pair(3,4)).unzip())

 //    顺序操作符
//    println(list1.reversed())
//    println(list1.sorted())
//    println(list1.sortedBy { it % 2  })
//    println(list1.sortedDescending())
//    println(list1.sortedByDescending { it % 2 })



//    val list1= listOf(1,2,3,4,5)
//    val list2= listOf(6,7,8,9,10)
////    映射操作符
//    println(list1.map { it+1 })
//    println(list1.mapIndexed { index, i -> index*i  })
//    println(list1.mapNotNull { it+5 })
//    println(listOf(list1,list2).flatMap { it->it })
//    println(listOf(list1.groupBy { if (it>3)"big" else "small"}))

//    val list= listOf(1,2,3,4,5,6,7,8,9,10)

////过滤操作
//    println(list.filter { it !=5 })
//
//    println(list.filterNot { it==5 } )
//
//    println(list.filterNotNull() )
//
//    println(list.take(4) )
//    println(list.takeLast(4))
//    println(list.takeLastWhile { it !!< 5 } )
//    println(list.drop(4) )
//    println(list.dropLastWhile { it==4 } )
//    println(list.dropWhile { it!!<4 } )
//    println(list.slice(listOf(1,2,3)) )



//    总数操作
//    println(list.any{it > 10})
//    println(list.all{it in 1..10})
//    println(list.sumBy { it*it })
//    println(list.min ())
//    println(list.minBy { it*it })

}