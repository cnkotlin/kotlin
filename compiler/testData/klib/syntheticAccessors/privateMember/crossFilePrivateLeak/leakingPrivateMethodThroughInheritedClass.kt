// IGNORE_BACKEND: JS_IR

// FILE: A.kt
open class Parent {
    private fun x() = "OK"
}

class Child : Parent() {
    @Suppress("INVISIBLE_REFERENCE", "INVISIBLE_MEMBER")
    internal inline fun internalInlineMethod() = super.x()
}

// FILE: main.kt
fun box(): String {
    return Child().internalInlineMethod()
}
