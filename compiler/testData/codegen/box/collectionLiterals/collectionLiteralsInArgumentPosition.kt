// WITH_REFLECT

// IGNORE_BACKEND: JS

import java.util.Arrays
import kotlin.reflect.KClass
import kotlin.reflect.KFunction0

inline fun <reified T> test(kFunction: KFunction0<Unit>, test: T.() -> Unit) {
    val annotation = kFunction.annotations.single() as T
    annotation.test()
}

fun check(b: Boolean, message: String) {
    if (!b) throw RuntimeException(message)
}

@Suppress("UNSUPPORTED_FEATURE")
annotation class Foo(val a: FloatArray = [], val b: Array<String> = [], val c: Array<KClass<*>> = [])

@Suppress("UNSUPPORTED_FEATURE")
@Foo(a = [1f, 2f, 1 / 0f])
fun test1() {}

@Suppress("UNSUPPORTED_FEATURE")
@Foo(b = ["Hello", ", ", "Kot" + "lin"])
fun test2() {}

@Suppress("UNSUPPORTED_FEATURE")
@Foo(c = [Int::class, Array<Short>::class, Foo::class])
fun test3() {}

fun box(): String {
    test<Foo>(::test1) {
        check(a.contentEquals(floatArrayOf(1f, 2f, Float.POSITIVE_INFINITY)), "Fail 1: ${a.joinToString()}")
    }

    test<Foo>(::test2) {
        check(b.contentEquals(arrayOf("Hello", ", ", "Kotlin")), "Fail 2: ${b.joinToString()}")
    }

    test<Foo>(::test3) {
        check(c.contentEquals(arrayOf(Int::class, Array<Short>::class, Foo::class)), "Fail 3: ${c.joinToString()}")
    }

    return "OK"
}
