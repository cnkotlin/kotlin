	package jqiang.number

	val int:Int=8//声明十进制的整数
	val teint:Int=0x88888//声明十六进制的整数
	val maxint:Int= Int.MAX_VALUE//声明变量maxin,将Int类型的最大值赋值给maxint
	val minint:Int= Int.MIN_VALUE//声明变量minin,将Int类型的最小值赋值给minint

	val long:Long=128//声明十进制的长整型
	val maxlong:Long= Long.MAX_VALUE//声明变量maxlong,将Long类型的最大值赋值给maxlong
	val minlong:Long= Long.MIN_VALUE//声明变量minlong,将Long类型的最小值赋值给minlong

	val double:Double= 2.88//声明双精度double类型
	val maxdouble:Double= Double.MAX_VALUE//声明变量maxdouble,将Double类型的最大值赋值给maxdouble
	val mindouble:Double= Double.MIN_VALUE//声明变量mindouble,将Double类型的最小值赋值给mindouble

	val float:Float=2.0f//声明float类型
	val maxfloat:Float= Float.MAX_VALUE//声明变量maxfloat,将Float类型的最大值赋值给maxfloat
	val minfloat:Float= Float.MIN_VALUE//声明变量minfloat,将Float类型的最小值赋值给minfloat

	val maxshort:Short= Short.MAX_VALUE//声明变量maxshort,将Short类型的最大值赋值给maxshort
	val minshort:Short= Short.MIN_VALUE//声明变量minshort,将Short类型的最小值赋值给minshort

	val maxbyte:Byte= Byte.MAX_VALUE//声明变量maxbyte,将Byte类型的最大值赋值给maxbyte
	val minbyte:Byte= Byte.MIN_VALUE//声明变量minbyte,将Byte类型的最小值赋值给minbyte

	fun main(args:Array<String>){
		println("int十进制数值："+int)
		println("int十六进制数值："+teint)
		println("int最大值："+maxint)
		println("int最小值："+minint)

		println("long："+long)
		println("long最大值："+maxlong)
		println("long最小值："+minlong)

		println("double："+double)
		println("double最大值："+maxdouble)
		println("double最小值："+mindouble)

		println("float："+float)
		println("float最大值："+maxfloat)
		println("float最小值："+minfloat)

		println("short最大值："+maxshort)
		println("short最小值："+minshort)

		println("byte最大值："+maxbyte)
		println("byte最小值："+minbyte)
	}