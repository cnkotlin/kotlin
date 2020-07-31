package jqiang.hight
sealed class fatherSealed
data class exSon(val number: Number):fatherSealed()
data class exsSon(var e1:fatherSealed,var e2:fatherSealed):fatherSealed()
object objects :fatherSealed()

fun main(args: Array<String>) {

}