// !DIAGNOSTICS: -UNUSED_VARIABLE

package a.b

class BatchInfo1(val batchSize: Int)
class BatchInfo2<T>(val data: T)

object Obj

fun test() {
    val a: Sequence<String> = sequence {
        val x = BatchInfo1::class
        val y = a.b.BatchInfo1::class
        val z = Obj::class
    }
}
