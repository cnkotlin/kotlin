package jqiang.hight

class Preson()
object Payroll{
    val all = arrayListOf<Preson>()
    fun show(){
        for (preson in all) {
            println(preson.toString())
        }
    }
}
fun main(args: Array<String>) {
    Payroll.all.add(Preson())
    Payroll.show()
}