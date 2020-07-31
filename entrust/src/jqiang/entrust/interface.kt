package jqiang.entrust

interface database {
    var host:String
    var port:Int
    var database: String
    var user:String
    var password:String
    fun connect()
    fun operate()
    fun close()
    fun over(){
        println("成功关闭数据库")
    }
}
class mysql(override var host:String="127.0.0.1", override var port:Int=3306, override var database: String="demo", override var user: String ="sa", override var password:String="123"):database{

    override fun connect() {
        println("开始连接数据库...")
    }
    override fun operate(){
        println("操作${database}数据库...")
    }
     override fun close() {
        println("正在关闭${database}数据库连接...")
    }
}
fun main(args: Array<String>) {
    var mysql=mysql()
    println("您好，您的数据库地址是${mysql.host}:${mysql.port}，您的数据库是${mysql.database},用户名${mysql.user},密码：${mysql.password}")
    println(mysql.connect())
    println(mysql.operate())
    println(mysql.close())
    println(mysql.over())
}