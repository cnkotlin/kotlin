package jqiang.Jump
fun main(args: Array<String>) {
   var arrs= intArrayOf(1,2,3,4,5)
    for (arr in arrs) {
        if(arr==3)break
        println(arr)
    }
}