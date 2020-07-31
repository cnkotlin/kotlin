package jqiang.Mutual.Kotlin
import java.util.*
fun main(args: Array<String>) {
    val calendar=Calendar.getInstance()
    println(calendar.firstDayOfWeek)
    if(calendar.firstDayOfWeek==1){//调用getFirstDayOfWeek()方法
        calendar.firstDayOfWeek=2//调用setFirstDayOfWeek()方法
    }
    println(calendar.firstDayOfWeek)
}