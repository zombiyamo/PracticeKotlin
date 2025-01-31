fun main() {
    val spice = SimpleSpice()
    println("name: ${spice.spiceName} " + "spiciness: ${spice.heat}")
}

class SimpleSpice {
    val spiceName: String = "curry"
    val spiciness: String = "mild"
    val heat: Int
        get() = if (spiciness == "mild") 5 else 100
}