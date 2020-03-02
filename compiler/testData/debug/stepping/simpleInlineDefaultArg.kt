// IGNORE_BACKEND: JVM_IR
// FILE: test.kt
inline fun alsoInline() = "OK"

inline fun ifoo(s: String = alsoInline()): String {
    return s
}

fun box(): String {
    return ifoo()
}

// LINENUMBERS
// test.kt:9
// test.kt:4
// test.kt:2
// test.kt:5
// test.kt:9x