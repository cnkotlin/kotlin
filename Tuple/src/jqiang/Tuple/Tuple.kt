	package jqiang.Tuple
	fun main(args: Array<String>) {
        val (status,msg)=Pair(200,"Not Found")
        val (server,script,database)=Triple("tomcat","php","mysql")
        //访问php+mysql+tomact环境,反馈得到状态码是404,,表示不存在该文件
        println("方式一:访问${server}+${script}+${database}环境,反馈得到状态码是${status},表示${msg}")

        val http=Pair(200,"Not Found")
        val Development=Triple("tomcat","php","mysql")
        println("方式二:访问${Development.first}+${Development.second}+${Development.third},反馈得到状态码是${http.first},表示${http.second}")
	}