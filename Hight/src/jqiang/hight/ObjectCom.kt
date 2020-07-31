package jqiang.hight

class ObjectCom{
    companion object Factory {
        fun create(): ObjectCom = ObjectCom()
    }
}

fun main(args: Array<String>) {
    val objectCom=ObjectCom.create()
}