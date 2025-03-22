data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}

fun main() {
    val spiceContainer = SpiceContainer(Curry("curry", "mild"))
    println(spiceContainer.label)
}
