package jqiang.Mutual.Kotlin
import jqiang.Mutual.Java.SAMInJava
fun main(args: Array<String>) {
    var samJava=SAMInJava()
    val lamba={
        print("hello")
    }
    samJava.addTask(lamba)
    samJava.removeTask(lamba)
}