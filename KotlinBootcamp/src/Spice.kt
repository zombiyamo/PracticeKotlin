open class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() = if (spiciness == "mild") 50 else 100

    init {
        println("spiciness: $spiciness")
    }

    fun makeSalt() = Spice("Salt","mild")
}

class Curry(name: String, spiciness: String) : Spice(name, spiciness) {
    init {
        println("カレーを作成しました: $name (辛さ: $spiciness)")
    }
}