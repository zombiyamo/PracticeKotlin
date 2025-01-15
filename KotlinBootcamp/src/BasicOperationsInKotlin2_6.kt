// 2.6 Practice Basic Operations in Kotlin
fun main() {
    // Practice Time: Basic Operations
    println(2.plus(71).plus(233).minus(13).div(30).plus(1))

    // Practice Time: Variables
    var rainbowColor = "Orange"
    rainbowColor = "Pink"
    println(rainbowColor)

    val blackColor = "Black"
    // blackColor = "Purple" // Val cannot be reassigned

    // Practice Time: Nullability
    var pastelColor: String? = null
    val greenColor = null
    var blueColor: String? = null
    println("pastel color: $pastelColor")
    println("green color: $greenColor")
    println("blue color: $blueColor")

    // Practice Time: Nullability/Lists
    val list: List<String?> = listOf(null, null)
    var list2: List<String?> = listOf()
    list2 = listOf(null, null)
    var list3: List<String>? = null

    // Practice Time: Null Checks
    var nullTest: Int? = null
    println(nullTest?.inc() ?: 0)
    nullTest = 1
    println(nullTest?.inc() ?: 0)
}