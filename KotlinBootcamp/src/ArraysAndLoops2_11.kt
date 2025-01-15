import kotlin.math.pow

fun main() {
    val array = Array(7) { 1000.0.pow(it) }
    val sizes = arrayOf(
        "byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte"
    )
    for ((i, value) in array.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")
    }

    val numbers = arrayOf(11, 12, 13, 14, 15)
    val list: MutableList<String> = mutableListOf()
    for ((i, number) in numbers.withIndex()) {
        list.add(number.toString())
        println(list[i])
    }

    val dividableNumbers: MutableList<Int> = mutableListOf()
    for (i in 0..100 step 7) dividableNumbers.add(i)
    println(dividableNumbers.joinToString(","))
}