
在Winowds系统下MS-DOS平台下运行该程序.
执行下面命令的时,将在同级目录下生成一个HelloKotlin.jar文件
kotlinc HelloKotlin.kt -include-runtime -d HelloKotlin.jar


命令详解：
-d表示用于指定编辑器输出,输出到HelloKotlin
-include-runtime表示包含kotlin的runtime library,这样输出的jar文件据包含并可以运行
当执行一下的命令之后,就成功的输出Hello Kotlin
java -jar HelloKotlin.jar