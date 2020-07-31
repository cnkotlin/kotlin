package jqiang.Mutual.Kotlin
import java.util.*
fun demo(source:List<Int>){
    val list=ArrayList<Int>()
    for (item in list) {
        list.add(item)
    }
    for (i in 0..source.size-1) {
        list[i]=source[i]
    }
}