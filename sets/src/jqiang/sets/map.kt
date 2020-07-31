package jqiang.sets

fun main(args: Array<String>) {
//    val emptyMap= emptyMap<Int,String>()//创建一个空的map

//    val hasmap= hashMapOf(1 to "one",2 to "two",3 to "three")//创建一个hashmap
//    val sortmap= sortedMapOf(1 to "one",2 to "two",3 to "three")//创建一个sortedmap
//    map.forEach(::println)
    val map= mapOf(1 to "one",2 to "two",3 to "three")//创建一个普通的map
    val mmap= mutableMapOf(1 to "one",2 to "two",3 to "three")//创建一个可变的map

    println("映射中元素的数量"+map.size)
    println("Map元素中Key的集合"+map.keys.toList())
    println("Map元素中values的集合"+map.values.toList())
    println(map.entries)
    println(map.get(1))
    map.forEach { key, value -> println("Map中元素的键/值对的集合key: ${key} , value: ${value}") }
    map.forEach{ println("Map中元素的键/值对的集合 key: ${it.key} , value: ${it.value}") }
    if (!map.isEmpty()){
        println("map集合不为空")
    }
    if (map.containsKey(1)){
        println("Map是包含key值为1")
    }
    if (map.containsValue("one")){
        println("Map是包含value值为one")
    }
    println(mmap)
     mmap.put(4,"four")
    println(mmap)
    val addall= mapOf(5 to "five",6 to "six")
    mmap.putAll(addall)
    println(mmap)
    mmap.remove(1)
    println(mmap)
    mmap.clear()
    println(mmap)

}