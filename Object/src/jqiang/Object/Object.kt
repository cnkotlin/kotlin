	package jqiang.Object

	class course (var name:String){
		init {
			println("您选择的课程名称是${name}")
		}
	}
	fun main(args: Array<String>) {
		val studentobj=course("Kotlin")
	}
	/*
	运行结果:您选择的课程名称是Kotlin
	*/