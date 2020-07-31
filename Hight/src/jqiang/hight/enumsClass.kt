package jqiang.hight
enum class rainbow{
    赤,橙,黄,绿,青,蓝,紫
}
enum class corour(val rgb:Int){
    RED(0xFF0000),GREEN(0x00FF00),BLUE(0x0000FF)
}
enum class anonys{
    WATTING{
        override fun signal()=TALKIN
    },
    TALKIN{
        override  fun signal()=WATTING
    };
    abstract fun signal():anonys
}

fun main(args: Array<String>) {
    println(enumValues<rainbow>().joinToString { it.name })
    println(enumValueOf<corour>("RED").rgb)
    println(rainbow.values().joinToString())
    println(corour.GREEN)
    println(corour.valueOf("BLUE").name)
    println(corour.valueOf("BLUE").ordinal)//序号
    println(corour.values().joinToString{ it.name+":"+it.rgb})
    println(anonys.values().joinToString { it.name })
}

