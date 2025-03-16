class Spice(name: String,val spiciness: String = "mild") {
    val heat: Int
        get() = if (spiciness == "mild") 50 else 100

    init {
        println("spiciness: $spiciness")
    }

    fun makeSalt() = Spice("Salt","mild")
}