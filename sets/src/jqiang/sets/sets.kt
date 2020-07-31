package jqiang.sets

fun main(args: Array<String>) {
    val emptyset= emptySet<String>()//创建一个空的set
    val set= setOf(1,2,3)//创建一个普通的set
    val mset= mutableSetOf(1,2,3)//创建一个可变的set
    val hasset= hashSetOf(1,2,3)//创建一个hashset
    val linkset= linkedSetOf(1,2,3)//创建一个LinkedSet
    val sortset= sortedSetOf(1,2,3)//创建一个sortedSet
    println(mset)
    mset.add(4)
    println(mset)
    mset.remove(2)
    println(mset)

}